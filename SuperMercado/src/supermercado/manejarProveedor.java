/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Andre
 */
public class manejarProveedor {
    
    public void crearProveedor(String nombre, Producto[] productos){        
    }
    
    public void modificarProveedor(Proveedor proveedor, String nombre, Producto[] productos){       
    }
    
    public void eliminarProveedor(Proveedor proveedor){       
    }
    
    public Producto[] consultarProducto(Proveedor proveedor){    
        
        return proveedor.getProductos();
    }
    
    public Factura crearPedido(Producto[] productos, Proveedor proveedor){
        return null;        
    }
    
}
