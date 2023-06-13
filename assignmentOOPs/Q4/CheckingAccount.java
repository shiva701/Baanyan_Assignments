package assignmentOOPs.Q4;

public class CheckingAccount extends Account {
	double interestRate;
	int noOfFreeTransactions;
	int transactionCount = 0;
	double extraFee;

	public double getExtraFee() {
		return extraFee;
	}

	public void setExtraFee(double extraFee) {
		this.extraFee = extraFee;
	}

	public int getNoOfFreeTransactions() {
		return noOfFreeTransactions;
	}

	public void deposit(double amount) {
		transactionCount++;
		if(this.transactionCount>this.noOfFreeTransactions) {
			this.balance-= (this.transactionCount - this.noOfFreeTransactions)*this.extraFee;
		}
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.transactionCount++;
		if(this.transactionCount>this.noOfFreeTransactions) {
			this.balance-= (this.transactionCount - this.noOfFreeTransactions)*this.extraFee;
		}
		this.balance -= amount;
	}

	public void setNoOfFreeTransactions(int noOfFreeTransactions) {
		this.noOfFreeTransactions = noOfFreeTransactions;
	}

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
