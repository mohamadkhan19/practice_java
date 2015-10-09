
public class BinarySearchSort {
	static int[] arr=null;
	static int key;
	
			   public static void printArray(int[] arr) {
			      for (int i = 0; i < arr.length; i++) {
			         System.out.print(arr[i] + " ");
			      }
			   }
	

			   public BinarySearchSort(int[] arr, int key) {
				   
				   this.arr=arr;
				   this.key=key;
			   }
			   
			   public static int sort(){
			      int first = 0;
			      int last = arr.length-1;
			      while (first <= last) {
			         int mid = (first+last) / 2;
			         if (key > arr[mid]) {
			            first = mid + 1;
			         }
			         else if (key < arr[mid]) {
			            last = mid - 1;
			         }
			         else {
			            return mid;
			         }
			      }
			      return -1;
			   }
			   
			  
				 
			   
}
