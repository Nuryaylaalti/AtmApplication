package com.testinium.atmapplication;

import com.testinium.atmapplication.musteri.Musteri;

import java.util.Scanner;

public class HesapIslemleri {
    Scanner scan = new Scanner(System.in);

    public void islemSecimi(Musteri musteri) {
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1-Para Yatırma \n" +
                "2-Para Çekme");

        IslemSecimi islemSecimi = new IslemSecimi();
        String secim = scan.nextLine();
        if ("1".equals(secim)) {
            islemSecimi.paraYatırma(musteri);
        } else if ("2".equals(secim)) {
            islemSecimi.paraCekme(musteri);
        } else {
            System.out.println("Yanlıs işlem seçimi.");
        }

        yeniIslem(musteri);
    }

    private void yeniIslem(Musteri musteri) {
        System.out.println("Yeni bir işlem yapmak istiyor musunuz? e/h");
        String secim = scan.nextLine();
        switch (secim) {
            case "e":
                islemSecimi(musteri);
                break;
            case "h":
                System.out.println("Çıkış yapılıyor.");
                break;
            default:
                System.out.println("Yanlış işlem seçimi.");
                yeniIslem(musteri);
                break;
        }
    }

}




