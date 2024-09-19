/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proy1_blas.pruebas;

import com.mycompany.proy1_blas.service.VentaService;

/**
 *
 * @author Yoi
 */
public class Prueba02 {
    public static void main(String[] args) {
        double precio = 600;
        int cantidad = 5;
        
        VentaService service = new VentaService(precio, cantidad);
        double importe = service.importe();
        double impuesto = service.impuesto(importe);
        
        System.out.println(impuesto);
    } 
    
}
