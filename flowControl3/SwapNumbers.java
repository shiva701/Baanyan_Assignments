package flowControl3;

import java.util.Scanner;

public class SwapNumbers {
	static int num1, num2;
	
	enum Cats {name, name1, name2};
	SwapNumbers(){
		
	}

	static void swapWithTemp() {
		int tmp = SwapNumbers.num1;
		SwapNumbers.num1 = SwapNumbers.num2;
		SwapNumbers.num2 = tmp;
	}
	
	static void swapWithoutTemp() {
		SwapNumbers.num1 = SwapNumbers.num1 ^ SwapNumbers.num2;
		SwapNumbers.num2 = SwapNumbers.num1 ^ SwapNumbers.num2;
		SwapNumbers.num1 = SwapNumbers.num1 ^ SwapNumbers.num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		SwapNumbers.num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		SwapNumbers.num2 = sc.nextInt();
		sc.close();
		SwapNumbers.swapWithTemp();
		System.out.println("Numbers swapped using temp variable: " + SwapNumbers.num1 + " " + SwapNumbers.num2);
		swapWithoutTemp();
		System.out.println("\nNumbers swapped without temp variable making it original: " + SwapNumbers.num1 + " " + SwapNumbers.num2);
	}

}
