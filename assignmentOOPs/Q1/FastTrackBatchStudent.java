package assignmentOOPs.Q1;

public class FastTrackBatchStudent extends Student {
	public int calculateFee(String course) {
		switch (course) {
		case "Java":
			return 10000;
		case "C++":
			return 8000;
		case "C":
			return 12000;
		default:
			System.out.println("Did not select the correct course");
			return 0;
		}
	}
}
