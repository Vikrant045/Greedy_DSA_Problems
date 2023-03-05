import java.util.*;;
public class MaxSumIn_Ksub {

    public static void main(String args[]){
        Integer arr[] = {1, 2, 3, 4};
        Arrays.sort(arr,Comparator.reverseOrder());
        int k=3;
        int maxSum =0;
        int sum=0;
        for(int i=0;i<arr.length&&i<k;i++){
sum+=arr[i];
        if(sum>maxSum){
            maxSum=sum;
        }
        }
        System.out.println(maxSum);
    }
    
}
