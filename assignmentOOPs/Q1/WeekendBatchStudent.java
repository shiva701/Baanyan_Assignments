package assignmentOOPs.Q1;

public class WeekendBatchStudent extends Student {
	public int calculateFee(String course) {
		switch (course) {
		case "Java":
			return 5000;
		case "C++":
			return 3000;
		case "C":
			return 6000;
		default:
			System.out.println("Did not select the correct course");
			return 0;
		}
	}
}
