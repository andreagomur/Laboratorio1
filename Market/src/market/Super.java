/**
 *
 * @author Andre
 */
package market;

import java.util.Scanner;

public class Super {

    public static void main(String[] args) {

        int opcion = 0;
        Tienda tienda = new Tienda();
        Scanner in = new Scanner(System.in);
        System.out.println("super");
        while (opcion != 5) {
            System.out.println("Menu");
            System.out.println("1. Agotados");
            System.out.println("2. Existentes");
            System.out.println("3. Proveedores");
            System.out.println("4. Empleados");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agotados");
                    System.out.println("cant : " + tienda.getCant_agotados());
                    System.out.println("Lista de agotados");
                    String[] A = tienda.getAgotados();
                    for (int i = 0; i < tienda.getCant_agotados(); i++) {
                        System.out.println("1. " + A[i]);
                    }
                    break;
                case 2:
                    int opcion2 = 0;
                    System.out.println("Inventario");
                    while (opcion2 != 6) {    
                        System.out.println("1. Ver.");
                        System.out.println("2. Registrar compra.");
                        System.out.println("3. Registrar venta.");
                        System.out.println("4. Movimientos");
                        System.out.println("5. Ganancias");
                        System.out.println("6. Menu principal");
                        opcion2 = in.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Producto     " + "cant     " + "Ventas     " + "Compras    ");
                                for (int i = 0; i < tienda.getCant_productos(); i++) {
                                    System.out.println(tienda.getProductos()[i].getName() + "     " + tienda.getProductos()[i].getCant() + "     " + tienda.getProductos()[i].getVentas() + "     " + tienda.getProductos()[i].getCompras());
                                }
                                break;
                            case 2:

                                System.out.println("Ingrese el codigo de la factura:");
                                int cod = in.nextInt();
                                System.out.println("Ingrese el estado de la factura" + "1. Cancelada \n 2. Sin cancelar");
                                int Estatus = in.nextInt();
                                int plazo = 0;
                                if (Estatus == 1) {
                                    System.out.println("Ingrese el plazo de pago de la factura en dias:");
                                    plazo = in.nextInt();
                                }
                                System.out.println("Ingrese el proveedor");
                                String Name_prov = in.next();
                                System.out.println("cuantos diferentes productos compro?");
                                int cant_productos = in.nextInt();
                                String[] Productos = new String[cant_productos];
                                int[] cant_unica = new int[cant_productos];
                                for (int i = 0; i < cant_productos; i++) {
                                    System.out.print("Name producto: ");
                                    Productos[i] = in.next();
                                    System.out.print("cant");
                                    cant_unica[i] = in.nextInt();
                                    System.out.println();
                                }

                                boolean e = tienda.Generar_Compra(cod, Name_prov, Productos, cant_unica, cant_productos, plazo, Estatus);
                                boolean e = tienda.Generar_Compra(cod, Name_prov, Productos, cant_unica, cant_productos, plazo, Estatus);
                                if (e == true) {
                                    System.out.println("Compra registrada :)");
                                } else {
                                    System.out.println("Error en la compra.  :(");
                                }
                                break;
                            case 3:
                                System.out.println("cuantos productos diferentes vendio?");
                                int cant_vendidos = in.nextInt();
                                String[] Name_productov = new String[cant_vendidos];
                                int[] cant_unica2 = new int[cant_vendidos];
                                for (int i = 0; i < cant_vendidos; i++) {
                                    System.out.println("Name del producto");
                                    Name_productov[i] = in.next();
                                    System.out.println("cant vendida");
                                    cant_unica2[i] = in.nextInt();
                                }
                                String[] Salida = tienda.Generar_venta(Name_productov, cant_unica2, cant_vendidos);
                                for (int i = 0; i < cant_vendidos; i++) {
                                    System.out.println(Name_productov[i] + Salida[i]);   
                                }
                                break;
                            case 4:
                                System.out.println(
                                “Movimientos
                                ");
System.out.println("Top " + "Producto     " + "Ventas     " + "Ingresos     ");
                                for (int i = 0; i < tienda.getCant_productos(); i++) {
                                    int a = i + 1;
                                    System.out.println(a + " " + tienda.getProductos()[i].getName() + "     " + tienda.getProductos()[i].getVentas() + "     " + tienda.getProductos()[i].getIngresos());
                                }
                                break;
                            case 5:
                                System.out.println("GANANCIAS :) ");
                                System.out.println("Producto     " + "Ingresos     " + "Egresos     " + "Ganancias    ");
                                for (int i = 0; i < tienda.getCant_productos(); i++) {
                                    System.out.println(tienda.getProductos()[i].getName() + "     " + tienda.getProductos()[i].getIngresos() + "     " + tienda.getProductos()[i].getEgreso() + "     " + tienda.getProductos()[i].getGanancia());
                                }
                                break;
                            case 6:
                                break;
                        }
                    }
                    break;
                case 3:
                    int opcion3 = 0;

                    System.out.println("Proveedores");
                    while (opcion3 != 8) {
                        System.out.println("1. Deudas");
                        System.out.println("2. Facturas vencidas");
                        System.out.println("3. Facturas proximas a vencer");
                        System.out.println("4. Facturas Canceladas");
                        System.out.println("5. Pagar Facturas");
                        System.out.println("6. Eliminar facturas pagadas");
                        System.out.println("7. Nuevo proveedor");
                        System.out.println("8. Menu principal");
                        opcion3 = in.nextInt();
                        switch (opcion3) {
                            case 1:
                                float deuda = 0;
                                System.out.println("Proveedor   " + "Facturas sin cancelar    " + "Deuda");
                                for (int i = 0; i < tienda.getCant_proveedores(); i++) {
                                    if (tienda.getDeudas(i) > 0) {
                                        for (int j = 0; j < tienda.getProveedores()[i].getCont(); j++) {
                                            if (tienda.getProveedores()[i].getFacturas()[j].getEstado() == false) {
                                                deuda += tienda.getProveedores()[i].getFacturas()[j].getValor();
                                            }
                                        }
                                        System.out.println(tienda.getProveedores()[i].getName() + "     " + tienda.getDeudas(i) + "    " + deuda);
                                    }
                                }
                                break;
                            case 2:
                                for (int i = 0; i < tienda.getCant_proveedores(); i++) {
                                    for (int j = 0; j < tienda.getProveedores()[i].getCont(); j++) {
                                        if (tienda.getProveedores()[i].getFacturas()[j].getPlazo() == 0) {
                                            System.out.println(tienda.getProveedores()[i].getFacturas()[j].getName_proveedor() + "   " + tienda.getProveedores()[i].getFacturas()[j].getCod());
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Plazo minimo restante");
                                int plazo_min = in.nextInt();
                                for (int i = 0; i < tienda.getCant_proveedores(); i++) {
                                    for (int j = 0; j < tienda.getProveedores()[i].getCont(); j++) {
                                        if (tienda.getProveedores()[i].getFacturas()[j].getPlazo() <= plazo_min) {
                                            System.out.println(tienda.getProveedores()[i].getFacturas()[j].getName_proveedor() + "   " + tienda.getProveedores()[i].getFacturas()[j].getCod());
                                        }
                                    }
                                }
                                break;
                            case 4:
                                int cancelados = 0;
                                System.out.println("Proveedor   " + "Facturas pagadas    ");
                                for (int i = 0; i < tienda.getCant_proveedores(); i++) {
                                    for (int j = 0; j < tienda.getProveedores()[i].getCont(); j++) {
                                        if (tienda.getProveedores()[i].getFacturas()[j].getEstado() == true) {
                                            cancelados++;
                                        }
                                    }
                                    if (cancelados > 0) {
                                        System.out.println(tienda.getProveedores()[i].getName() + "     " + cancelados + "     ");
                                    }
                                }

                                break;
                            case 5:
                                System.out.println("Codigo de la factura");
                                int cod = in.nextInt();
                                System.out.println(" Proveedor");
                                String Name = in.next();
                                if (tienda.pagar_Factura(cod, Name) == true) {
                                    System.out.println(
                                  
                                  
                                    "Registro”)
}else{System.out.println("Error de registro. ");
                                }
                                  
                                break;
                            case 6:
                                tienda.Eliminar_facturas();
                                System.out.println("Exitosa");
                                break;
                            case 7:
                                System.out.println("Proveedor");
                                String newname = in.next();
                                System.out.println("cuantos productos vende");
                                int d = in.nextInt();
                                System.out.println("ingrese los productos");
                                String[] newproductos = new String[d];
                                for (int i = 0; i < d; i++) {
                                    newproductos[i] = in.next();
                                }
                                tienda.Anadir_Proveedor(newname, newproductos);
                                System.out.println("Exitoso");
                                break;
                            case 8:
                                break;
                        }
                    }
                    break;
                case 4:
                    int opcion4 = 0;
                    System.out.println("Empleados");
                    while (opcion4 != 4) {
                        System.out.println("1. Agregar Empleado");
                        System.out.println("2. Mostrar informacion");
                        System.out.println("3. Registrar horas ");
                        System.out.println("4. Menu principal");
                        opcion4 = in.nextInt();
                        switch (opcion4) {
                            case 1:
                                System.out.println("Ingrese el empleado");
                                String Name_Emply = in.next();
                                System.out.println("Seleccione el turno 1. 9:00 am  6:00 pm \n 2. 10:00 am  7:00 pm");
                                int Time = in.nextInt();
                                System.out.println("Ingrese el valor del Salario minimo ");
                                float Salario_minimo = in.nextFloat();
                                tienda.Anadir_Emply(Name_Emply, Time, Salario_minimo);
                                System.out.println("Exitoso");
                                break;

                            case 2:
                                System.out.println("Nombre   " + "turno   " + "Horas trabajadas   ");
                                for (int i = 0; i < tienda.getCant_Emplys(); i++) {
                                    String an;
                                    if (tienda.getEmplys()[i].getTime() == 1) {
                                        an = "9:00 am  6:00 pm";
                                    } else {
                                        an = " 10:00 am  7:00 pm";
                                    }
                                    System.out.println(tienda.getEmplys()[i].getName() + "   " + an + "   " + tienda.getEmplys()[i].getHtrab());
                                }
                                break;
                            case 3:
                                for (int i = 0; i < tienda.getCant_Emplys(); i++) {
                                    System.out.println("Emply" + i + tienda.getEmplys()[i].getName());
                                    System.out.println("Ingrese las horas que trabajo en el dia");
                                    int hsdia = in.nextInt();
                                    tienda.getEmplys()[i].Numhs(hsdia);
                                }
                                for (int j = 0; j < tienda.getCant_proveedores(); j++) {
                                    for (int u = 0; u < tienda.getProveedores()[j].getCont(); u++) {
                                        if ((tienda.getProveedores()[j].getFacturas()[u].getEstado() == false) && (tienda.getProveedores()[j].getFacturas()[u].getPlazo() > 0)) {
                                            tienda.getProveedores()[j].getFacturas()[u].Descontar_plazo();
                                        }
                                    }
                                }
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }

        }
    }
