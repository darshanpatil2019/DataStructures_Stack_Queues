public class StackOperations<T> {
    Node head;

    public boolean isEmpty() {

        return head == null;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;         //first element
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        T top = head.data;     //assigning last element value to top
        head = head.next;
        return top;

    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return head.data;

    }

    public void Print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
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
        }
    }
}