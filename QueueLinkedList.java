/**
 *  * QueueLinkedList.java This file implements QueueInterface.java 		
 *  
 *  This file has
 * two attributes. A front attribute refers to the front element in the queue. 	
 * A rear attribute refers to the rear element in the queue. 			
 * 
 * One default
 * constructor that initializes the two attributes. 				
 * 
 * An enqueue method receives
 * an object and place the object into the queue. 					
 * The enqueue method does not
 * throw overflow exception. 
 * 
 * A dequeue method returns and removes an object from			
 * front of the queue. 
 * 
 * The dequeue method will throw exception with message				
 * "Underflow" when the queue is empty. 
 * 
 * A size method returns number of elements							
 * in the queue. 
 * 
 * A toString method returns a String showing size and all  		
 * elements in the queue.
 */
package FinalExam.Queue;

/**
 * @author Arash
 *
 */
public class QueueLinkedList<T> implements QueueInterface<T> {

	//attributes
	private Node front, rear; 
	private T ptr;
	
	// constructor
	public QueueLinkedList() {
		front = null;
		rear = null;
		ptr = null;		
	}
	public void enqueue(T object) throws Exception {
		Node node = new Node(object, rear);	//proper way is to only pass data into new Node	
		/*
		 * pointer to a node
		 * one is an actual node
		 * 
		 * Node node = new Node(object);
		 * rear.setNode(node);
		 * rear = rear.getNode();
		 */
		rear = node;	
		
		/*
		 * Node element = new Node (object)
		 * if rear == null or front == null
		 * front = element
		 * rear - element
		 * 
		 * else rear.setlink(element)
		 * rear = element
		 */
	}

	public T dequeue() throws Exception {
		if (size() <= 0)
			throw new Exception("Underflow");
		
		T tempFront = null;		
		front = rear;		
		while (true) {
			if ( (front.getNode() == null) || (front.getNode().getData() == ptr) ) { //change ptr to track Node and not Data
				tempFront = front.getData();
				break;
			} else {
				front = front.getNode();
			}
		}
		
		ptr = tempFront;
		return tempFront;
		
		/*
		 * if (front == null)
		 * throw new Exception ("Underflow")
		 * 
		 * T elment = front.getInfo()
		 * front = front.getLink()
		 * 
		 * return element
		 */
	}
	
	public int size() {
		Node tempNode = rear;
		int counter = 0;
		while(tempNode != front) {
			tempNode = tempNode.getNode();
			counter++;
		}
		return counter;
		
		/*
		 * int size = 0;
		 * Node ptr = front;
		 * while ( ptr != null )
		 * ptr = ptr.getLink()
		 * size ++
		 * return size
		 */
	}
	
	public String toString() { 
		String tempQueue = "Size: " + size() + "\n";
		while(rear.getData() != ptr) {
			tempQueue += rear.getData() + "\n";
			rear = rear.getNode();
		}
		return tempQueue;
	}
	
	class Node {
		private T data;
		private Node node;
		public Node() {
			data = null;
			node = null;
		}
		public Node(T data, Node node) {
			this.data = data;
			this.node = node;			
		}
		public void setData(T data) {
			this.data = data;
		}
		public T getData() {
			return data;
		}
		public void setNode(Node node) {
			this.node = node;
		}
		public Node getNode() {
			return node;
		}
	}
}