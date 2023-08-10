package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, islem;

        System.out.println("İlk Sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("İkinci Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz ");
        System.out.println("Toplama için 1 \n Çıkartma için 2 \n Çarpma için 3 \n Bölme için 4 giriniz.");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println(sayi1+sayi2);
                break;

            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("Bir sayı sıfır'a bölünemez");
                }else {
                    System.out.println(sayi1/sayi2);
                }

                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }

    }
}
