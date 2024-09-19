package com.mycompany.proy1_blas.service;

/**
 *
 * @author Yoi
 */
public class CreditoPago extends VentaService {
    private String categoria; // A: 3%, B: 5%, C: 7%
    private int meses;
    private double saldo;
    private double tasaInteres; // según categoría

    public CreditoPago(double precio, int cantidad, String categoria, int meses) {
        precio = precio*1.18;
        super(precio, cantidad);
        this.categoria = categoria;
        this.meses = meses;
        this.saldo = importe(); // saldo inicial es igual al importe
        setTasaInteres();
    }

    private void setTasaInteres() {
        switch (categoria) {
            case "A":
                this.tasaInteres = 0.03;
                break;
            case "B":
                this.tasaInteres = 0.05;
                break;
            case "C":
                this.tasaInteres = 0.07;
                break;
            default:
                throw new IllegalArgumentException("Categoría no válida");
        }
    }

    // Método para calcular cronograma de pagos
    public void calcularCronograma() {
        double cuota;
        double interes;
        double amortizacion;
        double saldo = importe(); // Inicializar con el importe total

        System.out.println("Mes\tCuota\tIntereses\tAmortización\tSaldo");
        for (int i = 1; i <= meses; i++) {
            interes = saldo * tasaInteres;
            cuota = (importe() + (importe() * tasaInteres * meses)) / meses; // Pago fijo
            amortizacion = cuota - interes;
            saldo -= amortizacion;

            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t\t%.2f\n", i, cuota, interes, amortizacion, saldo);
        }
    }
}