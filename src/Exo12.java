import java.util.Scanner;

public class Exo12 {
    public static void  main(String[] args){

        //java quiz game
        String[] questions = {
                "What is the main function of a rounter?",
                "which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is know as the father of computer?",
                "what was the first programming language?"



        };

        String[][] options = { {"1. Storing files", "2. encrypting data", "3. Direction internet trafic", "4. Managin"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2008", "4. 2006"},
                {"1. Steve Jobs", "2. Bill Gates", "3. alian", "4. Charles"},
                {"1. COBOL", "2. C", "3. JAVA", "4. PYTHON"},
        };
        int[] answers = {3, 1, 2, 4 ,3};
        int score = 0;
        int guess ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Bienvenue en java quiz game");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i++){

            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);

            }
        }




        scanner.close();
    }
}
