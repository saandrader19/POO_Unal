package com.actividad3

public class TrianguloRectangulo {
    int base;
    int altura; 
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); 
        /* Invoca al método calcular hipotenusa */
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            JOptionPane.showMessageDialog(null, "Es un triángulo equilátero"); /* Todos sus lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            JOptionPane.showMessageDialog(null, "Es un triángulo escaleno"); /* Todos sus lados son diferentes */
        else
            JOptionPane.showMessageDialog(null, "Es un triángulo isósceles"); /* De otra manera, es isósceles */
    }
}
