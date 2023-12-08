package prework.flowcontrol;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = (n-1)-i; j < n; j++) {
                row += "* ";
            }
            System.out.print(row + "\n");
        }
    }
}
