import java.util.ArrayList;

public class ReverseArraySolution {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("before reversing "+arr);
        reverseArray(arr,3);
        System.out.println(arr);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {

        // Write your code here.
        int start=m+1,end=arr.size()-1;
        while (start<end){
            int temp;
            temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;end--;
        }

    }
}
