package Sorting.MergeSort;

/**
 * NAIVE: Loop through one array and check if it matches with other array by another loop through other array.
 * for(int i =0; i < n;i++){
 *     //checking if the element does not match its previous element
 *     if( i>0 && a[i] == a[i-1])
 *            continue;
 *     for(int j=i;j< m;j++){
 *         if(a[i]==b[j]){
 *             print(a[i]);
 *         }
 *         else if(a[i] < b[j]) { i++}
 *         else{ j++;}
 *     }
 * }
 */

// Efficient solution like the merge funtion of quick sort
public class intersectionOfTwoSortedArrays {


    static void intersection(int[] a,int[] b){
        int n= a.length,m=b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]== b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else
                j++;
        }
    }

    //main method
    public static void main(String[] args) {
        int[] a={1,20,20,40,60};
        int[] b={2,20,20,20,40};
        intersection(a,b);
    }
}
