package Mathematics;

/**
 * @author aditya vyas  // largest number obtained after k swaps. BackTraking
 */
public class largestNumberAfterKswaps {
    static String max;

    static void findMaximumNum(char[] str, int k)
    {
        // Return if no swaps left
        if (k == 0)
            return;

        int n = str.length;

        // Consider every digit
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (str[i] < str[j])
                {
                    char t = str[i];
                    str[i] = str[j];
                    str[j] = t;
                    if (String.valueOf(str).compareTo(max) > 0)
                        max = String.valueOf(str);
                    findMaximumNum(str, k - 1);

                    // Backtrack
                    char c = str[i];
                    str[i] = str[j];
                    str[j] = c;
                }
            }
        }
    }
    //main
    public static void main(String[] args) {
        String str = "129814999";
        int k = 4;
        max = str;
        System.out.println(str);
        findMaximumNum(str.toCharArray(), k);
        System.out.print(max + "\n");
    }
}
