
package com.actividad3;

class Empleado {
    // Atributos de la clase
    public String codigo;
    public String nombres;
    public int horasTrabajadas;
    public double valorHora;
    public double porcentajeRetencion;

    // Constructor de la clase
    public Empleado(String codigo, String nombres, int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // Método para calcular el salario bruto
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    // Método para calcular el salario neto
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        return salarioBruto - retencion;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Código del Empleado: " + codigo);
        System.out.println("Nombres del Empleado: " + nombres);
        System.out.println("Salario Bruto: $" + calcularSalarioBruto());
        System.out.println("Salario Neto: $" + calcularSalarioNeto());
    }
}
