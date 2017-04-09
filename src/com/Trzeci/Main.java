package com.Trzeci;

import java.util.Scanner;

public class Main{
    private int wiek;
    private String color;
    public static int LICZNIK;
    Main(){
        wiek = 23;
        color = "Niebieski";
        LICZNIK++;
    }
    Main(int w){
        wiek=w;
        LICZNIK++;
    }
    public static void main(String[] args){
        Main a = new Main();
        Main b = new Main(24);
        System.out.println(a.getWiek());
        System.out.println(b.getWiek());
        System.out.println("Liczba obiektow to " +  LICZNIK);
    }
    //gettery i settery
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }

}
