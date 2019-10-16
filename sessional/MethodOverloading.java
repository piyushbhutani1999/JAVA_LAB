import java.util.*;

public class MethodOverloading{
    private int data;
    public static void main(String args[]){
        int a = 4;
        int b = 2;
        double c = 2.4;
        double d=4.3;
        function(a,b);
        function(c,d);
    }
    public static void function(int a, int b){
        System.out.println("Integers");
    }
    public static void function(double a, double b){
        System.out.println("Double");   
    }
    public void checkThis(){
        System.out.println(this.data);

    }
}