
public class Rectangle{
    private double height,width;
    
    public Rectangle(){
        height = 1;
        width = 1;
    }
    public Rectangle(double h,double w){
        height = h;
        width = w;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
    public double getArea(){
        return height*width;
    }
        
    public static void main(String args[])
    { 
        Rectangle rect = new Rectangle();
        Rectangle rect1 = new Rectangle(10,5);
        Rectangle rect2 = new Rectangle(10.50,5.50);
        
        System.out.println("Rectangle with no aruguments ");
        System.out.println("Height = " + rect.getHeight() + " and Width = " + rect.getWidth());
        System.out.println("Area  = " + rect.getArea() + " and Perimeter =" + rect.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 1 with aruguments : ");
        System.out.println("Height and Width = " + rect1.getHeight() + "  and Width = " + rect1.getWidth());
        System.out.println("Area and Perimeter = " + rect1.getArea() + " and Perimeter = " + rect1.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 2 with aruguments" );
        System.out.println("Height =" + rect2.getHeight() + "  and Width =  " + rect2.getWidth());
        System.out.println("Area  = " + rect2.getArea() + " and Perimeter = " + rect2.getPerimeter());
    }
}