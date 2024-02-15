// package JavaCollections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class B_ArrayList {
    public static void main(String[] args) {
        Collection nums = new ArrayList();
        nums.add(7);
        nums.add(8);
        nums.add(6);
        nums.add(6);
        System.out.println(nums);

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(5);
        nums2.add(6);
        nums2.add(2);

        System.out.println(nums2);

        for(int i:nums2)
         System.out.println(i);

        for(int i=0; i<nums2.size(); i++)
            // System.out.println(nums2[i]); will not work
            System.out.println(nums2.get(i));

        Iterator<Integer> iterator = nums2.iterator();
        while (iterator.hasNext()) {
                Integer num = iterator.next();
                // Do something with num, for example print it
                System.out.println(num);
            }
        
    }
}
