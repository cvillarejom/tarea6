/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6_ed;

/**
 *
 * @author Usuario
 */
public class CalculadorPrecio {
    
    private static final double DESCUENTO_EXTRA = 0.95;
    private static final double DESCUENTO_BASICO = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESCUENTO_BASICO;
            totalPagar(Total);
        }else {
            Total = precioProducto*DESCUENTO_EXTRA;
            totalPagar(Total);
        }   

    }

    
    private void totalPagar(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
