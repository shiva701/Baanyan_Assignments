package assignmentOOPs.Q4;

public class Account {
	long accNo;
	String name;
	String mobileNumber;
	double balance;

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
}
