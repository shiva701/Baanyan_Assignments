package flowControl;

public class Pattern8 {

	public static void main(String[] args) {
		int cnt = 1;
		while(cnt<49) {
			System.out.print((cnt+=2) +" ");
			if(cnt%10==1) {
				System.out.println();
			}
		}
	}

}
