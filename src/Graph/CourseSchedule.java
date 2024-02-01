package Graph;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<prerequisites.length;i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int v=numCourses;
       Queue<Integer> q=new LinkedList<>();
      int indeg[]=new int[v];
      
      for(int i=0;i<v;i++)
      {
          for(Integer a : adj.get(i))
          {
              indeg[a]++;
          }
      }
      
      for(int i=0;i<v;i++)
      {
          if(indeg[i]==0)
          q.add(i);
      }
      
      int i=0;
      while(q.size()>0)
      {
        int ele=q.remove();
        i++;
        
        for(Integer a : adj.get(ele))
        {
             indeg[a]--;
             if(indeg[a]==0)
             q.add(a);
        }
       
      }
      
      if(i==v)
      return true;
      
      return false;


        
    }

   
}
	

