package com.tutorial;

public class Main {
    public static void main(String[] args) {

        //unary = operasi yang perlu dilakukan pada satu variable

        //unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);
        System.out.println("========================================");
        //unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " +angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " +angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai dengan '--' postfix menjadi = %d \n", b++);
        System.out.printf("tampilkan nilai a = %d \n", +b);
        System.out.println("=============================================");
        //unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean ucup = " + ucup);
        System.out.println("nilai boolean ucup = " + !ucup);
    }
}