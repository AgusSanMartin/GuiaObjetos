package com.company;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("Ejercicio 1: ");

        Rectangulo rekt = new Rectangulo(2.4, 4);

        System.out.println("Alto: " + rekt.getAlto() + " Ancho: " + rekt.getAncho());
        System.out.println("Area: " + rekt.calcularArea() + " Perimetro: " + rekt.calcularPerimetro());

        rekt.setAncho(5);
        rekt.setAlto(10);

        System.out.println("Area modificada: " + rekt.calcularArea() + " Perimetro modificado: " + rekt.calcularPerimetro());

        Rectangulo defaulted = new Rectangulo();

        System.out.println("Area default: " + defaulted.calcularArea() + " Perimetro default: " + defaulted.calcularPerimetro());

        //Ejercicio 2

        System.out.println("Ejercicio 2: ");

        Empleado eCarlos = new Empleado("23456345", "Carlos", "Gutiérrez", 25000);
        Empleado eAna = new Empleado("34234123", "Ana", "Sánchez", 27500);

        System.out.println(eCarlos.getEmpleado());
        System.out.println(eAna.getEmpleado());

        eCarlos.aumentarSalario(15);

        System.out.println("El salario anual nuevo de " + eCarlos.getNombre() + " es: " + eCarlos.calcularSalarioAnual());

        // Ejercicio 3
        System.out.println("Ejercicio 3: ");
        ItemVenta item = new ItemVenta(1, "cartuchera", 23, 670);
        System.out.println(item);

        //Ejercicio 4
        System.out.println("Ejercicio 4: ");

        Cuenta cCarlos = new Cuenta(1, "Carlos Gutierrez", 15000);

        System.out.println("Se hizo un deposito, el balance actual es de " + cCarlos.credito(2500));
        System.out.println("Se hizo una compra, el balance actual es de " + cCarlos.debito(1500));
        System.out.println("El balance es " + cCarlos.debito(30000));

        System.out.println("id: "+ cCarlos.getId() + " Nombre: " + cCarlos.getNombre() + " Balance: " +cCarlos.getBalance());

        //Ejercicio 5
        System.out.println("Ejercicio 5: ");
        Hora hora = new Hora(10, 53, 30);
        System.out.println(hora);

        hora.sumarSeg();
        System.out.println(hora);

        hora.retrocederSeg();
        System.out.println(hora);
    }
}
