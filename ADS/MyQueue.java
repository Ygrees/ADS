public class MyQueue<T> {

    public T peek () {
        return get(0);
    }

    private T get(int i) {
        return null;
    }

    public T enqueue(T newItem) {
        addBack(newItem);
        return newItem;
    }

    private void addBack(T newItem) {
    }

    public T dequeue() {
        T removingItem = peek();
        removeFront();
        return removingItem;
    }

    private void removeFront() {
    }


}
