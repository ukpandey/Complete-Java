package JavaCollectionsAnuj.Lists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPQ {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        pq2.offer(40);
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);
        System.out.println(pq2);
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
    }
}
