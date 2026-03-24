import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args){

        // Achat de Pizza

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String currency = "CFA";
        Double total;

        System.out.print("Quelle article voulez-vous?? ");
        item = scanner.nextLine();

        System.out.print("A quelle prix voulez-vous?? ");
        price = scanner.nextDouble();

        System.out.print("Combien de quantite voulez-vous?? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nVous avez commandé " + quantity +" " + item );
        System.out.println("Le Total fait: " + total +" " +currency);

        scanner.close();
    }
}
