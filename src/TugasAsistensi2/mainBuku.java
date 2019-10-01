/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi2;

import java.util.Scanner;

/**
 *
 * @author Allif Alfiyan
 */
public class mainBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku nol = new Buku();
        Buku satu = new Buku();
        Buku dua = new Buku();
        Buku tiga = new Buku();
        
        satu.setNamaPengarang("Ahmad Fuadi");
        satu.setJudulBuku("Negeri 5 Menara");
        satu.setTahunTerbit(2009);
        satu.setCetakanKe(104);
        satu.setHargaJual(20000);
        
        dua.setNamaPengarang("Winna Efendi");
        dua.setJudulBuku("Refrain");
        dua.setTahunTerbit(2009);
        dua.setCetakanKe(13);
        dua.setHargaJual(46000);
        
        tiga.setNamaPengarang("Pramoedya Ananta Toer");
        tiga.setJudulBuku("Bumi Manusia");
        tiga.setTahunTerbit(2005);
        tiga.setCetakanKe(275);
        tiga.setHargaJual(40000);
        
        System.out.println("Buku manakah yang ingin anda ketahui infonya?(1-4)");
        System.out.println("1. Negri 5 Menara");
        System.out.println("2. Refrain");
        System.out.println("3. Bumi Manusia");
        System.out.println("4. Semua Buku \n");

        System.out.println("Contoh : ");
        System.out.println("Masukkan Nomor Buku : 4 \n");
        System.out.println("=================================================");
        Scanner kumbang = new Scanner(System.in);
        System.out.print("Masukkan Nomor Buku : ");
        int nomor = kumbang.nextInt();

        switch (nomor) {
            case 1:
                satu.infoBuku();
                break;
            case 2:
                dua.infoBuku();
                break;
            case 3:
                tiga.infoBuku();
                break;
            case 4:
                satu.infoBuku();
                dua.infoBuku();
                tiga.infoBuku();
                break;
            default : nol.infoBuku();
        }
    }
    
}
