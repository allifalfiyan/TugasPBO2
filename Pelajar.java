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
public class Pelajar {
    private String nip, nama;
    private double nilaiUjian1, nilaiUjian2, nilaiTugas;

    public Pelajar(String nip, String n, double nu1, double nu2, double nt) {
        this.nip = nip;
        this.nama = n;
        this.nilaiUjian1 = nu1;
        this.nilaiUjian2 = nu2;
        this.nilaiTugas = nt;
    }

    public Pelajar() {
        this.nip = "000";
        this.nama = "Default";
        this.nilaiUjian1 = 0;
        this.nilaiUjian2 = 0;
        this.nilaiTugas = 0;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(double nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(double nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }
    
    public void infoDasar(){
        System.out.println("NIP\t\t: " + getNip());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Nilai Ujian 1\t: " + getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t: " + getNilaiUjian2());
        System.out.println("Nilai Tugas\t: " + getNilaiTugas());
    }
    
    public double nilaiAkhir() {
        double na = (getNilaiUjian1()*0.4) + (getNilaiUjian2()*0.4) + (getNilaiTugas()*0.2);
        return na;
    }
    
    public String isLulus() {
        String status;
        if (nilaiAkhir() >= 60){
            status = "Lulus";
        }
        else {
            status = "Tidak Lulus";
        }
        return status;
    }
    
    public void info(){
        System.out.println("Nilai Akhir\t: " + nilaiAkhir());
        System.out.println("Status Kelulusan: " + isLulus());
        System.out.println("");
    }
}
