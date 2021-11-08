package Sorting.MergeSort;

/**Naive:
 * add both arrays into one array arr[]
 * now sort the array arr[]
 * print elements one by one checking that the element does not match its previous element
 *  12 42
 * 3 4 5 28 37 42 43 46
 *
 * check if elements does not match print else print once
 */
public class unionOfSortedArrays {

    static void union(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }

        }
        while(i<n){
            System.out.print(a[i]+" ");i++;
        }
        while(j<m){
            System.out.print(b[j]+" ");j++;
        }
    }

    //main method
    public static void main(String[] args) {
        //12 42
        //3 4 5 28 37 42 43 46
        int[] a={12,42};
        int[] b={3,4,5,28,37,42,43,46};
        union(a,b);
    }

}
