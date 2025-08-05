package Basic;
import java.util.*;

public class ArrayList_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

//        int size = sc.nextInt();
//        for(int i=0;i<size;i++) {
//            int x = sc.nextInt();
//            arr.add(x);
//        }
//
//        System.out.println("print arrayList");
//
//        for(int i=0;i<arr.size();i++) {
//            System.out.println(arr.get(i));
//        }

        // 2d array list

        ArrayList<ArrayList<Integer>> brr = new ArrayList<>();

        for(int i=0;i<3;i++) {
            ArrayList<Integer>crr = new ArrayList<>();
            for(int j =0;j<3;j++)
            {
                int x = sc.nextInt();
                crr.add(x);
            }
            brr.add(crr);
        }

        // print 2d arrayList
        System.out.println(brr);

        for(int i=0; i< brr.size();i++) {
            for(int j = 0; j< brr.get(i).size();j++) {
                System.out.print(brr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
