import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {

        double longueur = 0;
        double largeur = 0;
        double aire = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer la longueur: ");
        longueur = scanner.nextDouble();

        System.out.print("Entrer la largeur: ");
        largeur = scanner.nextDouble();


        aire = longueur * largeur;

        System.out.print("laire de la surface est: " + aire + "cm&");



        scanner.close();
    }
}
