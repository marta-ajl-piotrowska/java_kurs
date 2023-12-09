package course.methods;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz wiek: ");
        System.out.println(checkMaturity(scanner.nextInt()));
    }

    public static boolean checkMaturity (int age){
        if (age >=18) return true;
        else return false;
    }
}
