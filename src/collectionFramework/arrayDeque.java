package collectionFramework;
import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        // methods:

        // queue methods are allowed :
        // offer, poll, peek

        // uniqueFunction of ArrayDeque:
        // offerFirst, offerLast(same as offer)
        // peekFirst, peekLast
        // pollFirst, pollLast

        ArrayDeque<Integer> aq = new ArrayDeque<>();


        aq.offerLast(44);
        aq.offerFirst(23);
        aq.offer(11);
        System.out.println(aq);
    }
}
