package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // operator komparasi ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        //operator equal atau persamaan
        System.out.println("______PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d ----> %s \n",a,b,hasilKomparasi);

        //operator not equal atau pertidaksamaan
        System.out.println("______PERTIDAKSAMAAN");
        a = 10;
        b = 12;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ----> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d ----> %s \n",a,b,hasilKomparasi);

        //operator less atau kurang dari
        System.out.println("______KURANG DARI");
        a = 10;
        b = 12;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ----> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d ----> %s \n",a,b,hasilKomparasi);

        //operator greater than atau lebih dari
        System.out.println("______LEBIH DARI");
        a = 10;
        b = 12;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);

        a = 18;
        b = 14;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);

        //operator greater than atau lebih dari
        System.out.println("______LEBIH DARI");
        a = 10;
        b = 12;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);

        //operator greater than equal atau lebih dari sama dengan
        System.out.println("______LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);

        a = 12;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);

        a = 14;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d > %d ----> %s \n",a,b,hasilKomparasi);
    }
}