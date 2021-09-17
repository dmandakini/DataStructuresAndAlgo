package lowerBound;

public class lowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-1,2,3,5};
		int value = 4;
		int[] arr1 = {1,2,3,4,5,6};	
		System.out.println(lowerBoundValue(arr,value));
		System.out.println(lowerBoundValue(arr1,value));
	}
	
	public static int lowerBoundValue(int[] ar, int value) {
		int lowerBound = -1;
		for (int i = 0; i < ar.length; i++) {
			if (lowerBound < ar[i]  && ar[i]<= value) {
				lowerBound = ar[i];
			}		
		}
		return lowerBound;
	}

}
