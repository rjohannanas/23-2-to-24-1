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
public class Prueba05 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=1;

        MathService service = new MathService();
        double x1 = service.x1(a, b, c);
        double x2 = service.x2(a, b, c);
        System.out.println(x1);
        System.out.println(x2);
    }
}
