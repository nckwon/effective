package com.effective.ch02;

/**
 * Created by nckwon on 2017. 3. 12..
 */
public class NutrionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    public static class Builder implements IBuilder<NutrionFacts> {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }
        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public NutrionFacts build() {
            return new NutrionFacts(this);
        }
    }

    public NutrionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("servingSize:" + servingSize + ", serving:" + servings + ", calories:" + calories +
                ", fat:" + fat);
        return buffer.toString();
    }

    public static void main(String[] args) {
        NutrionFacts nutrionFacts = new Builder(10, 20).
                calories(30).fat(40).build();

        System.out.println(nutrionFacts.toString());

        Elvis.INSTANCE.leave();
    }

    public interface IBuilder<T> {
        public T build();
    }

    public enum Elvis {
        INSTANCE;

        public void leave() {
            System.out.println("Elvis leave");
        }
    }
}
