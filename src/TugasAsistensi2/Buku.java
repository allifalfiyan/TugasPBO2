/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi2;

/**
 *
 * @author Allif Alfiyan
 */
public class Buku {
    private String namaPengarang,judulBuku;
    private int tahunTerbit, cetakanKe;
    private double hargaJual;

    public Buku(String np, String jb, int tb, int ck, double hj) {
        this.namaPengarang = np;
        this.judulBuku = jb;
        this.tahunTerbit = tb;
        this.cetakanKe = ck;
        this.hargaJual = hj;
    }

    public Buku() {
        this.namaPengarang = "Tidak Ada";
        this.judulBuku = "Tidak Ada";
        this.tahunTerbit = 0;
        this.cetakanKe = 0;
        this.hargaJual = 0;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public void infoBuku(){
        System.out.println("Nama Pengarang\t: " + getNamaPengarang());
        System.out.println("Judul Buku\t: " + getJudulBuku());
        System.out.println("Tahun Terbit\t: " + getTahunTerbit());
        System.out.println("Cetakan Ke\t: " + getCetakanKe());
        System.out.println("Harga Jual\t: Rp" + getHargaJual());
        System.out.println("");
    }
    
}
