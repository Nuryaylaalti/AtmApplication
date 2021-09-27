package com.testinium.atmapplication.musteri;

public class BireyselMusteri extends Musteri {
    private String evAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi, String musteriNo, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, musteriNo);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        return "BireyselMusteri{" +
                "evAdresi='" + evAdresi + '\'' +
                "} " + super.toString();
    }
}
