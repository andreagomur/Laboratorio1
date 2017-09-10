/*
/**
*
* @author Andre
 */
package market;

public class Factura {

    private int cod;
    private String Name_proveedor;
    private String[] thi;
    private int[] cant;
    private float[] costo;
    private float Valor;
    private int Plazo;
    private boolean Estado;

    public Factura(int cod, String Name_proveedor, String[] thi, int[] cant, float[] costo, float Valor, int Plazo, boolean Estado) {
        this.Name_proveedor = Name_proveedor;
        this.thi = thi;
        this.Valor = Valor;
        this.Plazo = Plazo;
        this.Estado = Estado;
        this.costo = costo;
        this.cant = cant;
        this.cod = cod;
    }

    public String getName_proveedor() {
        return Name_proveedor;
    }

    public String[] getThi() {
        return thi;
    }

    public int[] getCant() {
        return cant;
    }

    public float[] getCosto() {
        return costo;
    }

    public float getValor() {
        return Valor;
    }

    public int getPlazo() {
        return Plazo;
    }

    public boolean getEstado() {
        return Estado;
    }

    public int getCod() {
        return cod;
    }

    public void Pagar_factura() {
        this.Estado = true;
    }

}
