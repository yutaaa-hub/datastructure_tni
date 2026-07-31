
public class StackTest {

	public static void main(String[] args) {
		StackLinkedList stacks = new StackLinkedList();
		
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		
		System.out.print(stacks.peek());
		System.out.print(stacks.pop());
		System.out.print(stacks.peek());
	}

}
