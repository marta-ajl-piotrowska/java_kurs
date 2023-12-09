package course.methods;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Silnia z ");
        System.out.println(factorial(scan.nextInt()));
    }
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
