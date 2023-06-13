package flowControl;

public class Pattern9 {

	public static void main(String[] args) {
		int cnt = 2;
		while(cnt<51) {
			System.out.print((cnt) +" ");
			cnt+=2;
			if(cnt%10==2) {
				System.out.println();
			}
		}
	}

}
