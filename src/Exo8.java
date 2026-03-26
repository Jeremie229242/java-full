import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class Exo8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;

        System.out.print("Entrer le premier nombre: ");
        num1 = scanner.nextDouble();

        System.out.print("Entrer un operateur (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        

        scanner.close();


    }
}
