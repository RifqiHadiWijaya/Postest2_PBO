/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenInventaris implements Crud {
    private ArrayList<Barang> itemList; // Menggunakan ArrayList untuk menyimpan barang
    private static int totalItems = 0;  // Static keyword untuk melacak total barang

    public ManajemenInventaris() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void addItem(Barang item) {
        itemList.add(item);
        totalItems++;
        System.out.println("Item berhasil ditambahkan: " + item.getName());
    }

    @Override
    public void removeItem(String itemName) {
        Iterator<Barang> iterator = itemList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Barang item = iterator.next();
            if (item.getName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                totalItems--;
                found = true;
                System.out.println("Item berhasil dihapus: " + itemName);
                break;
            }
        }

        if (!found) {
            System.out.println("Item tidak ditemukan: " + itemName);
        }
    }

    @Override
    public void updateItem(String itemName, int newQuantity, double newPrice) {
        boolean found = false;

        for (Barang item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);
                found = true;
                System.out.println("Item berhasil diperbarui: " + itemName);
                item.displayItemInfo();
                break;
            }
        }

        if (!found) {
            System.out.println("Item tidak ditemukan: " + itemName);
        }
    }

    @Override
    public void displayAllItems() {
        if (itemList.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("Daftar Barang di Inventaris:");
            for (Barang item : itemList) {
                item.displayItemInfo();
            }
        }
    }

    public static int getTotalItems() {
        return totalItems;
    }
}