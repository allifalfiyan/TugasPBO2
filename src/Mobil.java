/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allif Alfiyan
 */
public class Mobil {
    private String merk,warna,jenis;
    private int kapsin, jml;
    
    Mobil(){
        this.merk = "NONE";
        this.warna = "NONE";
        this.jenis = "NONE";
        this.kapsin = 0;
        this.jml = 0;
    }
    
    void setMerk(String m){
        this.merk = m;
    }
    
    void setWarna(String w){
        this.warna = w;
    }
    
    void setJenis(String j){
        this.jenis = j;
    }
    
    void setKapsin(int k){
        this.kapsin = k;
    }
    
    void setJumlah(int n){
        this.jml = n;
    }
    
    String getMerk(){
        return this.merk;
    }
    
    String getWarna(){
        return this.warna;
    }
    
    String getJenis(){
        return this.jenis;
    }
    
    int getKapsin(){
        return this.kapsin;
    }
    
    int getJumlah(){
        return this.jml;
    }
    
    void infoMobil(){
        System.out.println("_________________________________________________");
        System.out.println("Merk Mobil\t\t: " + getMerk());
        System.out.println("Warna Mobil\t\t: " + getWarna());
        System.out.println("Jenis Mobil\t\t: " + getJenis());
        System.out.println("Kapasitas Mesin Mobil\t: " + getKapsin());
        System.out.println("Jumlah Mobil\t\t: " + getJumlah());
    }
}
