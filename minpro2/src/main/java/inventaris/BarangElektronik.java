/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */
public final class BarangElektronik extends Barang {
    private final String brand;
    private int masaGaransi;

    public BarangElektronik(String name, int quantity, double price, String brand, int masaGaransi) {
        super(name, quantity, price);
        this.brand = brand;
        this.masaGaransi = masaGaransi;
    }

    public String getBrand() {
        return brand;
    }

    public int masaGaransi() {
        return masaGaransi;
    }

    public void setmasaGaransi(int masaGaransi) {
        this.masaGaransi = masaGaransi;
    }

    @Override
    public void displayItemInfo() {
        super.displayItemInfo();
        System.out.println("Merek: " + brand);
        System.out.println("Masa Garansi: " + masaGaransi + " bulan");
        System.out.println("----------------------");
    }
}