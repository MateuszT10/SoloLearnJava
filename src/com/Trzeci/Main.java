package com.Trzeci;

import java.util.Scanner;

public class Main{
    private int wiek;
    private String color;
        public static void main(String[] args){
            Main obiekt = new Main();
            obiekt.setWiek(23);
            System.out.println(obiekt.getWiek());
        }
    //gettery i settery
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
}
