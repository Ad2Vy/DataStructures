package Mathematics;

public class DivisorsInSortedOrder {

    static void divisors(int n){

//        for(int i=1;i<n;i++){
//            if(n%i == 0){
//            System.out.println(i);}
//        }
        //Efficient solution but not in order
//        for(int i=1;i*i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//                if(i!= n/i){
//                    System.out.println(n/i);
//                }
//            }
//        }

        //for sorted order traverse twice once from start to end , then from end to start
        int i=1;
        for(i=1;i*i<n;i++){
            if(n%i==0) System.out.println(i);
        }
        i--;
        for(;i>=1;i--){
            if(n% i == 0) System.out.println(n/i);
        }
    }

    public static void main(String[]  args){
        int num=56;
        divisors(num);
    }
}
