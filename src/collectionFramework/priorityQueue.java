package collectionFramework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        // methods:

        // since PQ implements Queue interface it will have all its methods
        //  poll, peek, offer

        System.out.println("Understanding minHeap:");
        // default is minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//      Queue<Integer> pq1 = new PriorityQueue<>();


        pq.offer(30);
        pq.offer(22);
        pq.offer(64);
        pq.offer(223);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println("Understanding MaxHeap: ");
        // Maxheap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
//      Queue<Integer> pq1 = new PriorityQueue<>();


        pq1.offer(30);
        pq1.offer(22);
        pq1.offer(64);
        pq1.offer(223);

        System.out.println(pq1);
        pq1.poll();
        System.out.println(pq1);

        System.out.println(pq.peek());

    }
}
