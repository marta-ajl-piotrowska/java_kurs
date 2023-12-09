package course.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers [i] = r.nextInt(101);
        }
        Arrays.sort(randNumbers);
        System.out.println(Arrays.toString(randNumbers));
        System.out.print("Min: " + randNumbers[0]);
    }

}
