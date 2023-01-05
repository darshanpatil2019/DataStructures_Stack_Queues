public class MyQueue {
    public static void main(String[] args) {
        QueueOperations list = new QueueOperations();
        //enqueue
        list.add(56);
        list.add(30);
        list.add(70);

        list.print();
        System.out.println();

        //dequeue
        list.remove();
        list.print();
    }
}