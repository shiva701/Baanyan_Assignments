package assignmentOOPs.Q2;

public class Employee {
	int empID;
	double sal=0;
	double basic;
	double allowance;
	double deductions;
	String firstName;
	String lastName;
	String address;
	String pincode;
	String realName;
	
	public Employee(int empID, double basic, double allowance, double deductions,
			String firstName, String lastName, String address, String pincode) {
		if((firstName==null || lastName==null) || (firstName + lastName).length()<=0) {
			System.out.println("Real name must not be empty");
			return;
		}
		this.empID = empID;
		this.basic = basic;
		this.allowance = allowance;
		this.deductions = deductions;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pincode = pincode;
		this.realName = this.firstName + " " + this.lastName;
		this.sal = this.basic + this.allowance - this.deductions;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	//salary read only
	public double getSal() {
		return sal;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getRealName() {
		return realName;
	}

	//setting real name based on first and last name
	public void setRealName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		if((firstName + lastName).length()<=0) {
			System.out.println("Real name must not be empty");
			return;
		}
		this.realName = this.firstName +" "+ this.lastName;
	}
	
	//method to calculate salary
	public void calculateSalary() {
		this.sal = this.basic + this.allowance - this.deductions;
	}

}
