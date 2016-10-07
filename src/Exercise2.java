import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an integer: ");
		num1 = sc.nextInt();
		 
	      if ( num1 % 2 == 0 )
	         System.out.println("This input integer is even number.");
	      else
	         System.out.println("This input integer is odd number.");

	}

}
