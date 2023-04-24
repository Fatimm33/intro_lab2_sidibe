package HelloWorld;
import java.util.Scanner;

public class Main1 {

		// TODO Auto-generated method stub

		   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		        int number = scnr.nextInt();

		        while (number > 0) {
		            int digit = number % 10;
		            System.out.println(digit);
		            number /= 10;
		        }
		   }

	}
