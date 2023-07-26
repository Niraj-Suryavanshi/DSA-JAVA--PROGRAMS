import java.util.*;
public class DequeProgram {
    public static void main(String[] args) {
        Deque<Integer>deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(4);
        deque.add(3);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
