package com.Trzeci;

/**
 * Created by Mateusz on 2017-04-10.
 */
public class Program {
    public static void main(String[] args){
        Animal kot = new Cat();
        Animal pies = new Dog();
        Animal krowa = new Cow();

        kot.sound();
        pies.sound();
        krowa.sound();
        Cat kotek = new Cat();
        kotek.sound();

        Program p = new Program();
        p.max(5,10);
        p.max(5.4,10.6);

    }

    int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
