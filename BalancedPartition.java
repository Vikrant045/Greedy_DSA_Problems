public class BalancedPartition {

    public static int partitions(String st,int n){
int r =0,l=0;
int count =0;
for(int i=0;i<n;i++){

    if(st.charAt(i)=='R'){
        r++;
    }
    else if(st.charAt(i)=='L'){
        l++;
    }
    if(r==l){
        count++;
    }
}
return count;
    }
    public static void main(String args[]){
        String st ="LRRRRLLRLLRL";
         int n = st.length();
         System.out.println(partitions(st, n));
    }
    
}
