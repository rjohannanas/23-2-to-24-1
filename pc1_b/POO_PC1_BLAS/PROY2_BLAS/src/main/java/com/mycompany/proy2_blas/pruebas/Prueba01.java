package com.mycompany.proy2_blas.pruebas;

import com.mycompany.proy2_blas.service.MathService;

/**
 *
 * @author Yoi
 */
public class Prueba01 {
    public static void main(String[] args) {
        MathService service = new MathService();
        double x = 3;
        int n = 2;
        double r = service.pow(x, n);
        System.out.println(r);
    }
}
