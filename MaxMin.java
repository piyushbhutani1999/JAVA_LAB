
import java.lang.Math;

class MaxMin
{
    public static void main(String args[]) {
        double maxdouble = Double.MAX_VALUE;
        double mindouble = Double.MIN_VALUE;
        double a = 54.556;
        System.out.println(maxdouble + " " + mindouble);
        System.out.println(Math.nextUp(a));
    }
}