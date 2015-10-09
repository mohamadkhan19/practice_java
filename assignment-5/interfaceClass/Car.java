package interfaceClass;

public class Car implements Suzuki,Fiat {

	public void getParts() {
		System.out.println("Fiat parts are installed");
	}

	public void getEngine() {
		System.out.println("Suzuki engine is installed");
	}
	
	public void getUpdate(){
		getParts();
		getEngine();
		
	}

}
