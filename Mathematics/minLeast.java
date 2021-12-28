package Mathematics;

public class minLeast {
    public static void main(String[] args) {
        int[] arr={500,100,200};
        int min=arr[0];//min element
        int sec_min=10000;//sec min element
        int minIndex=0;//min element index
        int secIndex=0;//sec min element index
        for(int i=1; i<arr.length;i++){
            if(arr[i]<min){
                sec_min=min;
                secIndex=minIndex;
                minIndex=i;
                min=arr[i];
            }
            else{
                sec_min=arr[i];
                secIndex=i;
            }
        }
        if(secIndex>minIndex){
            System.out.println(min+" "+sec_min);
        }
        else{
            System.out.println(sec_min+" "+min);
        }
    }

}
