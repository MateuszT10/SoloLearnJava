package com.Trzeci;

import java.util.Scanner;

public class Main{
    private int wiek;
    private String color;
        public static void main(String[] args){
            int[] arr = {1,2,3,4,5};
                System.out.println("arr[2] " + arr[2]);
                System.out.println("Wielkosc tablicy " + arr.length);
            int multi[][] = {{1,2,3},{4,5,6}};
            System.out.println("multi[1][1]) = " + multi[1][1]);

            Main obiekt = new Main();
             //gettery i settery

        }
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        this.wiek = wiek;
    }
}
