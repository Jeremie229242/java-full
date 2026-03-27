import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args){

        Scanner scanner = new  Scanner(System.in);
        Random random = new Random();

        String[] choix = {" rock", "papier", "ciseaux"};
        String playerChoix;
        String computerChoix;
        String playagain = "oui";
        System.out.println("Entrer votre lot (rock, papier, ciseaux): ");
        playerChoix = scanner.nextLine().toLowerCase();

        if (!playerChoix.equals("rock") && !playerChoix.equals("papier") && !playerChoix.equals("ciseaux")){
            System.out.println("Choix invalide");

        }
        computerChoix = choix[random.nextInt(3)];
        System.out.println("Computer choix: " + computerChoix);




        scanner.close();
    }
}
