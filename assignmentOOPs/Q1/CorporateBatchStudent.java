package assignmentOOPs.Q1;

public class CorporateBatchStudent extends Student {
	public int calculateFee(String course) {
		switch (course) {
		case "Java":
			return 15000;
		case "C++":
			return 12000;
		case "C":
			return 17000;
		default:
			System.out.println("Did not select the correct course");
			return 0;
		}
	}
}
