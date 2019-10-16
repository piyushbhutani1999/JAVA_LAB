import java.util.*;

class Telephone{

    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter a sentence and press Enter" );
        String sentence = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer( sentence , "()-");
        String citycode = tokens.nextToken();
        String phonenum = tokens.nextToken()+tokens.nextToken();
        System.out.println("The phonenumber is :" + phonenum);
        System.out.println("Phonenumber with city code is: " + citycode + phonenum);
        scanner.close();
    }
}