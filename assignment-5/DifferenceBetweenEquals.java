
public class DifferenceBetweenEquals {

	public static void main(String[] args) {
		
		String obj1 = new String("xyz");

		String obj2 = new String("xyz");

		if(obj1 == obj2)
		   System.out.println("obj1==obj2 is TRUE");
		else
		  System.out.println("obj1==obj2 is FALSE");
		
		String obj3 = "Hello";
		String obj4 = "Hello";

		if(obj3 == obj4)
		   System.out.println("obj3==obj4 is TRUE");
		else
		  System.out.println("obj3==obj4 is FALSE");
		
		if(obj1.equals(obj2))
			   System.out.println("obj1==obj2 is TRUE");
			else
			  System.out.println("obj1==obj2 is FALSE");

	}

}
