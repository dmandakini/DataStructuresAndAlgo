
public class PrintMaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,-2,3,5};

		int max=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int j2 = i; j2 <=j; j2++) {
					sum = sum + arr[j2];
				}
				if (sum>max)
				{
					max = sum;
				}			
			}
			
		}
		 System.out.println(max);

	}

}
