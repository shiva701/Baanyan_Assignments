package assignmentOOPs.Q2;

public class NightShiftEmployee extends Employee {

	double nightAllowance;
	public NightShiftEmployee(int empID, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, double nightAllowance) {
		super(empID, basic, allowance, deductions, firstName, lastName, address, pincode);
		this.nightAllowance = nightAllowance;
	}
	
	public void calculateSalary() {
		this.sal = this.getBasic() + this.getAllowance() + this.nightAllowance - this.getDeductions();
	}

}
