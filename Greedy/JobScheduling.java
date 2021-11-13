package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobScheduling {
    static class cmp implements Comparator<jobs>{

        @Override
        public int compare(jobs o1, jobs o2) {
            return o2.profit - o1.profit;
        }
    }

    // 1    4   1   1
    // 100  40  60  50

    public static int maxProfit(jobs[] arr,int n){
        int res=0;
        //SOrt the array according to the profit
        Arrays.sort(arr,new cmp());

        // To store result (Sequence of jobs)
        int result[] = new int[n];
        // To keep track of free time slots
        boolean slot[] = new boolean[n];
        Arrays.fill(slot,false);

        //17 4921
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

    public static int jobSch(jobs[] job,int n){
        int res=0;
        Arrays.sort(job,new cmp());
        //Array sorted in descending order of profit
        boolean[] slot=new boolean[50];
        //max profit assigned to the slot available
        for(int i=0;i<n;i++){
            int current = job[i].getDeadline()-1;

            int cur=current;
            while(cur>=0 && slot[cur]){
                cur--;
            }
            if(cur<0){
                continue;
            }
            if(!slot[cur]){
                slot[cur]=true;
                res+=job[i].getProfit();
            }
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
        System.out.println(jobSch(arr,n));
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
