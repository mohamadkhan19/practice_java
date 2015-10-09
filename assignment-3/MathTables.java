
public class MathTables {

	public static void main(String[] args) {
		int i=11,j=11;
		int tables[][]= new int[i][j];
		
		try{
		for(i=1;i<=10;i++){
			for(j=1;j<=10;j++){
				tables[i][j]=i*j;
			}	
		}
		
		for(i=1;i<=10;i++){
			System.out.println("Math Table "+ i);
			for(j=1;j<=10;j++){
				System.out.println(i+"X"+j+"="+tables[i][j]); 
			}	
		}

		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}

}
