
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {10,20,30,44,55};
		
		int len = marks.length;
		
		System.out.println("in main: "+ len);
		PrintArr(marks, len);
		
		for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

	}
	
	public static void PrintArr(int[] arr, int len) {
		len=len+5;
		System.out.println("in Func: "+ len);
		
		arr[0] = 100;
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
	}

}
