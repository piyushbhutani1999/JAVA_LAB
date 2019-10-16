import java.lang.*;
import java.util.Random; 

public class Stopwatch{
    private long startTime,endTime;
    
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return (this.endTime - this.startTime);
    }      

    public static void selectionsort(int [] timeList,int len){
        int i,j,minIndex,temp;
        for(i=0;i<len-1;i++){
            minIndex=i;
            for(j=i+1;j<len;j++){
                if( (timeList[j]) < (timeList[minIndex]) )
                    minIndex  = j;
            }

            if(minIndex != i){
                temp = timeList[i];
                timeList[i] =timeList[minIndex];
                timeList[minIndex] = temp; 
            }
        }
    }
    public static void main(String args[]){
        int []arr = new int[100000];
        int i;
        Random random = new Random();
        
        for(i=0;i<100000;i++)
            arr[i] = random.nextInt(1000000);
        
        Stopwatch time = new Stopwatch();
        time.start();
        selectionsort(arr,100000);
        
        time.stop();
        
        System.out.println("Time elapsed is " + time.getElapsedTime() + " miliseconds");
        }
}
