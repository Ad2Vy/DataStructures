import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        // sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            StringBuilder even= new StringBuilder();
            StringBuilder odd= new StringBuilder();
            for(int j=0;j<s.length();j++){
                if(i%2==0){
                    even.append(s.charAt(j));
                }
                else{
                    odd.append(s.charAt(j));
                }
            }
            System.out.println(even+"  "+odd);
        }
    }
}
