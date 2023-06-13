package flowControl3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		String numS = ""+num;
		int len = numS.length();
		int ans=0;
		for(int i=0;i<len;i++) {
			ans+=Math.pow(numS.charAt(i)-'0',len);
		}
		System.out.println(ans==num);
		sc.close();
	}

}
