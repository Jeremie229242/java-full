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

        do {


            System.out.println("Entrer votre lot (rock, papier, ciseaux): ");
            playerChoix = scanner.nextLine().toLowerCase();

            if (!playerChoix.equals("rock") && !playerChoix.equals("papier") && !playerChoix.equals("ciseaux")){
                System.out.println("Choix invalide");
                continue;

            }
            computerChoix = choix[random.nextInt(3)];
            System.out.println("Computer choix: " + computerChoix);

            if (playerChoix.equals(computerChoix)){
                System.out.println("it's a tie");

            } else if ((playerChoix.equals("rock") && computerChoix.equals("ciseaux")) ||
                    (playerChoix.equals("papier") && computerChoix.equals("rock")) ||
                    playerChoix.equals("ciseaux") && computerChoix.equals("papier") ) {

                System.out.println("gagner");

                // } else if (playerChoix.equals("papier") && computerChoix.equals("rock")) {
                //     System.out.println("Gagner");

                //  } else if (playerChoix.equals("ciseaux") && computerChoix.equals("papier")) {
                //     System.out.println("Gagner");

            } else {
                System.out.println("perdu");

            }
            System.out.println("Play again (oui / non): ");
            playagain = scanner.nextLine().toLowerCase();

        } while (playagain.equals("oui"));

        System.out.println("Thank you");



        scanner.close();
    }
}
