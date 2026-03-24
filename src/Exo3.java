import java.util.Scanner;


public class Exo3 {
    public static void main(String[] args){


        // un jeu

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Entrer une adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Entrer une noun  (animal ou personne): ");
        noun1 = scanner.nextLine();
        System.out.print("Entrer dans adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Entrer le verbe terminer par -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Entrer dans adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nAujourd'hui, je suis allé à un " + adjective1 + " zoo");
        System.out.println("Dans une exposition, j'ai vu " + noun1 + ".");
        System.out.println(noun1 + " etait " + adjective2 + " et " + verb1 + "!");
        System.out.println("Jetais " + adjective3 + "!");

        scanner.close();

    }
}
