package ListExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<>();

        
        queue.offer("x"); 
        queue.offer("y"); 
        queue.offer("z"); 

        System.out.println("Queue after adding elements: " + queue);

        queue.poll();
        queue.poll();

        
        System.out.println("Queue after removing two elements: " + queue);
    }
}
