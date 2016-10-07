import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int num1;
		float num2, total;
		String str1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an integer: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter a float point number: ");
		num2 = sc.nextFloat();
		
		System.out.println("Enter your name: ");
		str1 = sc.nextLine();
		
		total = num1*num2;
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e.", sc.nextLine(), num1, num2, total);
	}

}
