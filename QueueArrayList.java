/**
 *  * QueueArrayList.java This file implements QueueInterface.java 
 *  
 *  This file has
 * only one ArrayList<T> type of attribute to hold queue elements. 
 * 
 *  One default
 * constructor initializes the ArrayList<T> queue. 
 * 
 *  An enqueue method receives an 
 * object and place the object into the queue.  
 * 
 * The enqueue method does not throw 				
 * overflow exception. 
 * 
 * A dequeue method returns and removes an object from queue
 * front. 
 * 
 * The dequeue method will throw exception with message "Underflow" when 
 * the queue is empty. 
 * 
 * A size method returns number of elements in the queue.  
 * 
 * A
 * toString method returns a String showing size and all elements in the queue. 
 */
package FinalExam.Queue;

import java.util.ArrayList;

/**
 * @author Arash
 *
 */
public class QueueArrayList<T> implements QueueInterface<T> {

	// attributes
	private ArrayList<T> queue;

	// constructor
	public QueueArrayList() {
		queue = new ArrayList<T>();
	}

	/**
	 * @param object into the queue
	 */
	public void enqueue(T object) throws Exception {
		queue.add(object);
	}

	/**
	 * @return object that was removed from the queue
	 */
	public T dequeue() throws Exception {		
		if (queue.isEmpty())
			throw new Exception("Underflow");
		T tempQueue = queue.get(0);
		queue.remove(0);
		return tempQueue;
	}

	/**
	 * @return size
	 */
	public int size() {
		return queue.size();
	}

	/**
	 * @return String size, remaining objects in the queue
	 */
	public String toString() {
		String tempQueue = "Size: " + size() + "\n";
		for (int i = 0; i < size(); i++)
			tempQueue += queue.get(i) + "\n";
		return tempQueue;
	}
}