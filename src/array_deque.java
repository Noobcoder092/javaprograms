import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque();
        queue.add(23);
        queue.add(24);
        queue.add(25);
        queue.add(26);

        // BEFORE CHANGING
        System.out.println( " Before changing your elements are : " +queue);

        // AFTER CHANGING
        queue.addFirst(2300);   // REMEMBER DEQUE ID BOTH SIDE OPENED , WE CANNOT RUN LOOP , IT DOES NOT HAVE
        queue.addLast(2500);            // ENDING POINT

        System.out.println( " After changing your elements are : " +queue);
        // and many more methods ..........
    }
}
