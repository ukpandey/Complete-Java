package JavaCollectionsAnuj.Lists;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerLast(3);
        dq.offerLast(4);
        System.out.println(dq);
        dq.offer(6);
        dq.offer(7);
        dq.offer(8);
        dq.offer(9);
        while(!dq.isEmpty()){
            System.out.println(dq);
            dq.poll();
            System.out.println(dq);
            dq.pollFirst();
            System.out.println(dq);
            dq.pollLast();
        }
    }
}
