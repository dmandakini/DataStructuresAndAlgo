
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,-2,3,5};
		int[] prefixSum = new int[100];
		prefixSum[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = arr[i] + prefixSum[i-1];		
		}
		
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
			
				int sum = (i<=0)?prefixSum[j]: prefixSum[j] - prefixSum[i-1];		
				if (sum>max)
				{
					max = sum;
				}			
			}
			
		}
		 System.out.println(max);

	}

}
