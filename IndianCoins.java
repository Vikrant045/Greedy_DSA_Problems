import java.util.*;
public class IndianCoins {
    public static void main(String args[]){
        Integer arr[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(arr,Collections.reverseOrder());
int amount = 159;
int count = 0;
        for(int i=0;i<arr.length;i++){
        //    if(amount>=arr[i]){
while(amount>=arr[i]){
amount = amount-arr[i];
count++;
System.out.println("coin of rs "+arr[i]);
}
        //}
    }
    System.out.println(count);
}
}
