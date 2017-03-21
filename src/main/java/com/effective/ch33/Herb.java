package com.effective.ch33;

import java.util.*;

/**
 * Created by nckwon on 2017. 3. 22..
 */
public class Herb {

    enum Type { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {

        Herb herb1 = new Herb("1", Type.ANNUAL);
        Herb herb2 = new Herb("2", Type.BIENNIAL);
        Herb herb3 = new Herb("1", Type.PERENNIAL);

        Herb[] garden = new Herb[] {herb1, herb2, herb3};
        Map<Herb.Type, Set<Herb>> herbsByType =
                new EnumMap<Type, Set<Herb>>(Herb.Type.class);

        for (Herb.Type t : Herb.Type.values())
            herbsByType.put(t, new HashSet<Herb>());
        for (Herb h : garden)
            herbsByType.get(h.type).add(h);

        System.out.println(herbsByType);
    }
}
