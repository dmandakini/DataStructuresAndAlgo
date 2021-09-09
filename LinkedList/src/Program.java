
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList list = new LinkedList();
	list.addFirst(4);
	list.addLast(9);
	list.addLast(10);
	list.addFirst(17);
	list.Print();
	System.out.println(list.indexOf(10));
	System.out.println(list.indexOf(100));
	System.out.println(list.contains(17));
	System.out.println(list.contains(170));
	
	list.Print();
	System.out.println("remove first");
	list.removeFirst();
	list.Print();
	System.out.println("remove last");
	list.removeLast();
	list.Print();
	System.out.println("removeFirst");
	list.removeFirst();
	list.Print();
	System.out.println("remove");
	list.removeFirst();
	list.Print();

	}

}
