/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Service.PerpustakaanService;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        PerpustakaanService service = new PerpustakaanService();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Manajemen Perpustakaan Mini ===");
            System.out.println("1. Tambah buku");
            System.out.println("2. Lihat daftar buku");
            System.out.println("3. Update buku");
            System.out.println("4. Hapus buku");
            System.out.println("5. Cari buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = -1;
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1 -> service.tambahBuku();
                case 2 -> service.lihatBuku();
                case 3 -> service.updateBuku();
                case 4 -> service.hapusBuku();
                case 5 -> service.cariBuku();
                case 6 -> {
                    System.out.println("Terima kasih sudah menggunakan sistem perpus ini.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
    }
}