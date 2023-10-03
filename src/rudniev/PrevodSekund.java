package rudniev;
import java.util.Scanner;
/**
 *
 * @author maxrud
 */
public class PrevodSekund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("počet hodin: ");
        int hodiny = sc.nextInt();

        System.out.print("počet minut: ");
        int minuty = sc.nextInt();

        System.out.print("počet sekund: ");
        int sekundy = sc.nextInt();
        
        //vypocty
        int celkoveSekundy = (hodiny * 60 * 60) + (minuty * 60) + sekundy;
        
        
        

        
        //output
        System.out.println("Celkový čas v sekundách: " + celkoveSekundy);
        System.out.println("Čas ve formátu HH:MM:SS: " + formatovanyCas(celkoveSekundy));
        
    }
    
    public static String formatovanyCas(int celkoveSekundy)
    {
        int hodiny = celkoveSekundy / 60 / 60;

        int zbyvajiciSekundy = celkoveSekundy % 3600;
        int minuty = zbyvajiciSekundy / 60;

        int sekundy = zbyvajiciSekundy % 60;

        String formatovanyCas = String.format("%02d:%02d:%02d", hodiny, minuty, sekundy);
        return(formatovanyCas);
    }
    
}
