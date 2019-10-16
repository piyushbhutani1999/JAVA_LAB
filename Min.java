
import java.util.Scanner; 
import java.lang.Math;


class Min
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(Math.min(num1,num2));
        input.close();
    }

}