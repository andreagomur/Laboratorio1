/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Date;

/**
 *
 * @author Andre
 */
public class ManejarFactura {
    
    public Factura crearFactura(long codigo, String nombreProveedor, Producto[] productos,  Date plazo, float precio, String estado ){
    
        Factura factura = new Factura(codigo, nombreProveedor, productos, precio, plazo, estado);
        return factura;
    }
 
    public Factura[] consultarFacturas(Proveedor proveedor){
        return proveedor.getFacturas();        
    }
    
    public Factura[] consultarFacturasPagas(Proveedor proveedor){
        Factura[] facturasPaga = new Factura[100];
        
        Factura[] facturasTotal = proveedor.getFacturas();
        int j=0;
        
        for (int i=0; i< facturasTotal.length;i++){
            if (facturasTotal[i].getEstado().equalsIgnoreCase("Paga")){
                facturasPaga[j] = facturasTotal[i];
                j++;
            }
        }
        
        return facturasPaga;
    }
}
