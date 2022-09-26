package collectionFramework;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        // methods of LikedList

        // queue:
        // offer(add) = to add new ele
        // poll(remove) = remove and return the ele
        // peek(next ele) = next ele to be removed

        Queue<Integer> qu = new LinkedList<>();
        qu.offer(10);
        qu.offer(12);
        qu.offer(32);
//      qu.poll();
        System.out.println("Linked List using queue: "+ qu);

        //List
        List<Integer> lst = new LinkedList<>();
        lst.add(10);
        lst.add(12);
        lst.add(32);
        System.out.println("Linked List using list: "+ lst);



    }
}
