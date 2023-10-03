package rudniev;
import java.util.Scanner;
/**
 *
 * @author maxrud
 */
public class UsekovaRychlost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte maximální povolenou rychlost v úseku (km/h): ");
        int maxSpeedKmH = scanner.nextInt();

        System.out.print("Zadejte délku úseku (km): ");
        double distanceKm = scanner.nextDouble();

        System.out.print("Zadejte časové údaje průjezdu začátkem úseku (hh mm ss): ");
        int inHour = scanner.nextInt();
        int inMin = scanner.nextInt();
        int inSec = scanner.nextInt();

        System.out.print("Zadejte časové údaje průjezdu koncem úseku (hh mm ss): ");
        int outHour = scanner.nextInt();
        int outMin = scanner.nextInt();
        int outSec = scanner.nextInt();

        // Převod časových údajů na celkový čas v hodinách
        double inTime = inHour + (inMin / 60.0) + (inSec / 3600.0);
        double outTime = outHour + (outMin / 60.0) + (outSec / 3600.0);

        // Výpočet průměrné rychlosti v úseku (v km/h)
        double averageSpeed = distanceKm / (outTime - inTime);

        // Výpočet překročení povolené rychlosti (v km/h)
        double speedExceed = averageSpeed - maxSpeedKmH;

        System.out.println("Dosažená průměrná rychlost v úseku: " + averageSpeed + " km/h");
        System.out.println("Překročení maximální povolené rychlosti: " + speedExceed + " km/h");
    }
    
}
