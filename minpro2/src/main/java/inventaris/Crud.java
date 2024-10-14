/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventaris;

/**
 *
 * @author rifqi
 */

public interface Crud {
    void addItem(Barang item);  
    void removeItem(String itemName); 
    void updateItem(String itemName, int newQuantity, double newPrice); 
    void displayAllItems();        
}