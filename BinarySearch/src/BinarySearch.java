
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,13,21,31,43,51,61,65,76,86,99,100};
		
		System.out.println(Search(arr,51));
		System.out.println(Search(arr,56));
		System.out.println(Search(arr,100));
		System.out.println(Search(arr,10));
	}
	
	public static int Search(int[] arr, int key) {
		int high = arr.length-1;
		int low = 0;	
		int mid;
		while(low<=high) {
			mid = (high+low)/2;
			if(arr[mid]==key) {
				return  mid;
			}
			else if(key < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}

}
