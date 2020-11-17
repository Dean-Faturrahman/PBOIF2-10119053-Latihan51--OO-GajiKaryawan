/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan51.oo.gajikaryawan;

import java.util.Scanner;
import model.Manager;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program gaji karyawan
 */
public class PBOIF210119053Latihan51OOGajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager; 
        manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : "); manager.setNik(input.nextLine());
        System.out.print("Masukkan Nama : "); manager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : "); manager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : "); manager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : "); manager.setKehadiran(input.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t: " + manager.getNik());
        System.out.println("NAMA \t: " + manager.getNama());
        System.out.println("GOLONGAN: " + manager.getGolongan());
        System.out.println("JABATAN\t: " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN \t: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }
    
}
