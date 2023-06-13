package assignmentOOPs.Q2;

public class Manager extends Employee {

	double nightAllowance;
	double fullTimeExtra;
	public Manager(int empID, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double nightAllowance, double fullTimeExtra) {
		super(empID, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.nightAllowance = nightAllowance;
		this.fullTimeExtra = fullTimeExtra;
	}
	
	public void calculateSalary() {
		this.sal = this.getBasic() + this.fullTimeExtra + this.nightAllowance + this.getAllowance() - this.getDeductions();
	}

}
