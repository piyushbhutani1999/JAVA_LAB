import java.util.*;
public class Ques5{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double side1,side2,side3;
        side1=input.nextDouble();
        side2=input.nextDouble();
        side3=input.nextDouble();

        try{
            Triangle obj = new Triangle(side1,side2,side3);
            System.out.println( obj.side1 + " " + obj.side2 + " " + obj.side3);
            
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    static class Triangle {
        public double side1,side2,side3;
    
        Triangle(double side1, double side2, double side3) throws IllegalArgumentException {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
    
            boolean con = ( side1 + side2) > side3;
            con = con & ((side2 + side3) > side1);
            con = con & ((side3 + side1) > side2);
    
            if(!con) {
                throw new IllegalArgumentException("Sides are not correctly entered");
            }
        }   
    }
}

