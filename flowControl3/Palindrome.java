package flowControl3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******* Menu ********");
		System.out.println("1. Check a number");
		System.out.println("2. Exit");
		int option;
		while(true) {
			System.out.println("Choose an option: ");
			option = sc.nextInt();
			if (option == 1) {
				System.out.println("Enter the number to check palindrome: ");
				int n = sc.nextInt();
				StringBuffer num = new StringBuffer();
				num.append(n);
				String orig = num.toString();
				System.out.println(orig.contentEquals(num.reverse()));
			}else {
				sc.close();
				System.out.println("Thank you!!");
				System.exit(0);
			}
		}
	}
}
