
public class KadanesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,-2,3,5};
		int maxSum = 0;
		int currentSum =  0;
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (currentSum<0) {
				currentSum = 0;
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}	
			maxSum= Math.max(currentSum, maxSum);
		}
		System.out.print(maxSum);
	}
}
