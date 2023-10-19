/**
 * internalImplementation
 */
import java.util.*;
public class internalImplementation {

    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>(null);
        
        Queue<Integer>q=new LinkedList<>();
        q.offer(9);
        q.offer(8);
        q.offer(7);
        for (Integer integer : q) {
            System.out.print(integer+" ");
        }
    }
}