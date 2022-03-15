package Sorting.MergeSort;

public class invertedPairs {
    /**
     * The idea is to use merge function of merge sort and count inversions their
     *
     */
    static int inverted(int[] a, int l, int r){
        int count=0;
        if(l<r){
            int mid= (r-l)/2 +l;
            count+=inverted(a,l,mid);
            count+=inverted(a,mid+1,r);
            count+=mergeFunction(a,l,mid,r);
        }
        return count;
    }

    static int mergeFunction(int[] a,int l,int mid,int r){
        int count=0;
        int n=mid-l+1;int m=r-mid;
        int[] left=new int[n];
        int[] right=new int[m];
        for(int i=0;i<n;i++){left[i]=a[i+l]; }
        for(int i=0;i<m;i++){right[i]=a[i+1+mid];}
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(left[i]<=right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];count+=n-i;
            }
        }
        while(i<n){a[k++]=left[i++];}
        while(j<m){a[k++]=right[j++];}
        return count;
    }

    public static void main(String[] args) {
        int[] arr={30,12,4,20,10};
        int count=0;
        System.out.println(inverted(arr,0,arr.length-1));
    }

}
