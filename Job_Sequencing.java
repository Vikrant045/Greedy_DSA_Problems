import java.util.*;
public class Job_Sequencing {

    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d , int p){
            deadline=d;
            id=i;
            profit=p;
        }
    }

    public static void main(String args[]){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobInfo.length;i++){
    jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);
        int time =0;
        int maxJobs=0;
        for(int i=0;i<jobs.size();i++){

            Job curr = jobs.get(i);
            if(curr.deadline>time){
                System.out.println("Job "+curr.id);
                time++;
                maxJobs++;
            }
        }
        System.out.println("MaxJobs = "+maxJobs);
       // System.out.println(time);


    }
   
   
    
}
