public class SumofMaxandMin {
    public static void main(String[] args) {
        int[] a={2,5,7,67,-3};

        System.out.println(sumOfMaxMin(a,5));
    }

    public static int sumOfMaxMin(int[] arr, int n) {
        // Write your code here.

        int max=arr[0],min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(min>arr[i]) min=arr[i];
            if(max<arr[i]) max=arr[i];
        }
        return max+min;
    }

}
