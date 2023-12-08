package course.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(convertToUsd(scan.nextDouble()));
    }

    public static double convertToUsd(double pln) {
        return pln /4.04;
    }
}
