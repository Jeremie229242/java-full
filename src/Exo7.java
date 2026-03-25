import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

          int choix;
          double newNombre;
          double nombre;


          System.out.println("Nombre conversion Programme");
        System.out.println("1: conversion G en KG");
        System.out.println("2: consersion KG en G");


        System.out.print("Faites votre Choix: ");
        choix = scanner.nextInt();

        if (choix == 1){
            System.out.print("Entrer le nombre en grame: ");
            nombre = scanner.nextDouble();
            newNombre = nombre * 2.20462;
            System.out.printf("Le nouveau nombre en grame est: %.2f", newNombre);
        }
        else if (choix == 2){
            System.out.print("Entrer le nombre en Kgs: ");
            nombre = scanner.nextDouble();
            newNombre = nombre * 2.20462;
            System.out.printf("Le nouveau nombre en grame est: %.2f", newNombre);
        }
        else {
            System.out.println("Votre choix n'est pas valide");
        }
        scanner.close();
    }
}
