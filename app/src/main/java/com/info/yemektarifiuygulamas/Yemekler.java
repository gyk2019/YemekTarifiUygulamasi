package com.info.yemektarifiuygulamas;

import java.io.Serializable;

public class Yemekler implements Serializable {
    private String yemek_key;
    private String yemek_resim_url;
    private String yemek_resim_ad;
    private String yemek_adi;
    private String yemek_tarif;

    public Yemekler() {
    }

    public Yemekler(String yemek_key, String yemek_resim_url, String yemek_resim_ad, String yemek_adi, String yemek_tarif) {
        this.yemek_key = yemek_key;
        this.yemek_resim_url = yemek_resim_url;
        this.yemek_resim_ad = yemek_resim_ad;
        this.yemek_adi = yemek_adi;
        this.yemek_tarif = yemek_tarif;
    }

    public String getYemek_key() {
        return yemek_key;
    }

    public void setYemek_key(String yemek_key) {
        this.yemek_key = yemek_key;
    }

    public String getYemek_resim_url() {
        return yemek_resim_url;
    }

    public void setYemek_resim_url(String yemek_resim_url) {
        this.yemek_resim_url = yemek_resim_url;
    }

    public String getYemek_resim_ad() {
        return yemek_resim_ad;
    }

    public void setYemek_resim_ad(String yemek_resim_ad) {
        this.yemek_resim_ad = yemek_resim_ad;
    }

    public String getYemek_adi() {
        return yemek_adi;
    }

    public void setYemek_adi(String yemek_adi) {
        this.yemek_adi = yemek_adi;
    }

    public String getYemek_tarif() {
        return yemek_tarif;
    }

    public void setYemek_tarif(String yemek_tarif) {
        this.yemek_tarif = yemek_tarif;
    }
}
