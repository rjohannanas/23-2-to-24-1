package com.mycompany.proy1_blas.pruebas;

import com.mycompany.proy1_blas.service.CreditoPago;

/**
 *
 * @author Yoi
 */


public class Prueba04 {

    public static void main(String[] args) {
        // Datos de prueba
        double precio = 600.00;
        int cantidad = 5;
        String categoria = "B"; // Categoría B con 5% de interés mensual
        int meses = 6;

        // Crear instancia de CreditoPago
        CreditoPago credito = new CreditoPago(precio, cantidad, categoria, meses);

        // Realizar cálculos
        double importe = credito.importe();
        double impuesto = credito.impuesto(importe);
        double total = credito.total(importe, impuesto);

        // Imprimir resultados
        System.out.println("====== PRUEBA 04 ======");
        System.out.println("Datos de la Venta");
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoria);
        System.out.println("Meses: " + meses);

        System.out.println("\nResultados del cálculo");
        System.out.println("Importe: " + String.format("%.2f", importe));
        System.out.println("Impuesto: " + String.format("%.2f", impuesto));
        System.out.println("Total: " + String.format("%.2f", total));

        System.out.println("\nCronograma de pagos:");
        credito.calcularCronograma(); // Método que imprime el cronograma
    }
}
