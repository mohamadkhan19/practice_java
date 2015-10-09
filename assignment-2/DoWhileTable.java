
public class DoWhileTable {
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]), j=0;
		do
		{
			System.out.println(i+"*"+j+"="+i*j);
			j++;
		}while(j<=12);
	}

}
