package JavaCollectionsAnuj.Lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> ls = Arrays.asList(8,2,3,4,1,3,5,6,3,6,2,2,4);
        for(Integer i:ls){
            if(!mp.containsKey(i))
                mp.put(i,1);
            else
                mp.put(i, mp.get(i)+1);
        }
        System.out.println(mp);

        mp = new TreeMap<>(Comparator.reverseOrder());
        for(Integer i:ls){
            if(!mp.containsKey(i))
                mp.put(i,1);
            else
                mp.put(i, mp.get(i)+1);
        }
        System.out.println(mp);
        
    }
}
