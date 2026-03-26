import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args){

        // programme banque pour debutant
        Scanner scanner = new Scanner(System.in);

        //declaration variables
        double balance;
        boolean isRunning;
        int choix;

        // le menu
           System.out.println("*********************");
        System.out.println("PPROGRAMME BANQUE");
        System.out.println("**********************");
        System.out.println("1. Voir balance");
        System.out.println("2. Depot");
        System.out.println("3. whithdraw");
        System.out.println("4. Quitter");
        System.out.println("**************************");
        //processus de choix des utilisateurs

        System.out.println("entrer votre choix (1-4): ");
        choix = scanner.nextInt();

        switch (choix){
            case 1 ->System.out.println("Voir balance");
            case 2 ->System.out.println("Depot");
            case 3 ->System.out.println("withdraw");
            case 4 -> isRunning = false ;
        }
        //balance

        //depot

        //withdraw

        //message quitter

        scanner.close();
    }
}
