
class Fibonaci {
    public static void main(String[] args) {
        int num = 0;
        for ( String arg : args)
            num = Integer.parseInt(arg);
            
        System.out.println("Entered num =" + num);
        get_fibonaci(num);
    }
    public static void get_fibonaci(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] =1;
        for (int i =2 ;i < num ;i ++) {
            arr[i] = arr[i-1] + arr[i-2] ;
        }
        for( int i = 0; i < num ; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}