package flowControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		List<List<Integer>> ans = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of pascal triangle you want: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			List<Integer> tmp = new ArrayList<>();
			for(int j=0;j<i+1;j++) {
				if(j==0 || j==i) {
					tmp.add(1);
				}else {
					tmp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
				}
			}
			ans.add(tmp);
		}
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
