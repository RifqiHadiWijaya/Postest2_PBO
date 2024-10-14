/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */
public final class BarangNonElektronik extends Barang {
    private final String material;

    public BarangNonElektronik(String name, int quantity, double price, String material) {
        super(name, quantity, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void displayItemInfo() {
        super.displayItemInfo();
        System.out.println("Bahan: " + material);
        System.out.println("----------------------");
    }
}
