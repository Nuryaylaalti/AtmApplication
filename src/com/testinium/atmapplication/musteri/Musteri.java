package com.testinium.atmapplication.musteri;

public class Musteri {

    private String tcKimlikNo;
    private String adSoyad;
    private double hesapBakiyesi;
    private String musteriNo;

    public Musteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi, String musteriNo) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNo = musteriNo;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "tcKimlikNo='" + tcKimlikNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                ", musteriNo='" + musteriNo + '\'' +
                '}';
    }

}

