package JavaCollectionsAnuj.Lists;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }

        Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        // LinkedList<Integer> ls = new LinkedList<>();
        
    }
}
