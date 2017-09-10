/**
 * @author Andre
 */
package market;

public class Tienda {

    private Producto[] Productos;
    private Proveedor[] Proveedores;
    private Emply[] Emplys;
    private String[] Jerarquia;
    private String[] Agotados;
    private int Ventas_totales;
    private int Ingreso_total;
    private int Compras_totales;
    private int Egreso_total;
    private int cant_productos;
    private int cant_proveedores;
    private int cant_Emplys;
    private int cant_agotados;
    private int cant_deudas;

    public Tienda() {
        this.Agotados = new String[500];
        this.Productos = new Producto[500];
        this.Proveedores = new Proveedor[400];
        this.Emplys = new Emply[7];
        this.Compras_totales = 0;
        this.Egreso_total = 0;
        this.Ingreso_total = 0;
        this.Ventas_totales = 0;
        this.cant_productos = 0;
        this.cant_proveedores = 0;
        this.cant_Emplys = 0;
        this.cant_agotados = 0;
        this.cant_deudas = 0;
    }

    public int getCant_productos() {
        return cant_productos;
    }

    public int getCant_proveedores() {
        return cant_proveedores;
    }

    public int getCant_Emplys() {
        return cant_Emplys;
    }

    public int getCant_agotados() {
        return cant_agotados;
    }

    public Producto[] getProductos() {
        return Productos;
    }

    public Proveedor[] getProveedores() {
        return Proveedores;
    }

    public Emply[] getEmplys() {
        return Emplys;
    }

    public String[] getJerarquia() {
        setJerarquia();
        return Jerarquia;
    }

    public int getVentas_totales() {
        return Ventas_totales;
    }

    public int getIngreso_total() {
        return Ingreso_total;
    }

    public int getCompras_totales() {
        return Compras_totales;
    }

    public int getEgreso_total() {
        return Egreso_total;
    }

    public String[] getAgotados() {
        setAgotados();
        return Agotados;
    }

    public void setJerarquia() {
        int cont = 0;
        int tamano = this.cant_productos;
        Producto[] auxiliar = this.Productos;
        while (tamano > 0) {
            String Mayor = null;
            int mayor = 0;
            for (int i = 0; i < tamano; i++) {
                if (auxiliar[i].getVentas() > mayor) {
                    mayor = auxiliar[i].getVentas();
                    Mayor = auxiliar[i].getName();
                }
            }
            this.Jerarquia[cont] = Mayor;
            cont++;
            for (int i = 0; i < tamano; i++) {
                if (auxiliar[i].getName().equals(Mayor)) {
                    auxiliar[i] = null;
                    auxiliar[i] = new Producto("x", 0, 0, 0);
                    i = tamano;
                }
            }
        }
    }

    public void setAgotados() {
        for (int i = 0; i < this.cant_productos; i++) {
            if (this.Productos[i].getEstado() == false) {
                this.Agotados[this.cant_agotados] = this.Productos[i].getName();
                this.cant_agotados++;
            }
        }
    }

    public String[] Generar_venta(String[] Name_producto, int[] cant, int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < this.cant_productos; j++) {
                if (this.Productos[j].getName().equals(Name_producto[i])) {
                }
                if (this.Productos[j].getCant() >= cant[i]) {
                    this.Productos[j].setCant(cant[i], 0);
                    this.Productos[j].setVentas(cant[i]);
                    this.Ventas_totales += cant[i];
                    this.Ingreso_total += cant[i] * this.Productos[j].getPrecio();
                    this.Productos[j].setIngresos(cant[i] * this.Productos[j].getPrecio());
                    a[i] = "Producto Vendido Exitosamente";
                } else {
                    a[i] = "cant insuficiente del producto";
                }
            }
        }
        return a;
    }

    public boolean Generar_Compra(int cod_factura, String Name_proveedor, String[] Productos, int[] cant, int n, int plazo, int Estado) {
        float Valor = 0;
        int contador = 0;
        boolean Estatus = false;
        float[] Valor_unico = new float[n];

        for (int u = 0; u < n; u++) {
            for (int o = 0; o < this.cant_productos; o++) {
                if (this.Productos[o].getName().equals(Productos[u])) {
                    contador++;
                }
            }
        }
        if (contador != n) {
            return false;
        }

        for (int i = 0; i < this.cant_proveedores; i++) {
            if (this.Proveedores[i].getName().equals(Name_proveedor)) {
                for (int a = 0; a < n; a++) {
                    for (int j = 0; j < this.cant_productos; i++) {
                        if (this.Productos[j].getName().equals(Productos[a])) {
                            this.Productos[j].setCant(cant[a], 1);
                            this.Productos[j].setCompras(cant[a]);
                            Valor_unico[a] = (this.Productos[j].getCosto()) * cant[a];
                            Valor += Valor_unico[a];
                            this.Compras_totales += cant[a];
                            this.Egreso_total += (this.Productos[j].getCosto()) * cant[a];
                            this.Productos[j].setEgreso((this.Productos[j].getCosto()) * cant[a]);
                        }
                    }
                }
                if (Estado == 1) {
                    Estatus = true;
                }
                this.Proveedores[i].Generar_factura(cod_factura, Productos, cant, Valor_unico, Valor, plazo, Estatus);
                return true;
            }
        }

        return false;
    }

    public boolean Anadir_Producto(String Name, int cant, float Costo, float Precio) {
        if (this.cant_productos < 500) {
            this.Productos[this.cant_productos] = new Producto(Name, cant, Costo, Precio);
            this.cant_productos++;
            return true;
        }
        return false;
    }

    public boolean Anadir_Proveedor(String Name_proveedor, String[] productos) {
        if (this.cant_proveedores < 400) {
            this.Proveedores[this.cant_proveedores] = new Proveedor(Name_proveedor, productos);
            this.cant_proveedores++;
            return true;
        }

        return false;
    }

    public boolean Anadir_Emply(String Name, int Time, float sueldo_minimo) {
        if (this.cant_Emplys < 7) {
            this.Emplys[this.cant_Emplys] = new Emply(Name, Time, sueldo_minimo);
            this.cant_Emplys++;
            return true;
        }
        return false;
    }

    public int getDeudas(int i) {
        return this.Proveedores[i].Deudas();
    }

    public boolean pagar_Factura(int cod, String Name) {
        for (int i = 0; i < this.cant_proveedores; i++) {
            if (this.Proveedores[i].getName().equals(Name)) {
                if (this.Proveedores[i].Pagar_factura(cod) == true) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void Eliminar_facturas() {
        for (int i = 0; i < this.cant_proveedores; i++) {
            this.Proveedores[i].Eliminar_facturas();
        }
    }
}
