package com.testinium.atmapplication.kullanici;
import com.testinium.atmapplication.musteri.BireyselMusteri;
import com.testinium.atmapplication.musteri.KurumsalMusteri;
import com.testinium.atmapplication.musteri.Musteri;

import java.util.HashMap;

    public class Musteriler {

        public static Musteri bireyselMusteri1(){
            return new BireyselMusteri("10876547630","selin yılmaz", 202.32d, "9843512","salı mah.");
        }
        public static Musteri bireyselMusteri2(){
            return new BireyselMusteri("10934257620","ilayda demci",8760d,"7620811","ugurlu mah.");
        }

        public static Musteri bireyselMusteri3(){
            return new BireyselMusteri("10934257621","esra bilgeç",6789.09d,"9843513", "seker mah.");
        }

        public static Musteri kurumsalMusteri1(){
            return new KurumsalMusteri("10934257622","Tünzile genç",0.0d,"9843514", "Pegasus Hava Yolları");
        }

        public static Musteri kurumsalMusteri2(){
            return new KurumsalMusteri("10934257623","Deniz Engin",7865.87d,"9843515", "Testinium");
        }

        public static HashMap<String, Musteri> musteriListesi() {
            HashMap<String, Musteri> musteriHashMap = new HashMap<String, Musteri>();
            musteriHashMap.put(Musteriler.bireyselMusteri1().getMusteriNo(), Musteriler.bireyselMusteri1());
            musteriHashMap.put(Musteriler.bireyselMusteri2().getMusteriNo(), Musteriler.bireyselMusteri2());
            musteriHashMap.put(Musteriler.bireyselMusteri3().getMusteriNo(), Musteriler.bireyselMusteri3());
            musteriHashMap.put(Musteriler.kurumsalMusteri1().getMusteriNo(), Musteriler.kurumsalMusteri1());
            musteriHashMap.put(Musteriler.kurumsalMusteri2().getMusteriNo(), Musteriler.kurumsalMusteri2());
            return musteriHashMap;
        }

    }

