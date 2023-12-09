package course.methods;

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz trzy liczby oddzielone spacją, dowiesz się, która jest największa: ");
        System.out.println(maxOfThree(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
    public static int maxOfThree (int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else return number3;

    }
}
