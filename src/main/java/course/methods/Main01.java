package course.methods;

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] mainTab = new int[50];
        System.out.println(Arrays.toString(mainTab));
        for(int i = 0; i< mainTab.length; i++) {
            mainTab[i] = i;
        }
        System.out.println(Arrays.toString(mainTab));
        for (int i = 0; i < mainTab.length; i++) {
            if (mainTab[i] % 10 ==0) {
                System.out.println();
            } if (mainTab[i] <10) {
                System.out.print("0");
            }
            System.out.print(mainTab[i] + ", ");
        }
    }
}
