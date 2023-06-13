package assignmentOOPs.Q2;

public class FullTimeEmployee extends Employee {

	double fullTimeExtra;
	public FullTimeEmployee(int empID, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double fullTimeExtra) {
		super(empID, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.fullTimeExtra = fullTimeExtra;
	}
	
	public void calculateSalary() {
		this.sal = this.getBasic() + this.fullTimeExtra + this.getAllowance() - this.getDeductions();
	}

}
