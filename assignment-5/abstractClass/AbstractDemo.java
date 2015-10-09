package abstractClass;

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alto car1=new Alto();
		Truck car2=new Truck();
		System.out.println("Number of seats in car1 "+ car1.getNumberOfSeater());
		System.out.println("Color of car1 "+ car1.getColor());
		System.out.println("Number of wheels in car1 "+ car1.getNumberOfWheels());
		
		System.out.println("Number of seats in car2 "+ car2.getNumberOfSeater());
		System.out.println("Color of car2 "+car2.getColor());
		System.out.println("Number of wheels in car2 "+car2.getNumberOfWheels());
		
	

	}

}
