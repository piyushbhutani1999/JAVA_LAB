
import java.util.Scanner; 

class Triangle
{   
    private double[][] arr = new double[3][2];
    public static void main(String[] args)
    {
        Triangle triobj = new Triangle();
        triobj.take_input();
        triobj.get_area_of_triangle();
    }
    public void get_area_of_triangle()
    {   
        double area = 0.0;
        int j=1;
        for(int i=0;i<3;i++)
        {
            int a = j;
            int b = j++;
            if(b>2){b=0;j=0;}
            area = area + (arr[i][0])*(arr[a][1]-arr[b][1]);
        }
        System.out.println(area);
    }
    public void take_input()
    {   
        Scanner input = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
                arr[i][j] = input.nextDouble();
        }
        input.close();
    }
}