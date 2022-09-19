package FinalExam.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		testQueue(new QueueArray<String>(3));
		testQueue(new QueueArrayList<String>());
		testQueue(new QueueLinkedList<String>());
	}

	private static void testQueue(QueueInterface<String> q) {

		try {
			q.enqueue("We're");
			q.enqueue("the");
			q.enqueue("champions.");
			System.out.print(q.dequeue() + ' ');
			q.enqueue("Summer");
			System.out.print(q.dequeue() + ' ');
			System.out.println(q.dequeue());
			q.enqueue("fun.");
			System.out.println("\n" + q);
			q.dequeue();
			q.dequeue();
			q.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------");
	}
}

/*
 * Provided: QueueDemo.java QueueInterface.java
 * 
 * Submit: Node.java This is linked list node. Node has two attributes info and
 * link. A default constructor initializes the two attributes. Accessor and
 * mutator methods for both attributes.
 * 
 * QueueArray.java This file implements QueueInterface.java This file has
 * attributes of an array holding queue elements. An integer represents front
 * index, an integer for rear index, and an integer to keep track number of
 * elements in the queue. An overloaded constructor accepts an integer for
 * initializing the queue size, e.g. array size. An enqueue method receives an
 * object and place the object into the queue. The enqueue method will throw
 * exception with message "Overflow" when the queue is full. A dequeue method
 * returns and removes an object from front of the queue. The dequeue method
 * will throw exception with message "Underflow" when the queue is empty. A size
 * method returns number of elements in the queue. A toString method returns a
 * String showing size and all elements in the queue.
 * 
 * QueueArrayList.java This file implements QueueInterface.java This file has
 * only one ArrayList<T> type of attribute to hold queue elements. One default
 * constructor initializes the ArrayList<T> queue. An enqueue method receives an
 * object and place the object into the queue. The enqueue method does not throw
 * overflow exception. A dequeue method returns and removes an object from queue
 * front. The dequeue method will throw exception with message "Underflow" when
 * the queue is empty. A size method returns number of elements in the queue. A
 * toString method returns a String showing size and all elements in the queue.
 * 
 * QueueLinkedList.java This file implements QueueInterface.java This file has
 * two attributes. A front attribute refers to the front element in the queue. A
 * rear attribute refers to the rear element in the queue. One default
 * constructor that initializes the two attributes. An enqueue method receives
 * an object and place the object into the queue. The enqueue method does not
 * throw overflow exception. A dequeue method returns and removes an object from
 * front of the queue. The dequeue method will throw exception with message
 * "Underflow" when the queue is empty. A size method returns number of elements
 * in the queue. A toString method returns a String showing size and all
 * elements in the queue.
 * 
 * 

Sample Output: 

We're the champions.

Size: 2
Summer
fun.
null

Underflow
-----------------------
We're the champions.

Size: 2
Summer
fun.

Underflow
-----------------------
We're the champions.

Size: 2
Summer
fun.

Underflow
-----------------------

 * 
 */
