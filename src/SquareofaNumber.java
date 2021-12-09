//Question Link
//https://www.codingninjas.com/codestudio/problems/calculate-square-of-a-number_1112623?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1

public class SquareofaNumber {
    public static void main(String[] args) {
        System.out.println(calculateSquare(4));
        System.out.println(calculateSquare(3));
        System.out.println(calculateSquare(-4));
        System.out.println(calculateSquare(-13));
        System.out.println(calculateSquare(1));

    }

    public static int calculateSquare(int num)
    {
        int sqr=num;
        //    Write your code here.
        if(num==1)
            return 1;
        if(num<0){
            num=-(num);
            sqr=num;
        }

        for(int i=2;i<=num;i++)
        {
            sqr=sqr+num;
        }
        return sqr;
    }
}
