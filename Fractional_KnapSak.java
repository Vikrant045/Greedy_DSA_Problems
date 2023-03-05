import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Fractional_KnapSak {

    /**
     * @param args
     */
    public static void main(String args[]){
        int weight[] ={10,20,30};
        int value[] ={60,100,120};
        int profit=0;
        int capacity = 50;

        double[][] ratio = new double[weight.length] [2];

        for(int i=0;i<weight.length;i++){
            ratio[i][0]= i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        for(int i=0;i<weight.length;i++){
           System.out.print(" "+ratio[i][0]); 
           System.out.print(" "+ratio[i][1]); 
System.out.println();
        }
        System.out.println();


// sort ratio in ascending order
Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
for(int i=0;i<weight.length;i++){
    System.out.print(" "+ratio[i][0]); 
    System.out.print(" "+ratio[i][1]); 
    System.out.println();

 }
 
for(int i=ratio.length-1;i>=0;i--){ // we take i ratio.length because largest ratio at end
                                    // and larger ratio means high profit 
    int idx = (int)ratio[i][0];      // idx = index of that ratio 
       if(capacity>=weight[idx]){
    profit+=value[idx];
    capacity= capacity-  weight[idx];
}

else {
    profit+=capacity*(int)ratio[i][1];
    capacity= 0;
break;
}



        }
        System.out.println(profit);

    }
    
}
