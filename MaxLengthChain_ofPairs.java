import java.util.*;

public class MaxLengthChain_ofPairs{

    public static void main(String args[]){
        int arr[][] ={{5,24},{39,60},{5,28},{27,40},{50,90}};
Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));

int count =1;
int chainEnd= arr[0][1];
for(int i=1;i<arr.length;i++){
if(arr[i][0]>=chainEnd){
    count++;
    chainEnd= arr[i][1];

}
}
System.out.println(count);
    }

   
}