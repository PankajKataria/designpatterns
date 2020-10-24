package com.company.creational.builder;
import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {ONION, MUSHROOM};
    private Double price;
    Set<Topping> toppings;

    public abstract static class Builder<T extends Pizza.Builder<T>> { // covariant return typing
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addToppings (Topping top) {
            toppings.add(top);
            return self();
        }

        abstract Pizza build();
        protected abstract T self();
    }

    Pizza (Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
