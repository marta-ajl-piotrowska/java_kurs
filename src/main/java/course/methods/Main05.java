package course.methods;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculateNetto(scanner.nextDouble(), 0.23));
    }

    public static double calculateNetto (double gross, double vat) {
        double netto = gross - gross*vat;
        return netto;
    }
}
