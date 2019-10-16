
public class NextUp {
    public static void main(String[] args) 
    {
      System.out.println("Max positive double value is " + 
                        Double.MAX_VALUE+
                        " and min positive double value is "+
                        Double.MIN_VALUE);
      System.out.println(   Math.nextUp(0f)+" "+
                            Math.nextUp(0.0)+" "+
                            Math.nextUp(27.12f)+" "+
                            Math.nextUp(27.12)+" ");
    }
    
}
