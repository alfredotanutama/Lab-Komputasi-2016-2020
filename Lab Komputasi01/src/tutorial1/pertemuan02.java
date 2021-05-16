/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;
// mengimpor Scanner ke program
import java.util.Scanner;
/**
 *
 * @author Alfredo Tanutama
 */
public class pertemuan02 {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, NIM;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("===Pendataan Mahasiswa Universitas Sumatera Utara===");
        System.out.print("Nama Mahasiswa: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.next();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("NIM: ");
        NIM = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Nim:  " + NIM);
    }

}
