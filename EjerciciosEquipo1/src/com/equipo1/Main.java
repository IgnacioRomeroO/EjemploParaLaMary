package com.equipo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creando variables


        /*System.out.println("Ingresa el numero 1");
        int numero1 = sc.nextInt();

        System.out.println("Ingresa el numero 2");
        int numero2 = sc.nextInt();*/


        /*if (numero1 > numero2) { //condiciones: evaluan la realidad de la condicion
            
            //dentro de las llaves se hace lo que pasa si es realidad
            System.out.println("El numero 1 es mayor al numero 2");//imprimiendo en consola
            
        } else if (numero1 == numero2) {
            System.out.println("El numero 1 es igual al numero 2");
        } else if (numero1 < numero2) {
            System.out.println("El numero 1 es menor al numero 2");
        }else {
            System.out.println("El numero ingresado es invalido");
        }*/

        //WHILE y DO WHILE:
        /*int numero1 = 8;
        int numero2 = 6;

        while(numero1 > numero2){
            System.out.println("Si es mayor");
            return;
        }*/

        //necesitamos las variables afuera
        int numero1 = 0;
        int numero2 = 0;
        do {
            System.out.println("***********************");

            //realiza la accion
            System.out.println("Ingresa el numero 1");
            numero1 = sc.nextInt();

            System.out.println("Ingresa el numero 2");
            numero2 = sc.nextInt();

        } while (numero1 > numero2);


    }
}
