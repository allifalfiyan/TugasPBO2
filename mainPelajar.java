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
public class mainPelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelajar nol = new Pelajar();
        Pelajar satu = new Pelajar();
        Pelajar dua = new Pelajar();
        Pelajar tiga = new Pelajar();
        
        satu.setNip("001");
        satu.setNama("Abdul Qadir");
        satu.setNilaiUjian1(95);
        satu.setNilaiUjian2(80);
        satu.setNilaiTugas(85);
        
        dua.setNip("002");
        dua.setNama("Bagus Purnomo");
        dua.setNilaiUjian1(55);
        dua.setNilaiUjian2(70);
        dua.setNilaiTugas(50);
        
        tiga.setNip("003");
        tiga.setNama("Sandika Pratama");
        tiga.setNilaiUjian1(30);
        tiga.setNilaiUjian2(72);
        tiga.setNilaiTugas(90);
        
        System.out.println("Pelajar manakah yang ingin anda ketahui Nilainya?(1-4)");
        System.out.println("1. Abdul Qadir");
        System.out.println("2. Bagus Purnomo");
        System.out.println("3. Sandika Pratama");
        System.out.println("4. Semua Pelajar \n");

        System.out.println("Contoh : ");
        System.out.println("Masukkan Nomor Absensi : 1 \n");
        System.out.println("=================================================");
        Scanner kumbang = new Scanner(System.in);
        System.out.print("Masukkan Nomor Pelajar : ");
        int nomor = kumbang.nextInt();

        switch (nomor) {
            case 1:
                satu.infoDasar();
                satu.info();
                break;
            case 2:
                dua.infoDasar();
                dua.info();
                break;
            case 3:
                tiga.infoDasar();
                tiga.info();
                break;
            case 4:
                System.out.println("1.");
                satu.infoDasar();
                satu.info();
                System.out.println("2.");
                dua.infoDasar();
                dua.info();
                System.out.println("3.");
                tiga.infoDasar();
                tiga.info();
                break;
            default : 
                nol.infoDasar();
        }
    
    }
    
}
