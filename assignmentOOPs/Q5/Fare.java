package assignmentOOPs.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Fare {
	String origin;
	String destination;
	double fare;
	double discount;
	
	public Map<List<String>, Double> getFares() {
		return fares;
	}

	public void setFares(Map<List<String>, Double> fares) {
		this.fares = fares;
	}

	//we can have a list with origin and destination mapped to fair
	Map<List<String>, Double> fares;
	
	public Fare(String origin, String destination, double discount) {
		if(this instanceof SeasonalPass) {
			this.discount = 10;
		}
		else {
			this.discount = discount;
		}
		this.origin = origin;
		this.destination = destination;
	}
	
	public void calculateFare() {
		//code to calculate fare. Find the fare via origin and destination 
		// from the map
		List<String> tmp = new ArrayList<>();
		tmp.add(this.origin);
		tmp.add(this.destination);
		this.fare = fares.get(tmp)*(1-discount/100);
	}
	
	public void printsFare() {
		System.out.println("The fare is: " + this.fare);
	}
	
}
