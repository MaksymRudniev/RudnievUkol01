package rudniev;
import java.util.Scanner;
/**
 *
 * @author maxru
 */
public class UroceniVkladu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Zadejte počáteční kapitál (K0): ");
        double pocatecniKapital = scanner.nextDouble();

        System.out.print("Zadejte roční úročení (u) v desetinách: ");
        double urok = scanner.nextDouble();

        System.out.print("Zadejte počet úrokovacích období za rok (m): ");
        int pocetObdobi = scanner.nextInt();

        System.out.print("Zadejte počet let (n): ");
        int pocetLet = scanner.nextInt();

        //vypocty
        double vyslednyKapital = pocatecniKapital * Math.pow(1 + urok / pocetObdobi, pocetObdobi * pocetLet);
        
        //output
        System.out.println("Výsledná hodnota kapitálu po " + pocetLet + " letech: " + vyslednyKapital);
    }
    
}
