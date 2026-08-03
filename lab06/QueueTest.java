package lab06;

public class QueueTest {

	public static void main(String[] args) {
		
		//QueueArrayBased q = new QueueArrayBased();
		QueueLinkedList q = new QueueLinkedList();
		//add element in queue 10,11,12
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);

		//peek
		System.out.println(q.peek());
		
		System.out.println(q.dequeue());
		
		System.out.println(q.peek());
	}

}
