package com.singleton;

public class SingletonRuntime {
    public static void main(String[] args) {
        Runtime singleTon = Runtime.getRuntime();
        singleTon.gc();
        System.out.println(singleTon);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if (singleTon == anotherInstance){
            System.out.println("same");
        }
    }
}
