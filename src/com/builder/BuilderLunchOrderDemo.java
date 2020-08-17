package com.builder;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Letuce").dressign("mayo").meat("meat");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressign());
        System.out.println(lunchOrder.getMeat());
    }
}
