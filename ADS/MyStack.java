import static java.lang.reflect.Array.get;

public class MyStack<T> {


    public T push(T newItem) {
        addFront(newItem);
        return newItem;
    }

    private void addFront(T newItem) {
    }

    public T peek() {
        return get(0);
    }

    private T get(int i) {
        return null;
    }

    public T pop() {

        T removingItem = peek();
        removeFront();
        return removingItem;
    }

    private void removeFront() {
    }
}
