package com.company;

import java.util.Scanner;

public class Main {
/*Planteamiento del Problema

    Dados tres números calcule:
         La suma de los tres
         El promedio de los tres
         El producto de los tres

Además determine:
         El menor de los tres*/

    public static void main(String[] args) {
        // write your code here

        Scanner entrada = new Scanner(System.in);

        int a, b, c, menor = 0;

        System.out.println("Ingresa un numero A");
        a = entrada.nextInt();
        System.out.println("Ingresa un numero B");
        b = entrada.nextInt();
        System.out.println("Ingresa un numero C");
        c = entrada.nextInt();

        int suma = a + b + c;
        int multiplicacion = a * b * c;
        int promedio = suma / 3;

        System.out.println("Valor de la suma :" + suma);
        System.out.println("Valor de la multiplicacion :" + multiplicacion);
        System.out.println("Valor del promedio : " + promedio);

        if (a <= b && a <= c) {
            menor = a;

        } else if (b <= c && b <= a) {
            menor = b;
        } else if (c <= a && c <= b) {
            menor = c;
        }
        System.out.println("El menor de todos es : " + menor);
    }
}
