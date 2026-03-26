import java.util.Random;
import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Jeu de devinettes de nombres");
        System.out.printf("Devinez un nombre entre %d-%d\n", min, max );

        do {
            System.out.print("Saisissez une estimation: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("too low! Try again");
            } else if (guess > randomNumber) {
                System.out.println("too high! try again!");

            }
            else {
                System.out.println("Félicitaion!!! Votre nombre est " + randomNumber);
                System.out.println("# of attemps: " + attempts);

            }

        }while (guess != randomNumber);

        scanner.close();
    }
}
