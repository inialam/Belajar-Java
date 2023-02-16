package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Program untuk konversi data
        int nilaiInt = 20;
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        int nilaiLong = nilaiInt;
        System.out.println("nilai long = " +nilaiLong);

        //Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaibyte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaibyte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f \n",a,b,c );

        int x = 20;
        int y = 3;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);

    }
}