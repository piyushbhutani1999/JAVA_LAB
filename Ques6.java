package Assignment2;



import java.util.Random;

public class Ques6{
    
    public static class Stopwatch
    {
       private long startTime,endTime;
       
       public long getStartTime()
       {
           return this.startTime;
       }
       public long getEndTime()
       {
           return this.endTime;
       }
       public Stopwatch()
       {
           startTime = System.currentTimeMillis();
       }
       public void start()
       {
           startTime = System.currentTimeMillis();
       }
       public void stop()
       {
           endTime = System.currentTimeMillis();
       }
       public long getElapsedTime()
       {
           return (this.endTime - this.startTime);
       }      
    }
    public static void selectionsort(int []list,int n)
    {
        int i,j,minindex,temp;
        for(i=0;i<n-1;i++)
        {
                minindex=i;
                for(j=i+1;j<n;j++)
                {
                        if( (list[j]) < (list[minindex]) )
                                minindex  = j;
                }

                if(minindex != i)
                {
                    temp = list[i];
                    list[i] = list[minindex];
                    list[minindex] = temp;
                }
        }
    }
    public static void main(String args[])
    {
       int []arr = new int[100000];
       int i;
       Random random = new Random();
       
       for(i=0;i<100000;i++)
           arr[i] = random.nextInt(1000000);
       
       Stopwatch time = new Stopwatch();
       selectionsort(arr,100000);
       
       time.stop();
       
       System.out.println("Time elapsed in the above sort is " + time.getElapsedTime() + " miliseconds");
     
    }
}