package assignmentOOPs.Q2;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(int empID, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empID, basic, allowance, deductions, firstName, lastName, address, pincode);
	}
	
	public void calculateSalary() {
		//part-time employee, so no allowance
		this.sal = this.getBasic() - this.getDeductions();
	}

}
