
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumOverload s1= new SumOverload();
		System.out.println("sum is "+s1.sum(10, 20));
		System.out.println("sum is "+s1.sum(10, 20, 30));
		System.out.println("sum is "+s1.sum(10.12f, 20.38f));
		System.out.println("sum is "+s1.sum(10.3f, 20.4f, 30.3f));
		

	}

}
