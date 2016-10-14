import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter string 1: ");
		str1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		str2 = sc.nextLine();
		
		if (str1.toUpperCase().equals(str2.toUpperCase())) {
			System.out.printf("The two strings are the same.");
		}
		
		else {
			System.out.printf("The two strings are not the same.");
		}
	}

}
