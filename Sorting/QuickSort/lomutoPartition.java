package Sorting.QuickSort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * extend the size of window  by swapping elements less than pivot
 *
 */
public class lomutoPartition {
    static int partition(int[] arr, int l, int h, int p) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    //main method
    public static void main(String[] args) {
//        int[] arr={10,80,30,90,40,50,70};
//        int pos=partition(arr,0,6,6);
        LocalDate d1= LocalDate.of(2021,2,28);
        LocalDate d2= LocalDate.parse("2019-12-07", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(d2);
    }
}
