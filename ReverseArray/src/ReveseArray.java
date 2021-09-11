
public class ReveseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		var revArray=ReverseArray(arr);
		for (int i = 0; i < revArray.length; i++) {
			System.out.print(revArray[i]+",");
		}
	}
	
	public static int[] ReverseArray(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			var temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return arr;
	}

}
