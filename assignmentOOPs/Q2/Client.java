package assignmentOOPs.Q2;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new PartTimeEmployee(101, 18000, 2000, 1500, "Ram", "Sharma", "Chicago", "12880");
		System.out.println("Real Name: " + e1.getRealName());
		System.out.println("Salary: " + e1.getSal());
	}

}
