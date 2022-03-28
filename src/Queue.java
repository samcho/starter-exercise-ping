public class Queue <T> {
    private class Node {
        T value; // object in node
        Node prev; // prev Node in list
        Node next; // next Node in list

        // default constructor
        private Node() {
            value = null;
            prev = null;
            next = null;
        }
        // constructor
        private Node(T v, Node p, Node n) {
            value = v;
            prev = p;
            next = n;
        }
    }
    private Node head; // first node in list
    private Node tail; // last node in list
    private int size;
    Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        // FINISH ME
    }

    // return whether queue is empty or not
    public boolean empty() {
        // FINISH ME
    }

    public int size() {
        // FINISH ME
    }

    public void enqueue (T value) {
        // FINISH ME
    }

    public T dequeue () {
        // FINISH ME
    }

    // Return the value at the beginning of the queue
    public T peek() {
        // FINISH ME
    }
}
