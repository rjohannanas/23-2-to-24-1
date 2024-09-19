package com.mycompany.proy2_blas.service;

/**
 *
 * @author Yoi
 */
public class MathService {
    public int pow(double a, int b) {
        int c = 1;
        for (int i = 1; i<= b; i++) {
            c*=a;
        }
        return c;
    }
    
    public double raiz(double base) {
        double prec = 0.00001;
        double aprox = base/2;
        
        while ((aprox*aprox>base+prec)||(aprox*aprox<base-prec)) {
            aprox = (aprox + base/aprox)/2;
        }
        
        aprox = Math.round(aprox*100.0)/100.0;

        if (aprox%1==0) {
            return (int) aprox;
        }
        return aprox;
    }
    
    public double delta(double a, double b, double c) {
        return (b*b)- 4*a*c;
    }
    
    public boolean solu(double a, double b, double c) {
        double d = delta(a, b, c);
        return d >= 0;
    }
        
    public double x1(double a, double b, double c) {
        return (-b+raiz(delta(a, b, c)))/(2*a);
    }
    
    public double x2(double a, double b, double c) {
        return (-b-raiz(delta(a, b, c)))/(2*a);
    }
}
