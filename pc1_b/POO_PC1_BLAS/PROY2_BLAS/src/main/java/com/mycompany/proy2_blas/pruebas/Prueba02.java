/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proy2_blas.pruebas;

import com.mycompany.proy2_blas.service.MathService;

/**
 *
 * @author Yoi
 */
public class Prueba02 {
    public static void main(String[] args) {
        MathService service = new MathService();
        double x = 9;
        double r = service.raiz(x);
        System.out.println(r);
    }
}
