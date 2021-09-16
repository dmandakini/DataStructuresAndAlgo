
public class PrintSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				for (int j2 = i; j2 < j; j2++) {
					System.out.print(arr[j2]+",");
				}
				 System.out.println();
			}
			
		}

	}

}
