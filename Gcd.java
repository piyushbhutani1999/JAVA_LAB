
import java.util.Scanner; 

class Gcd
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(get_gcd(num1,num2));
        input.close();
    }
    public static int get_gcd(int a, int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==b)
            return a;
        if(a>b)return get_gcd(a-b, b);
        else return get_gcd(a, b-a);
    }
}