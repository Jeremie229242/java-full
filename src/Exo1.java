import java.util.Scanner;


public class Exo1 {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.print("Entrer votre nom complet: ");
         String name = scanner.nextLine();

         System.out.print("entrer votre Age: ");
         int age = scanner.nextInt();

         System.out.print("quel est ton taille: ");
         double gpa = scanner.nextDouble();
         scanner.nextLine();

         System.out.print("Quelle est votr couleur preferée?? ");
         String color = scanner.nextLine();

         System.out.print("Vous etes etudiant?? (true/false): ");
         boolean estEtudiant = scanner.nextBoolean();

         System.out.println("Salut " + name);
         System.out.println("Vous avez " + age + " ans");
         System.out.println("Votre taille est: " + gpa);
         System.out.println("Votre Couleur est: " + color);
       //  System.out.println("Etudiant: "+ estEtudiant);
         if(estEtudiant){
             System.out.println("Vous etes enregistrer comme etudiant");
         }
         else {
             System.out.println("Vous etes deconnecter");
         }

         scanner.close();


     }

}
