package assignmentOOPs.Q3;

public class Mobile implements IMobile, ITelephone {
	
	long iemiCode;
	int isSingleSim;
	String processor;
	int simCard;
	String mobileNo;
	
	public boolean connectBluetooth() {
		System.out.println("Bluetooth connected");
		return true;
	}
	
	public long getIemiCode() {
		return this.iemiCode;
	}
	
	public void getWifiConnection() {
		System.out.println("Wifi Connected!");
	}

	@Override
	public void dial(String mno) {
		System.out.println("Dialed the phone number: " + mno);
	}

	@Override
	public int getCameraCount(String mobileName) {
		switch(mobileName) {
		case "Nokia":
			return 2;
		case "iPhone Pro":
			return 3;
		case "samsung Galaxy":
			return 4;
		default:
			return 1;
		}
	}

}
