package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobScheduling {

    // 1    4   1   1
    // 100  40  60  50
    public static int maxProfit(jobs[] arr,int n){
        int res=0;
        Arrays.sort(arr,new cmp());

        // To store result (Sequence of jobs)
        int result[] = new int[n];
        // To keep track of free time slots
        boolean slot[] = new boolean[n];
        Arrays.fill(slot,false);

        for(int i=0; i<arr.length;i++){
            // getting current deadline
            int current=arr[i].getDeadline()-1;
            //if current deadline's slot is empty
            if(current>=0&&!slot[current]){
                slot[current]=true;
                result[current]=arr[i].getProfit();
            }
            else{
                int cur=current;
                while(cur>=0&& !slot[cur]){
                    cur--;
                }
                if(cur<0)
                    continue;
                if(slot[cur]==false){
                    slot[cur]=true;
                    result[cur]=arr[i].getProfit();
                }
            }
            for(int j=0;j<n;j++){
                System.out.print(slot[j]+" , "+result[j]+" ;");
            }
            System.out.println();
        }

        for(int x: result){
            res+=x;
            System.out.println(x);
        }

        return res;
    }

    public static void main(String[] args) {
        jobs[] arr={
                new jobs(4,70),
                new jobs(1,50),
                new jobs(1,60),
                new jobs(1,100)
        };
        int n=4;
        System.out.println(maxProfit(arr,n));
    }

}
class cmp implements Comparator<jobs>{

    @Override
    public int compare(jobs o1, jobs o2) {
        return o2.profit - o1.profit;
    }
}





class jobs{
    int deadline;
    int profit;
    jobs(int d,int p){
        this.deadline=d;
        this.profit=p;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getProfit() {
        return profit;
    }
}
