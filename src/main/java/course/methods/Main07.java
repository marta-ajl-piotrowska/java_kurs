package course.methods;

import java.util.Scanner;

public class Main07 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkEvenOdd(scanner.nextInt()));
    }
    public static String checkEvenOdd(int number) {
        if (number%2==0) {
            return "even";
        }
        else {
            return "odd";
        }
    }
}
