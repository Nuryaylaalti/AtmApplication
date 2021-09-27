package com.testinium.atmapplication;


import com.testinium.atmapplication.kullanici.Musteriler;
import com.testinium.atmapplication.musteri.Musteri;

import java.util.HashMap;
import java.util.Scanner;

public class SistemGiris {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz. Müşteri no giriniz..");

        Musteri musteri = musteriNoGir();
        System.out.println("Müsteri Bilgileri: " + musteri);

        HesapIslemleri hesapIslemleri = new HesapIslemleri();
        hesapIslemleri.islemSecimi(musteri);
    }

    public static Musteri musteriNoGir() {
        String musteriNo = scan.nextLine();
        HashMap<String, Musteri> musteriListesi = Musteriler.musteriListesi();
        if (!musteriListesi.isEmpty() && musteriListesi.containsKey(musteriNo)) {
            return Musteriler.musteriListesi().get(musteriNo);
        } else {
            System.out.println("Böyle bir müşteri bulunmamaktadır.\n" +
                    "Lütfen varolan bir müşteri no giriniz");
        }
        return musteriNoGir();
    }
}
