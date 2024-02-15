class Student{
    public String name;
    public int rno;
}

public class arrays {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4};
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]);
        // }
        // int x[] = new int[5]; // array x of size 5 with all elements 0;
        // for (int i : x) {
        //     System.out.println(i);
        // }

        // int mat[][] = new int[3][4];
        // int rows = mat.length;
        // int cols = mat[0].length;
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         mat[i][j] =(int) (Math.random()*100);
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int[] i:mat){
        //     for(int j:i)
        //         System.out.print(j+ " ");
        //     System.out.println();
        // }

        // int nums[][] = new int[3][]; //jagged matrix
        // nums[0] = new int[2];
        // nums[1] = new int[4];
        // nums[2] = new int[1];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums[i].length; j++){
        //         nums[i][j] = (int) (Math.random()*100);
        //         System.out.print(nums[i][j] + " ");
        //     }
        //      System.out.println();  
        // }
        Student s1 = new Student();
        s1.name = "Ujjwal";
        s1.rno = 2;
        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s1;
        s[2] = s1;
        for(Student st:s){
            System.out.println("Name: "+ st.name + " Rno: " + st.rno);
        }


    }
}
