package com.testinium.atmapplication.musteri;

public class KurumsalMusteri extends Musteri {
    private String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi, String musteriNo, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, musteriNo);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return "KurumsalMusteri{" +
                "sirketAdi='" + sirketAdi + '\'' +
                "} " + super.toString();
    }
}
