public class MyStack {
    public static void main(String[] args) {
        StackOperations obj = new StackOperations();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.Print();

        System.out.println();
        while (!obj.isEmpty()) {
            obj.peek();
            System.out.println("Pop: " + obj.pop());
        }
        System.out.println();
        obj.Print();

    }
}

