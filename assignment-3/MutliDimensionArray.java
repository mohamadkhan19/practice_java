import java.io.DataInputStream;


public class MutliDimensionArray {

	public static void main(String[] args) {
		int i=3,j=3,k=3;
		int studentArray[][][]= new int[i][j][k];
		DataInputStream dis = new DataInputStream(System.in);
		
		for(i=0;i<3;i++){
			System.out.println("Student "+(i+1));
			for(j=0;j<3;j++){
				System.out.println("Semister "+(j+1));
				for(k=0;k<3;k++){
					System.out.println("enter marks" +
							" in subject "+(k+1));
					try{
					studentArray[i][j][k]=Integer.parseInt(dis.readLine());
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					
				}}}
				
		for(i=0;i<3;i++){
			System.out.println("Student "+(i+1));
				for(j=0;j<3;j++){
					System.out.println("Semister "+(j+1));
					for(k=0;k<3;k++){
						System.out.println("marks" +
								" in subject "+(k+1));
						try{
						System.out.println(studentArray[i][j][k]);;
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						
						
					}}}
					
		}
}
