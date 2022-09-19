/**
 *  * QueueArray.java This file implements QueueInterface.java   
 *  
 *  This file has  attributes of an array holding queue elements.  
 *  
 *  An integer represents front index, an integer for rear index, and an integer to keep track number of
 * elements in the queue. 							  
 * 
 *  An overloaded constructor accepts an integer for   
 * initializing the queue size, e.g. array size.
 * 
 *  An enqueue method receives an
 * object and place the object into the queue.    
 * 
 * The enqueue method will throw
 * exception with message "Overflow" when the queue is full.  
 * 
 * A dequeue method
 * returns and removes an object from front of the queue.  //implement
 * 
 *  The dequeue method
 * will throw exception with message "Underflow" when the queue is empty.  //implement
 * 
 * A size
 * method returns number of elements in the queue.      //implement
 * 
 * A toString method returns a
 * String showing size and all elements in the queue.  //implement
 */
package FinalExam.Queue;

/**
 * @author Arash
 *
 */
public class QueueArray<T> implements QueueInterface<T> {

	// attributes
	private int frontIndex, rearIndex, trackerIndex;
	private T[] queue;

	// overloaded constructor
	public QueueArray(int index) {
		queue = (T[]) new Object[index];
		frontIndex = 0;
		trackerIndex = 0;
		rearIndex = index; //queue.length -1
	}
	
	/**
	 * @param object into the queue
	 */
	public void enqueue(T object) throws Exception {
		if (trackerIndex >= rearIndex)
			throw new Exception("Overflow");
		queue[trackerIndex] = object;
		trackerIndex++;
		/*
		 * queue[++rear % queue.length] = object;
		 * size ++
		 * queue.length is size of 3
		 */
	}

	/**
	 * @return object that was removed from the queue
	 */
	public T dequeue() throws Exception { 		
		T tempQueue = queue[frontIndex];
		for (int i = 0; i < size() - 1; i++) {
			queue[i] = queue[i + 1];
			queue[i + 1] = null;
		}
		trackerIndex--;
		if (trackerIndex < frontIndex)
			throw new Exception("Underflow");
		return tempQueue;
		
		/*
		 * T obj = queue[front];
		 * queue[front] = null;
		 * front = ++front% queue.length;
		 * size --
		 * return obj
		 */
	}

	/**
	 * @return size
	 */
	public int size() {
		return trackerIndex;
	}

	/**
	 * @return String size, remaining objects in the queue
	 */
	public String toString() {
		String tempQueue = "Size: " + size() + "\n";
		for (int i = 0; i <= size(); i++)
			tempQueue += queue[i] + "\n";
		return tempQueue;
	}
}