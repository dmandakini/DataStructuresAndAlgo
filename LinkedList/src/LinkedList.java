import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {	
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}	
	}
	
	private Node first;
	private Node last;
	
	public void addFirst(int value) {
		var node =  new Node(value);
		if (first == null) {
			this.first =  node;
			this.last = node;
		}
		else {
			var temp = this.first;
			this.first = node;
			this.first.next=temp; 
		}
	}
	
	public void addLast(int value) {
		var node =  new Node(value);
		if(this.last == null) {
			this.first =  node;
			this.last = node;
		}
		else {
			this.last.next = node;
			this.last=node;			
		}	
	}
	
	public void Print() {
		var node= first;
		while(node!=null) {
			System.out.println(node.value);
			node=node.next;			
		}
	}
	
	public int indexOf(int item) {
		int index=0;
		var node= first;
		while(node!=null) {
			if(node.value==item) {
				return index;
			}
			index++;
			node=node.next;			
		}
		return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public void removeFirst() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		if (first==last) {
			first = last = null;
			return;
		}
		var node=first.next;
		first.next=null;
		first=node;		
	}
	
	public void removeLast() {
		
		if (first==last) {
			first = last = null;
			return;
		}
		var node = first;
		while(node != null) {
			if(node.next.next==null) {
				last = node;
				node.next=null;
				return;
			}
			node=node.next;
		}
	}
}
