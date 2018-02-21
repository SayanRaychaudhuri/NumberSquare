import java.util.*;

public class NumberSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Min? ");
        int min = input.nextInt();
        System.out.print("Max? ");
        int max = input.nextInt();
        String numString = "";
        for (int i = min; i <= max; i++) {
            numString += String.valueOf(i);
        }
            for (int j = 0; j < numString.length() - 1; j++) {
                System.out.println(numString.substring(j) + numString.substring(0, j));
            }
    }
}
