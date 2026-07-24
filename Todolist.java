
public class Todolist {

	public static void main(String[] args) {
		
		DoublyLinkedList todolist = new DoublyLinkedList();
		
		todolist.insert("Finish Homework");
		System.out.println(todolist.traversal());
		
		todolist.insert("Laundry");
		todolist.insert("Group Meeting");
		System.out.println(todolist.traversal());
		
		//EX2.1
		todolist.insert(0, "Submit Report");
		System.out.println(todolist.traversal());
		//EX2.2
		todolist.insert(2, "Buy Food");
		System.out.println(todolist.traversal());
		//EX2.3
		todolist.insert("Go to Gym");
		System.out.println(todolist.traversal());
	}
}
