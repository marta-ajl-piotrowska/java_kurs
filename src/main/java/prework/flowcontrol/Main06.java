package prework.flowcontrol;

public class Main06 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            int modulo = i%2;
            if (modulo == 0) {
                System.out.println(i + "- even");
            }
            else {
                System.out.println(i + "- odd");
            }
        }
        int i = 0;
        while (i <= n) {
            int modulo = i%2;
            if (modulo == 0) {
                System.out.println(i + "- even");
            }
            else {
                System.out.println(i + "- odd");
            }
            i++;
        }
    }
}
