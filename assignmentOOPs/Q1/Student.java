package assignmentOOPs.Q1;

//creating a custom exception for name
class InvalidNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String msg) {
		super(msg);
	}
}

//creating a custom exception
class InvalidMobileNumberException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMobileNumberException(String msg) {
		super(msg);
	}
}

public class Student {
	private int studentId;
	private String name;
	private String mobileNumber;
	private String address;
	private String course;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
		if(name.length()>15) {
			System.out.println("Cannot set name, length is greater than 15 characters. Please try again!");
			throw new InvalidNameException("Cannot set name, length is greater than 15 characters. Please try again!");
		}
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) throws InvalidMobileNumberException{
		if(mobileNumber.length()>10) {
			System.out.println("Incorrect mobile number, please try again!!");
			throw new InvalidMobileNumberException("Incorrect mobile number, please try again!!");
		}
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int calculateFee(String course) {
		switch(course) {
			case "Java" : return 25000;
			case "C++" : return 20000;
			case "C" : return 30000;
			default : System.out.println("Did not select the correct course"); 
				return 0;
		}
			
	}
}
