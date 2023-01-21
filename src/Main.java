import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Switch");

        // Switch:

        Scanner scanner= new Scanner(System.in); // Richiamo la classe scanner
        System.out.println("Immetti il nome della frutta di stagione: ");
        String frutta= scanner.next();

        switch (frutta){ /* Crea un insieme di condizioni, naturalmente al suo interno potremmo
                            annidare degli if e altri come cicli for, while e do-while */

            case "fragole": // Case= condizione denominata fragole
                System.out.println("Che buone le fragole sono a 12 euro al kg");
                break; // Chiusura caso fragole
            case "banane":
                System.out.println("Che buone le banane, sono a 3 euro al kg");
                break;
            case "pere":
                System.out.println("Che buone le pere, sono a 5.60 euro al kg");
                break;
            case "mandarini":
                System.out.println("Che buone i mandarini sono a 4 euro al kg");
                break;
            case "albicocche":
                System.out.println("Che buone le albicocche sono a 6.40 euro al kg");
                break;

            default: /* Condizione facoltativa= se nessuna delle precedenti sarà soddisfatta,
                        darà il successivo messaggio di errore nella stampa */
                System.out.println("Error! Hai inserito frutta fuori stagione! ");
        }
    }
}