package flowControl;

public class Pattern7 {

	public static void main(String[] args) {
		int cnt = 1;
		while(cnt<51) {
			System.out.print((cnt++) +" ");
			if(cnt%10==1) {
				System.out.println();
			}
		}
	}

}
