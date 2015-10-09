package abstractClass;

public class Truck extends Vehicle {

	@Override
	public int getNumberOfSeater() {
		return 2;
		
	}

	@Override
	public String getColor() {
		return "Yellow";
		
	}
	
	@Override
	public int getNumberOfWheels(){
		return 6;
		
	}

}
