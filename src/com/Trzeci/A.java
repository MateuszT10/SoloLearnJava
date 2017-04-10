package com.Trzeci;

/**
 * Created by Mateusz on 2017-04-10.
 */
public class A {
    protected static int x = 1;
    protected int y = 1;

    public void foo() {
        System.out.println(x++ + "," + y++);
    }

    public void bar() {
        foo();
    }
}