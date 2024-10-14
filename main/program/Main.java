/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.program;

/**
 *
 * @author rifqi
 */
import inventaris.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManajemenInventaris manager = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa item langsung
        Barang pakaian1 = new Pakaian("Kaos", 100, 150000, "L", "Katun");
        Barang elektronik1 = new BarangElektronik("Laptop", 10, 15000000, "Apple", 24);
        manager.addItem(pakaian1);
        manager.addItem(elektronik1);

        boolean running = true;
        while (running) {
            System.out.println("===== Sistem Inventaris Gudang =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Tampilkan Total Barang");
            System.out.println("5. Perbarui Barang");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah nextInt()

            if (choice == 1) {
                // Tambah Barang
                System.out.print("Nama Barang: ");
                String name = scanner.nextLine();
                System.out.print("Jumlah: ");
                int quantity = scanner.nextInt();
                System.out.print("Harga: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Konsumsi newline

                System.out.print("Ukuran (jika pakaian, kosongkan jika bukan): ");
                String ukuran = scanner.nextLine();
                System.out.print("Bahan (jika pakaian, kosongkan jika bukan): ");
                String bahan = scanner.nextLine();

                Barang newItem;
                if (!ukuran.isEmpty() && !bahan.isEmpty()) {
                    newItem = new Pakaian(name, quantity, price, ukuran, bahan);
                } else {
                    newItem = new Barang(name, quantity, price);
                }
                manager.addItem(newItem);  // Menambahkan item ke dalam inventaris
            } else if (choice == 2) {
                // Hapus Barang
                System.out.print("Nama Barang yang akan dihapus: ");
                String removeName = scanner.nextLine();
                manager.removeItem(removeName);
            } else if (choice == 3) {
                // Tampilkan Semua Barang
                manager.displayAllItems();
            } else if (choice == 4) {
                // Tampilkan Total Barang
                System.out.println("Total barang di inventaris: " + ManajemenInventaris.getTotalItems());
            } else if (choice == 5) {
                // Perbarui Barang
                System.out.print("Nama Barang yang akan diperbarui: ");
                String updateName = scanner.nextLine();
                System.out.print("Jumlah baru: ");
                int newQuantity = scanner.nextInt();
                System.out.print("Harga baru: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Konsumsi newline

                manager.updateItem(updateName, newQuantity, newPrice);
            } else if (choice == 6) {
                // Keluar
                running = false;
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }

        scanner.close();
    }
}