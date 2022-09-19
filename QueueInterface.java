package FinalExam.Queue;

public interface QueueInterface<T> {
	public void enqueue(T object) throws Exception;

	public T dequeue() throws Exception;

	public int size();

	public String toString();
}
