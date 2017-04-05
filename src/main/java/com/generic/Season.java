package com.generic;

/**
 * Created by nckwon on 2017. 4. 2..
 */

final class Season extends Enum<Season> {
    /**
     * Sole constructor.  Programmers cannot invoke this constructor.
     * It is for use by code emitted by the compiler in response to
     * enum type declarations.
     *
     * @param name    - The name of this enum constant, which is the identifier
     *                used to declare it.
     * @param ordinal - The ordinal of this enumeration constant (its position
     *                in the enum declaration, where the initial constant is assigned
     */
    private Season(String name, int ordinal) {
        super(name, ordinal);
    }

    public static final Season WINTER = new Season("WINTER", 0);
    public static final Season SPRING = new Season("SPRING", 1);
    public static final Season SUMMER = new Season("SUMMER", 2);
    public static final Season FALL = new Season("FALL", 3);

    private static final Season[] VALUES = { WINTER, SPRING, SUMMER, FALL};
    public static Season[] values() {
        return VALUES.clone();
    }

    public static Season valueOf(String name) {
        for (Season e : VALUES)
            if (e.name().equals(name))
                return e;

        throw new IllegalArgumentException();
    }
}
