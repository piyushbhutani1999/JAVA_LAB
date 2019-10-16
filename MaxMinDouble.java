
import java.text.DecimalFormat;

public class MaxMinDouble {
    public static void main(String[] args) {
        double minValueDouble = Double.MIN_VALUE ;
        double maxValueDouble = Double.MAX_VALUE ;
        float maxValueFloat = Float.MAX_VALUE;
        float minValueFloat = Float.MIN_VALUE;

        //Option 1 Print bare double.
        System.out.println("Exponential Notation");
        System.out.println("minimum value  = " + minValueDouble);
        System.out.println("maximum value  = " + maxValueDouble);

        //Option2, use decimalFormat.
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(500);
        System.out.println("Normal Notation");
        System.out.println("minimum value  = " + df.format(minValueDouble));
        System.out.println("maximum value  = " + df.format(maxValueDouble));

        System.out.println("####### FLOAT #########");

        System.out.println("Exponential Notation");
        System.out.println("minimum value  = " + minValueFloat);
        System.out.println("maximum value  = " + maxValueFloat);
        System.out.println("Normal Notation");
        System.out.println("minimum value  = " + df.format(minValueFloat));
        System.out.println("maximum value  = " + df.format(maxValueFloat));
    }
}