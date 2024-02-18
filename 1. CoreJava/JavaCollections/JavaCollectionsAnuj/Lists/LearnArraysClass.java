package JavaCollectionsAnuj.Lists;

import java.util.Arrays;

public class LearnArraysClass {
    static void print(int[] arr){
        for(int i:arr)
            System.out.print(i +" ");
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        // System.out.println(num);
        print(num);
        Arrays.sort(num);
        // System.out.println(num);
        print(num);
        Arrays.fill(num,23);
        // System.out.println(num);
        print(num);
    }
}
