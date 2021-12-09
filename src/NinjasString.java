import java.util.Arrays;
//Question Link
//https://www.codingninjas.com/codestudio/problems/ninja-s-string_1279685?leftPanelTab=0

public class NinjasString {
    public static void main(String[] args) {
        String s1="568";

        System.out.println(ninjaString(s1));

    }
    public static boolean ninjaString(String str) {
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=Character.getNumericValue(str.charAt(i));

        }

        if(arr.length==1){
            return  true;
        }
        //write your code here
        int n1=arr[0],n2=arr[1],val;
        try{
            for (int i = 2; i < arr.length; ) {
                if (n1 + n2 < 10 && n1 + n2 == arr[i]) {
                    n1 = n2;
                    n2 = arr[i];
                    i++;
                } else if (n1 + n2 >= 10 && n1 + n2 == arr[i] * 10 + arr[i + 1]) {
                    n1 = n2;
                    n2 = arr[i] * 10 + arr[i + 1];
                    //if(i+2< arr.length)
                    i = i + 2;
                } else if (n1 + n2 > 100 && n1 + n2 == arr[i] * 100 + arr[i + 1] * 10 + arr[i + 2]) {
                    n1 = n2;
                    n2 = (arr[i] * 100) + (arr[i + 1] * 10) + (arr[i + 2]);
                    i = i + 3;
                } else return false;
            }
        }
        catch (Exception e)// handling Exception for Input like 568
        {
           return false;
        }

        return true;
    }
}
