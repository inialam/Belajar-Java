package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // Operasi Aritmatika

        // 1. Penjumlahan
        // 2. Pengurangan
        // 3. Perkalian
        // 4. Pembagian
        // 5. Modulus

        // 1. Penjumlahan

        int variable1 = 6;
        int variable2 = 3;
        int hasil;

        hasil = variable1 + variable2;

        // System.out.println(hasil);
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // 2. Pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        // 3. Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d X %d = %d \n",variable1,variable2,hasil);

        // 4. Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        float a = 10;
        float b = 3;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // 5. Modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

    }
}