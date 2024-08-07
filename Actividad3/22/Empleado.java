package com.actividad3;

class Empleado {
    // Atributos de la clase

    public String nombres;
    public int horasTrabajadas;
    public double valorHora;


    // Constructor de la clase
    public Empleado(String nombres, int horasTrabajadas, double valorHora) {
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    // Método para calcular el salario bruto
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

}
