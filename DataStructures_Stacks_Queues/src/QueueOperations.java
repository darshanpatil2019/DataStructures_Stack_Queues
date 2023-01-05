public class QueueOperations<T> {

    Node head;
    Node tail;

    int size;

    public QueueOperations() {
        this.size = 0;
    }

    public boolean isEmpty() {

        return head == null && tail == null;
    }

    //enqueue
    public void add(T data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = head = newNode;    //first element
        }

        tail.next = newNode;
        tail = newNode;

    }

    //dequeue
    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        size--;
        T front = head.data;
        head = head.next;
        return front;
    }

    //peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        return head.data;

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        Node temp = head;
        {
            while (temp != null) {                            //traversing
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
}

