
import java.util.Scanner; 
import java.lang.Math;

class Reverse
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reversedNum = reverse_num(num);
        System.out.print(reversedNum); 
        input.close();   
    }
    public static int reverse_num(int num)
    {
        if(num>9)
        {
            int a = num%10;
            num = num/10;
            double ans =  a*(Math.pow(10, get_digits(num)))+reverse_num(num);
            System.out.println((int)ans);
            return (int)ans;
        }
        else
        {
            return num;
        }
    }

    public static double get_digits(int num)
    {   
        double digits = 0;
        while(num>0)
        {
            num = num/10;
            digits++;
        }
        return digits;
    }
}