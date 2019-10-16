import java.util.Scanner; 

class Angle
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println(get_angle(num1));
        input.close();
    }
    public static int get_angle(int a)
    {
        while(a<0)
            a = 360 +a;
        return a%360;
            
    }
}