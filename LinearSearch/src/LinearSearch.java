
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,3,2,31,43,5,6,65,76,56,99,100};
		System.out.println(Search(arr,57));
		System.out.println(Search(arr,56));
		
	}
	
	public static int Search(int[] arr,int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	

}
