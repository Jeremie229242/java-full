import java.util.Scanner;

public class Exo6 {

    public static void main(String[] args) {


        //calculateur d'interet

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timescompte;
        int years;
        double  amount;

        System.out.print("Entrer le ùmontant Principal: ");
        principal = scanner.nextDouble();

        System.out.print("Entrer interet en %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Entrer le temps par année: ");
        timescompte = scanner.nextInt();

        System.out.print("Entrer le nombre année: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timescompte, timescompte * years);

        System.out.println("Le montant apres calcul est: " + years + amount + "F CFA");


    }
}
