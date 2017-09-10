/**
*
* @author Andrea
*/
package market;

public class Proveedor {

private String Name;
private String[] Productos;
private Factura[] Facturas;
private int Cont;
private int deudas;

public Proveedor(String Name, String[] productos) {
this.Name = Name;
this.Cont = 0;
this.deudas = 0;
this.Productos = productos;
}

public String getName() {
return Name;
}

public String[] getProductos() {
return Productos;
}

public Factura[] getFacturas() {
return Facturas;
}

public int getCont(){
return Cont;
}

public void Generar_factura(int cod, String[] productos, int cant[], float [] costo, float valor,int plazo,boolean estado){
Factura factura = new Factura (cod,this.Name,productos,cant,costo,valor,plazo,estado);
this.Facturas[this.Cont]=factura;
this.Cont++;
}

public boolean Pagar_factura(int cod){
for(int i = 0; i < this.Cont ; i++){
if(this.Facturas[i].getCod() == cod){
    this.Facturas[i].Pagar_factura();  
    return true;
}
}
return false;
}

public void Eliminar_facturas(){
for(int i = 0; i < this.Cont ; i ++){
if(this.Facturas[i].getEstado()==true){
this.Facturas[i] = null;
}
}

}
public int Deudas(){
for(int i = 0; i < this.Cont ; i++){
if(this.Facturas[i].getEstado()==false){
this.deudas++;
}
}
return deudas;
}

}
