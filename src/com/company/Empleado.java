package com.company;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String d, String n, String a, double s) {
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.salario = s;
    }
    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public double getSalario() { return salario; }

    public void setSalario(double salario) { this.salario = salario; }

    public double calcularSalarioAnual(){
        return this.salario * 12;
    }
    public void aumentarSalario(double p) {
        this.salario = this.salario + (this.salario * (p / 100));
    }
    public String getEmpleado() {
        return "Empleado[dni=" + this.dni + " nombre=" + this.nombre + " apellido=" + this.apellido + " salario=" + this.salario + "]";
    }
}
