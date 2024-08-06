package com.actividad3;

public class Triangulo {
    double side;
    
    public Triangulo(double side){
        this.side = side;
    }
    
    double calcularPerimetro() {
        return side*3;
    }
    
    double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
    
    double calcularAltura(){
        return (Math.sqrt(3) / 2) * side;
    }
}
