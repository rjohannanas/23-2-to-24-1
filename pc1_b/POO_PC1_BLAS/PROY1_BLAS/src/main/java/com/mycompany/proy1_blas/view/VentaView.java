/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proy1_blas.view;

/**
 *
 * @author Yoi
 */

import com.mycompany.proy1_blas.service.CreditoPago;
import com.mycompany.proy1_blas.service.VentaService;
import java.util.Scanner;

public class VentaView {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener datos de entrada del usuario
        System.out.println("ENTRADA (DATOS)");

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Tipo de venta (Contado/Credito): ");
        String tipoVenta = scanner.next().toLowerCase();

        String categoria = "";
        int meses = 0;

        if (tipoVenta.equals("credito")) {
            System.out.print("Categoría (A/B/C): ");
            categoria = scanner.next().toUpperCase();

            System.out.print("Meses: ");
            meses = scanner.nextInt();
        }

        // Procesar datos
        if (tipoVenta.equals("credito")) {
            // Crear instancia de CreditoPago
            CreditoPago credito = new CreditoPago(precio, cantidad, categoria, meses);

            // Calcular
            double importe = credito.importe();
            double impuesto = credito.impuesto(importe);
            double total = credito.total(importe, impuesto);

            // Imprimir resultados
            System.out.println("\nSALIDA");
            System.out.println("Importe: " + String.format("%.2f", importe));
            System.out.println("Impuesto: " + String.format("%.2f", impuesto));
            System.out.println("Total: " + String.format("%.2f", total));

            System.out.println("\nCronograma de pagos:");
            credito.calcularCronograma(); // Método que imprime el cronograma

        } else if (tipoVenta.equals("contado")) {
            // Puedes agregar la lógica para pagos al contado si es necesario
            VentaService contado = new VentaService(precio, cantidad);
            double importe = contado.importe();
            double impuesto = contado.impuesto(importe);
            double total = contado.total(importe, impuesto);

            // Imprimir resultados
            System.out.println("\nSALIDA");
            System.out.println("Importe: " + String.format("%.2f", importe));
            System.out.println("Impuesto: " + String.format("%.2f", impuesto));
            System.out.println("Total: " + String.format("%.2f", total));
        } else {
            System.out.println("Tipo de venta no válido.");
        }

        scanner.close();
    }
}
