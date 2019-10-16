class AnonymousArray {
    public static void main(String[] args) {
        printArray(new int[] {1,2,3,4,5});
        fun();

    }
    public static void printArray(int[] arr) {
        for (int i = 0;i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void fun() {
        //int[] x = 0 ;
        //error
        //int cannot be converted to int[]
        //printArray(x);
    }
}