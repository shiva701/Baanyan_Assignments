package assignmentOOPs.Q1;

public class CorporateWeekendBatchStudent extends Student {
	public int calculateFee(String course) {
		switch (course) {
		case "Java":
			return 7500;
		case "C++":
			return 6000;
		case "C":
			return 8500;
		default:
			System.out.println("Did not select the correct course");
			return 0;
		}
	}
}
