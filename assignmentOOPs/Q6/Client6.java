package assignmentOOPs.Q6;

public class Client6 {

	public static void main(String[] args) {
		Auto auto1 = new Auto(14258);
		Auto auto2 = new Auto(14259);
		Auto auto3 = new Auto(14258);
		System.out.println("equals with self: " + auto1.equals(auto1));
		System.out.println("equals with different object with diff reg number: "
		+ auto1.equals(auto2));
		System.out.println("equals with different object with same reg number: "
				+ auto1.equals(auto3));
		
		System.out.println("\n\nget reg number test: " + auto1.getRegNumber());	
	}

}
