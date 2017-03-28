package com.effective.ch67;

import com.effective.ch16.ForwardingSet;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nckwon on 2017. 3. 26..
 */
public class ObservableSet<E> extends ForwardingSet<E>{

    private final List<SetObserver<E>> observers =
            new ArrayList<SetObserver<E>>();

    public ObservableSet(Set<E> s) {
        super(s);
    }

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    private void notifyElementAdded(E element) {
        synchronized (observers) {
            for (SetObserver<E> observer : observers) {
                observer.added(this, element);
            }
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element);
        return result;
    }

    public interface SetObserver<E> {
        void added(ObservableSet<E> set, E element);
    }

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {
            public void added(final ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
//                if (element == 23)
//                    set.removeObserver(this);

                if (element == 23) {
                    ExecutorService executorService =
                            Executors.newSingleThreadExecutor();
                    final SetObserver<Integer> observer = this;

                    try {
                        executorService.submit(new Runnable() {
                            public void run() {
                                set.removeObserver(observer);
                            }
                        }).get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } finally {
                        executorService.shutdown();
                    }
                }
            }
        });


        for (int i=0; i<100; i++) {
            set.add(i);
        }
    }

}
