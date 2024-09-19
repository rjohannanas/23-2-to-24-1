package com.mycompany.proy1_blas.pruebas;

import com.mycompany.proy1_blas.service.VentaService;

/**
 *
 * @author Yoi
 */
public class Prueba03 {
    public static void main(String[] args) {
        double precio = 600;
        int cantidad = 5;
        
        VentaService service = new VentaService(precio, cantidad);
        double importe = service.importe();
        double impuesto = service.impuesto(importe);
        double total = service.total(importe, impuesto);
        System.out.println(total);
    } 
}
