package assignmentOOPs.Q4;

public class CurrentAccount extends Account {
	double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterest(double extraInterest) {
		this.interestRate += extraInterest;
	}
}
