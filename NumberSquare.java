import java.util.*;
public class NumberSquare {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Min? ");
	String min = input.nextLine();
	System.out.print("Max? ");
	String max = input.nextLine();
	int Min = Integer.valueOf(min);
	int Max = Integer.parseInt(max);
	String numString = "";
	for (int i=Min;i<=Max;i++) {
		numString += String.valueOf(i);
	}
	if (Max%10==0) {
	for (int j=0; j<=numString.length()-2;j++){
		System.out.println(numString.substring(j, numString.length())+numString.substring(0, j));
			}
		} else {
	for (int j=0; j<=numString.length()-1;j++){
		System.out.println(numString.substring(j, numString.length())+numString.substring(0, j));
			}		
		}
	}
}

