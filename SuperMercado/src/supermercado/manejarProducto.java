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
public class manejarProducto {
 
    public Producto crearProducto(long id, String nombre, int cantidad, float costo, float precio, Date expiracion, Date fechaCompra){
        Producto producto = new Producto(id, nombre, cantidad, costo, precio, expiracion, fechaCompra);
        return producto;
    }
    
    public void modificarProducto(Producto producto, long id, String nombre, int cantidad, float costo, float precio, Date expiracion, Date fechaCompra){                
    }
    
    public void eliminarProducto(Producto producto){
        
    }
    
    public void comprarProducto(Producto producto){
    
    }
    
    public void venderProducto(Producto producto){
        
    }
    
    public float consultarPrecioCompra(Producto producto){
    return producto.getCosto();
    }
    
    public float consultarPrecioVenta(Producto producto){
    return producto.getPrecio();
    }
    
    public Date consultarFechaCompra(Producto producto){
    return producto.getFechaCompra();
    }

    public Date consultarFechaExpiracion(Producto producto){
    return producto.getExpiracion();
    }
    
    public int consultarUnidades(Producto producto){
        return producto.getCantidad();
    }

    
}
