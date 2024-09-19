package com.mycompany.proy1_blas.service;

public class VentaService {
    protected double precio;
    protected int cantidad;

    public VentaService(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    VentaService() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public double importe() {
        precio = precio*100/118;
        return precio*cantidad;
    }

    public double impuesto(double importe) {
        return importe*0.18;
    }

    public double total(double importe, double impuesto) {
        return importe+impuesto;
    }

    //ContadoPago(Hija)
    public class ContadoPago extends VentaService {
        public ContadoPago(double precio, int cantidad) {
            super(precio, cantidad);
        }
    }
}
/*
Quiero que la clase padre VentaService tenga dos clases hijas.
Quiero que hereden sus 3 variables y 3 metodos.
Pero quiero que solamente la de CreditoPago cree las nuevas variables saldo, amortizacion, interes y couta, al darle el numero de mes 
De manera que sean metodos por mes o mira la mejor manera de hacerlo.
porque creare otro paquete view y dentro una clase que pueda imprimir: importe, impuesto, total,y cronograma de pago que es una especie de tabla así:

ENTRADA(DATOS)
Precio: 600.00
Cantidad: 5
Tipo de venta: Credito
Categoria: B
Meses: 6

SALIDA 
Importe: 2542.37
Impuesto: 457.63
Total: 3000.00
Mes Cuota   Intereses   Amortizacion    Saldo
1   650.00  150.00      500.00          2500.00
2   625.00  125.00      500.00          2000.00
3   600.00  100.00      500.00          1000.00
4   ...
5   ...
6   ...

*/