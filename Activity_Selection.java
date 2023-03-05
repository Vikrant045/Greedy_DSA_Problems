import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection{
    /**
     * @param start
     * @param end
     */
    public static void selection(int start[],int end[]){
        int arr [][]= new int[start.length][3];

        for(int i=0;i<start.length;i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        for(int i=0;i<start.length;i++){
            System.out.print(" "+ arr[i][0]); 
            System.out.print(" "+arr[i][1]); 
 System.out.print(" "+arr[i][2]);
 System.out.println();
         }
         System.out.println();

        Arrays.sort(arr,Comparator.comparingDouble(o ->o[2]));
        for(int i=0;i<start.length;i++){
            System.out.print(" "+ arr[i][0]); 
            System.out.print(" "+arr[i][1]); 
 System.out.print(" "+arr[i][2]);
 System.out.println();
         }
ArrayList <Integer> activity = new ArrayList<>();
        int count =1;
        int choosenEnd= arr[0][2];
activity.add(arr[0][0]);
        for(int i=1;i<start.length;i++){
            if(arr[i][1]>=choosenEnd){
                count++;
                choosenEnd= arr[i][2];
                activity.add(arr[i][0]);
            }
        }
        System.out.println(count);
        System.out.println(activity);
    }
    public static void main (String args[]){
       // int start[] ={1,3,0,5,8,5};
       // int end[] ={2,4,6,7,9,9};  // if end is sorted
       int start[] ={0,1,3,5,5,8};
        int end[] ={6,2,4,9,7,9};
        selection(start, end);

    }
}