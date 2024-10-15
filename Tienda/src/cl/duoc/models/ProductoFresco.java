/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class ProductoFresco extends Producto {
    private float temperaturaFresca;



    public ProductoFresco(float temperaturaFresca, String idProducto, String nombre, double precio, int stock) {
        super(idProducto, nombre, precio, stock);
        this.temperaturaFresca = temperaturaFresca;
    }

    public float getTemperaturaFresca() {
        return temperaturaFresca;
    }

    public void setTemperaturaFresca(float temperaturaFresca) {
        this.temperaturaFresca = temperaturaFresca;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "temperaturaFresca=" + temperaturaFresca + '}';
    }

    @Override
    public void descontarStock(int cantidad){
        
    }

    @Override
    public int stockProducto() {
        return super.getStock();
    }
    
    
    
    
    
}
