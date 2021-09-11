import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] marks = new int[100];
		
		System.out.println("Enter number of students");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i< n ;i++) {
			var studentNo = i+1;
			System.out.println("Enter marks of student: " + studentNo);
			marks[i]=scan.nextInt();
		}
		
		for(int i=0; i< n ;i++) {
			var studentNo = i+1;
			System.out.println("Marks of student - " + studentNo + " is: " + marks[i]);
		}
	}
	
}
