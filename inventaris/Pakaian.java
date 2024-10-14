/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */

public final class Pakaian extends Barang {
    private final String ukuran;
    private final String bahan;

    public Pakaian(String name, int quantity, double price, String ukuran, String bahan) {
        super(name, quantity, price);
        this.ukuran = ukuran;
        this.bahan = bahan;
    }

  
    public String getUkuran() {
        return ukuran;
    }

    public String getBahan() {
        return bahan;
    }

    @Override
    public void displayItemInfo() {
        super.displayItemInfo();
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Bahan: " + bahan);
        System.out.println("----------------------");
    }
}
