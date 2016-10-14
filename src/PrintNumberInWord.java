import java.util.Scanner;
public class PrintNumberInWord {
	
	public static void main(String[] args) {
		int num;
		String[] str={"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an integer: ");
		num = sc.nextInt();
		
		if(num < 1 || num > 9){
			System.out.printf("This input integer is \"OTHER\".");
		}
		else{
			System.out.printf("This input integer is %s.", str[num-1]);
		}
		
	}

}
