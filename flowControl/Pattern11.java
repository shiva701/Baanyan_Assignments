package flowControl;

public class Pattern11 {

	public static void main(String[] args) {
		int cnt = 1;
		for(int i=1;i<8;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((cnt++)+" ");
			}
			System.out.println();
		}
	}

}
