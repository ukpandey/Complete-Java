package JavaCollectionsAnuj.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>(); // stores element in random order
        hs.add(23);
        hs.add(45);
        hs.add(45);
        hs.add(12);
        System.out.println(hs);
        hs.remove(33);
        System.out.println(hs.contains(33));
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // maintains the order
        List<Integer> ar = Arrays.asList(4,3,7,4,6); 
        lhs.addAll(ar);
        System.out.println(lhs);

        Set<Integer> st = new TreeSet<>(Comparator.reverseOrder()); // stores in sorted order u can use comparator as well
        st.addAll(ar);
        System.out.println(st);
    }
}
