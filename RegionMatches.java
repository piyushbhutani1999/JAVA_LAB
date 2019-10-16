import java.util.Scanner; 

public class RegionMatches {    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
         System.out.println("Enter the starting index of both the strings"+
                            "from where you want to start the comparison"+ 
                            "and enter the length also: ");
         int index1 = input.nextInt();
         int index2 = input.nextInt();
         int n = input.nextInt();
        if(str1.regionMatches(true,index1,str2,index2,n))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
        input.close();
    }
    
}
