public class Kth_largestOddNuminRange {

    public static int largeOdd(int l,int r,int k){

        int arrSize= (-1*l)+r+1;
        int arr[] = new int [arrSize];
       int i=0;
        while(l<=r){
            arr[i]=l;
            l++;
            i++;
        }
    }
    public static void main(String args[]){

        int l=-3,r=3,k=1;
        
        
        System.out.println(largeOdd(l, r, k));
    }
}
