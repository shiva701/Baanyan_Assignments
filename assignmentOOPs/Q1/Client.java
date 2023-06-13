package assignmentOOPs.Q1;

public class Client {

	public static void main(String[] args) throws InvalidNameException, InvalidMobileNumberException {
		Student s1 = new Student();
		s1.setName("Shiva Shukla");
		s1.setAddress("Fairfax");
		s1.setCourse("Java");
		s1.setMobileNumber("7033649628");
		s1.setStudentId(101);
		System.out.println(" Student Id: " + s1.getStudentId() + " \n Name: " + s1.getName() + " \n Address: "
				+ s1.getAddress() + " \n Mobile: " + s1.getMobileNumber() + " \n Course: " + s1.getCourse() + " \n Fees: "
				+ s1.calculateFee(s1.getCourse()));
		
		Student s2 = new FastTrackBatchStudent();
		s2.setName("Ram Sharma");
		s2.setAddress("Austin");
		s2.setCourse("C++");
		s2.setMobileNumber("7033649618");
		s2.setStudentId(102);
		System.out.println("\n\n\n\n Student Id: " + s2.getStudentId() + " \n Name: " + s2.getName() + " \n Address: "
				+ s2.getAddress() + " \n Mobile: " + s2.getMobileNumber() + " \n Course: " + s2.getCourse() + " \n Fees: "
				+ s2.calculateFee(s2.getCourse()));
	}
}
