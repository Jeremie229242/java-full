import java.util.Scanner;

public class Exo10 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // programme banque pour debutant


        //declaration variables
        double balance = 0;
        boolean isRunning = true;
        int choix;

        while (isRunning){



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

        System.out.print("entrer votre choix (1-4): ");
        choix = scanner.nextInt();

        switch (choix){
            case 1 ->shwoBalance(balance);
            case 2 ->balance= balance + depot();
            case 3 ->balance = balance - withdraw(balance);
            case 4 -> isRunning = false ;
            default -> System.out.println("choix invalide");
        }

        }
        //balance

        //depot

        //withdraw

        //message quitter
        System.out.println("**************************");
        System.out.println("Merci et bonne journée");
        System.out.println("**************************");

        scanner.close();
    }

    static void shwoBalance(double balance){
        System.out.println("**************************");
        System.out.printf("CFA%.2f\n", balance);
    }
    static double depot(){
        double amount;
        System.out.print("Entrer un montant pour le depot: ");

        amount = scanner.nextDouble();
        if (amount<0){
            System.out.println("Pas un nombre negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Entrer le montant de tranfert: ");
        amount = scanner.nextDouble();

        if (amount>balance){
            System.out.println("fond inssufisant");
            return 0;
        } else if (amount<0) {
            System.out.println("pas de nombre negative");
            return 0;
        }
        return amount;
    }
}
