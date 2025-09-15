/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Buku;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PerpustakaanService {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Create
    public void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String penulis = input.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahun = validasiAngka();

        Buku buku = new Buku(judul, penulis, tahun);
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    // Read
    public void lihatBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang tersimpan.");
        } else {
            System.out.println("\n=== Daftar Buku ===");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i));
            }
        }
    }

    // Update
    public void updateBuku() {
        lihatBuku();
        if (daftarBuku.isEmpty()) return;

        System.out.print("Masukkan nomor buku yang ingin diupdate: ");
        int idx = validasiAngka();
        if (idx <= 0 || idx > daftarBuku.size()) {
            System.out.println("Nomor buku tidak valid!");
            return;
        }

        System.out.print("Masukkan judul baru: ");
        String judulBaru = input.nextLine();
        System.out.print("Masukkan penulis baru: ");
        String penulisBaru = input.nextLine();
        System.out.print("Masukkan tahun terbit baru: ");
        int tahunBaru = validasiAngka();

        Buku buku = daftarBuku.get(idx - 1);
        buku.setJudul(judulBaru);
        buku.setPenulis(penulisBaru);
        buku.setTahunTerbit(tahunBaru);

        System.out.println("Buku berhasil diupdate!");
    }

    // Delete
    public void hapusBuku() {
        lihatBuku();
        if (daftarBuku.isEmpty()) return;

        System.out.print("Masukkan nomor buku yang ingin dihapus: ");
        int idx = validasiAngka();
        if (idx <= 0 || idx > daftarBuku.size()) {
            System.out.println("Nomor buku tidak valid!");
            return;
        }

        daftarBuku.remove(idx - 1);
        System.out.println("Buku berhasil dihapus!");
    }

    // Fitur pencarian
    public void cariBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang tersimpan.");
            return;
        }

        System.out.print("Masukkan judul/penulis yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().toLowerCase().contains(keyword) ||
                buku.getPenulis().toLowerCase().contains(keyword)) {
                System.out.println(buku);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    // Fitur validasi input angka
    private int validasiAngka() {
        while (!input.hasNextInt()) {
            System.out.print("Input harus berupa angka, coba lagi: ");
            input.next();
        }
        int angka = input.nextInt();
        input.nextLine();
        return angka;
    }
}
