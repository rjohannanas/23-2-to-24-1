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
