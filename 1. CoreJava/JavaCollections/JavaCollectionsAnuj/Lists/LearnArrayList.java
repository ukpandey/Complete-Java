package JavaCollectionsAnuj.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList{
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        arr.add(5, 7);
        System.out.println(arr);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(150);
        arr2.add(160);
        arr.addAll(arr2);
        System.out.println(arr);
        arr.addAll(2, arr2);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        arr.remove(Integer.valueOf(160));
        System.out.println(arr);
        arr.remove(Integer.valueOf(150));
        System.out.println(arr);
        arr.set(0, 1000);
        System.out.println(arr);
        System.out.println(arr.contains(150));
        // arr.clear();
        // System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("For loop " + arr.get(i));
        }

        for(int i:arr){
            System.out.print(i +" ");
        }
        System.out.println();

        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}