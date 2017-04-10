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
    }
}
