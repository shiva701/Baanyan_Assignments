package flowControl01;

public class Question4 {

	public static void main(String[] args) {
		Character a1 = 'x';
		Character a2 = 'a';
		if(a1<a2) {
			System.out.println(a1 + " " + a2);
		}else {
			System.out.println(a2 + " " + a1);
		}
		System.out.println(a1 + "->" + Character.toUpperCase(a1));
		System.out.println(a2 + "->" + Character.toUpperCase(a2));
		System.out.println("Hello World".toLowerCase());
		
		//add all the digits in the number
		int num = 123456;
		String numS = ""+num;
		int ans=0;
		for(int i=0;i<numS.length();i++) {
			ans+=numS.charAt(i)-'0';
		}
		System.out.println("sum of all the digits is: " + ans);
	}
}
