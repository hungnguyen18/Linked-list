package linkedList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		
		list.addFirst(0);
		list.addFirst(1);
		
		list.remove(0);
		
		list.print();
	}

}
