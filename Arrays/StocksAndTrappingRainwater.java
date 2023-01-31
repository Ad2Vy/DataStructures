package Arrays;

public class StocksAndTrappingRainwater {

    //stocks buy sell problem
    static int stocksProfit(int[] stocks){
        int cur=stocks[0];
        int res=0,minVal=stocks[0];

        for(int i=1;i<stocks.length;i++){
            if(stocks[i]>stocks[i-1]){
                res+= stocks[i]-stocks[i-1];
//                minVal=Math.min(minVal,stocks[i]);
            }
        }
        return res;
    }




    //trapping rainwater
    static int trapRainwater(int[] arr){
        int res=0,left=arr[0],right=arr[arr.length-1];
        int[] lmax=new int[arr.length],rmax=new int[arr.length];
        lmax[0]=left;
        rmax[arr.length-1]=right;
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        //the main part
        for(int i=0;i<arr.length;i++){
            res+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return res;

    }

    static int trapRainwaterSpaceOptimized(int[] arr){
        int low=0,high=arr.length-1,left_max=0,right_max=0;
        int result=0;
        while(low<=high){
            if(arr[low]<arr[high]){
                if(arr[low]>left_max){
                    left_max=arr[low];
                }
                else{
                    result+= left_max- arr[low];
                }
                low++;
            }
            else{
                if(arr[high]>right_max){
                    right_max=arr[high];
                }
                else{
                    result+= right_max-arr[high];
                }
                high--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] stocks={1,5,3,8,12};
//        System.out.println(stocksProfit(stocks));
        int[] water={2,1,2,5,4};
        System.out.println(trapRainwater(water));
        System.out.println(trapRainwaterSpaceOptimized(water));

    }
}
