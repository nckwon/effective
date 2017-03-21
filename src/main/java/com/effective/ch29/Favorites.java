package com.effective.ch29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nckwon on 2017. 3. 21..
 */
public class Favorites {

    private Map<Class<?>, Object> favorites =
            new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null)
            throw new NullPointerException("Type is null");

        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xbebe);
        int integer = f.getFavorite(Integer.class);
        System.out.printf("%i" + integer);
    }
}
