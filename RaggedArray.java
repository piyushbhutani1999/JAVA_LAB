

class RaggedArray{
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        for ( int i = 1; i <6 ;i++) {
            arr[i-1] = new int[i];
            for(int j = 0; j < i; j++) {
                arr[i-1][j]++;
                System.out.print(arr[i-1][j] + " ");
            }
            System.out.println(" "); 
        }
        

    }
}


