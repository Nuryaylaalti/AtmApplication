package com.testinium.atmapplication;

import com.testinium.atmapplication.musteri.Musteri;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IslemSecimi {

    public Double girilenTutar() {
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextDouble();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println(("Lütfen bir sayı giriniz"));
        }
        return null;
    }

    public void paraYatırma(Musteri musteri) {
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        Double tutar = girilenTutar();
        if (tutar == null) {
            System.out.println("İşlem başarısız...");
            return;
        }

        Double bakiye = musteri.getHesapBakiyesi();
        if (tutar < 0) {
            System.out.println("Lütfen pozitif bir değer giriniz.");
        } else {
            musteri.setHesapBakiyesi(bakiye + tutar);
        }
        System.out.println("Güncel Bakiyeniz:" + musteri.getHesapBakiyesi());
    }

    public void paraCekme(Musteri musteri) {
        System.out.println("Çekmek istediğiniz miktarı giriniz:");
        Double tutar = girilenTutar();
        if (tutar == null) {
            System.out.println("İşlem başarısız...");
            return;
        }

        Double bakiye = musteri.getHesapBakiyesi();
        if (tutar > bakiye) {
            System.out.println("Yetersiz Bakiye.. \n İslem yapılamıyor.\n");
        } else if (tutar < 0) {
            System.out.println("Lütfen pozitif bir değer giriniz");
        } else {
            musteri.setHesapBakiyesi(bakiye - tutar);
        }

        System.out.println("Güncel Bakiyeniz:" + musteri.getHesapBakiyesi());

    }

}
