/**
 *
 * @author Andre
 */
package market;

public class Producto {
// Atributos

    private String Name;
    private int cant;
    private float Costo;
    private float Precio;
    private int Ventas;
    private float Ingresos;
    private int Compras;
    private float Egreso;
    private float Ganancia;
    private boolean Estado;

    public Producto(String Name, int cant, float costo, float Precio) {
        this.Name = Name;
        this.cant = cant;
        this.Costo = costo;
        this.Precio = Precio;
        this.Ventas = 0;
        this.Ingresos = 0;
        this.Compras = 0;
        this.Egreso = 0;
        this.Ganancia = 0;
    }

    public String getName() {
        return Name;
    }

    public int getCant() {
        return cant;
    }

    public float getCosto() {
        return this.Costo;
    }

    public float getPrecio() {
        return Precio;
    }

    public int getVentas() {
        return Ventas;
    }

    public float getIngresos() {
        return Ingresos;
    }

    public int getCompras() {
        return Compras;
    }

    public float getEgreso() {
        return Egreso;
    }

    public float getGanancia() {
        setGanancia();
        return Ganancia;
    }

    public boolean getEstado() {
        setEstado();
        return Estado;
    }
// Setters

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCant(int cant, int a) {
        if (a == 0) {
            this.cant += cant;
        }
        if (a == 1) {
            this.cant = cant;
        }
    }

    public void setEstado() {
        if (this.cant == 0) {
            this.Estado = false;
        }

    }

    public void setVentas(int Ventas) {
        this.Ventas += Ventas;
    }

    public void setIngresos(float Ingresos) {
        this.Ingresos += Ingresos;
    }

    public void setCompras(int Compras) {
        this.Compras += Compras;
    }

    public void setEgreso(float Egreso) {
        this.Egreso += Egreso;
    }

    public void setGanancia() {
        this.Ganancia = this.Ingresos;
    }

}
