// Read an array and print the number of sub-arrays whose sum is negative.  


 
import java.util.Scanner;
 
public class Arrays_Assignment {
    public static void main (String []args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int[n];
        for(int i = 0 ;  i < n ; i++){
            a[i] = s.nextInt();
        }
        int getNum = NegativeSum(a,n);
        System.out.println(getNum);
    }
    public static int NegativeSum(int[] a, int n){
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
                sum += a[j];
                if(sum < 0){
                    res++;
                }
            }
        }
        return res;
    }
}
