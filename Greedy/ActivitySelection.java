package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static int maxActivity(pair[] arr){
        int count=0;
        Arrays.sort(arr,new MyCmp());
        pair prev=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].getStartTime()>=prev.getEndTime()){
                count++;
                prev=arr[i];
            }
        }


        return count;
    }

    public static void main(String[] args) {

        pair[] arr={
        (new pair(1,3)),
        (new pair(2,4)),
        (new pair(5,8)),
        (new pair(6,10))};

        System.out.println("max no. of activity: "+maxActivity(arr));

    }

    //implements comparator interface (used ot order user defined class objects)
    static class MyCmp implements Comparator<pair>
{
        public int compare(pair a1, pair a2)
        {
            return a1.getEndTime() - a2.getEndTime();
        }
}


}
class pair{
    int startTime;
    int endTime;
    pair(int s,int e){
        this.startTime=s;
        this.endTime=e;
    }
    int getStartTime(){
        return startTime;
    }
    int getEndTime(){
        return endTime;
    }

}
