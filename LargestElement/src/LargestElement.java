
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {-3,4,1,2,3};
		int[] arr = {-1,-2,-3,-3,8};
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.print(max);
	}

}
