
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Allif Alfiyan
 */
public class TesMobil {

    public static void main(String[] args) {
        Mobil Satu = new Mobil();
        Mobil Dua = new Mobil();
        Mobil Tiga = new Mobil();
        Mobil Empat = new Mobil();

        Satu.setMerk("Toyota");
        Satu.setWarna("Biru");
        Satu.setJenis("Minibus");
        Satu.setKapsin(2000);
        Satu.setJumlah(7);

        Dua.setMerk("Daihatsu");
        Dua.setWarna("Hitam");
        Dua.setJenis("Pick Up");
        Dua.setKapsin(1500);
        Dua.setJumlah(2);

        Tiga.setMerk("Suzuki");
        Tiga.setWarna("Silve");
        Tiga.setJenis("SUV");
        Tiga.setKapsin(1800);
        Tiga.setJumlah(5);

        Empat.setMerk("Honda");
        Empat.setWarna("Merah");
        Empat.setJenis("Sedan");
        Empat.setKapsin(1300);
        Empat.setJumlah(5);

        System.out.println("Mobil manakah yang ingin anda ketahui infonya?(1-5)");
        System.out.println("1. Mobil 1");
        System.out.println("2. Mobil 2");
        System.out.println("3. Mobil 3");
        System.out.println("4. Mobil 4");
        System.out.println("5. Semua Mobil \n\n");

        System.out.println("Contoh : ");
        System.out.println("Masukkan Nomor Mobil : 4 \n");
        System.out.println("_________________________________________________");
        Scanner kumbang = new Scanner(System.in);
        System.out.print("Masukkan Nomor Mobil : ");
        int nomor = kumbang.nextInt();

        switch (nomor) {
            case 1:
                Satu.infoMobil();
                break;
            case 2:
                Dua.infoMobil();
                break;
            case 3:
                Tiga.infoMobil();
                break;
            case 4:
                Empat.infoMobil();
                break;
            case 5:
                Satu.infoMobil();
                Dua.infoMobil();
                Tiga.infoMobil();
                Empat.infoMobil();
                break;

        }
    }

}
