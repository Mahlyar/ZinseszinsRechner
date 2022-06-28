import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class main {
    public static void main(String[] args) {
        System.out.println("Guten Tag. Das hier ist ein Zinseszins Rechner ");
        System.out.println("Bitte geben Sie Ihr Startkapital an: ");
        Scanner kapital = new Scanner(System.in);   //Create Scanner Object
        Double Kapital = kapital.nextDouble();      //Read user input
        System.out.println("Ihr Kapital Betraegt: " + Kapital + " Euro" );
        System.out.println("Bitte geben nun den Zinssatz an: ");
        Scanner prozentsatz = new Scanner(System.in);
        Double Prozentsatz =prozentsatz.nextDouble();
        System.out.println("Ihr Zinssatz betraegt: " + Prozentsatz + " %" );
        System.out.println("Als letztes geben Sie bitte den Zeitraum in Jahre an: ");
        Scanner jahr = new Scanner(System.in);
        Integer Jahr = jahr.nextInt();
        System.out.println("Jahre: " + Jahr);

        BigDecimal bd = new BigDecimal(zinseszins(Kapital,Prozentsatz,Jahr)).setScale(2, RoundingMode.HALF_UP);

        System.out.println( bd + " €");

    }

    private static double zinseszins(double Kapital, double Prozentsatz, int Jahr) {
        for (int i = 1; i <= Jahr; i++) {
            Kapital = Kapital + ((Kapital * Prozentsatz) / 100);
        }
        return Kapital;
    }
}
