package assignmentOOPs.Q5;

public class FreePass extends Fare {
	
	boolean isFreedomFighter;

	public FreePass(String origin, String destination, boolean isFreedomFighter) {
		super(origin, destination, 100);
		this.isFreedomFighter = isFreedomFighter;
	}
}
