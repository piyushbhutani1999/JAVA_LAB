import java.util.*;

class Tokenize{

    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter a sentence and press Enter" );
        String sentence = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer( sentence);
        while ( tokens.hasMoreTokens() )
        {   
            String str = tokens.nextToken();
            if(str.charAt(0)=='b')
            System.out.println(str);
        }
        scanner.close();
    }
}