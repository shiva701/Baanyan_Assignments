package assignmentOOPs.Q6;

public abstract class Vehicle {
	long regNumber;

	public long getRegNumber() {
		return regNumber;
	}

	abstract int getNumberOfWheels(long regNumber);
	
	@Override
	public boolean equals(Object o) {
		if (o==this) {
			return true;
		}
		if(!(o instanceof Vehicle)) {
			return false;
		}
		Vehicle tmp = (Vehicle)o;
		return this.regNumber == tmp.regNumber;
	}
}
