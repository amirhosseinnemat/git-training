package com.sample;

public class GenericClass<T> {
    T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public void showType(){
        System.out.println(t.getClass().getName());
    }
}
