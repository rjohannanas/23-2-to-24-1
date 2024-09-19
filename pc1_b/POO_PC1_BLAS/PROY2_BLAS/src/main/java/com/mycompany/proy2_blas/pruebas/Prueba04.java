package com.mycompany.proy2_blas.pruebas;

import com.mycompany.proy2_blas.service.MathService;

/**
 *
 * @author Yoi
 */
public class Prueba04 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=1;

        MathService service = new MathService();
        boolean solu = service.solu(a, b, c);
        System.out.println(solu);
    }
}
