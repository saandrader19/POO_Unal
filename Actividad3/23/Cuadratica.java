package poo.cap4Ejercicio23;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Cuadratica {
  double A, B, C;

public Cuadratica(double A, double B, double C){
  this.A = A;
  this.B = B;
  this.C = C;
}

  // Método para calcular el discriminante
    public double calcularDiscriminante() {
        return (B * B) - (4 * A * C);
    }

    // Método para calcular las raíces
    public String calcularRaices() {
        double discriminante = calcularDiscriminante();

        if (discriminante > 0) {
            // Dos raíces reales
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return "Raíces reales: " + raiz1 + " y " + raiz2;
        } else if (discriminante == 0) {
            // Una raíz real
            double raiz = -B / (2 * A);
            return "Raíz única: " + raiz;
        } else {
            // Raíces complejas
            double parteReal = -B / (2 * A);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * A);
            return "Raíces complejas: " + parteReal + " ± " + parteImaginaria + "i";
        }
}
