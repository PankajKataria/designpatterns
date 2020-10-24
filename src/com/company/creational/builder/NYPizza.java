package com.company.creational.builder;

public class NYPizza extends Pizza{

    public static class Builder extends Pizza.Builder<Builder> {
        @Override
        protected Builder self() {
            return this;
        }

        public Builder(Double pir) {}
        public NYPizza build() {return new NYPizza(this);}
    }

    private NYPizza(Builder builder) {
        super(builder);
    }
}
