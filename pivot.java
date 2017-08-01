import java.util.ArrayList;
import java.util.Collections;

public class pivot 
    {

    public static int part(ArrayList<Integer> list, int start, int stop)
        {
        return Collections.max(list.subList(start, stop));
        }
    
    public static int part2(ArrayList<Integer> list, int start, int stop)
    	{
    	return Collections.min(list.subList(start, stop));
    	}
    
    public static void main(String[] args) 
        {
        Kattio scan = new Kattio(System.in);
        int ints = scan.getInt();
        int[] nums = new int[ints];
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i=0; i < ints; i++)
        	{
            nums[i] = scan.getInt();
            n.add(nums[i]);
        	}
            
        int counter = 0;
		
        int[] max = new int[ints];
        int[] min = new int[ints];
        
        min[ints - 1] = nums[ints - 1];
        max[0] = nums[0];

        for (int i = nums.length - 2; i >= 0; i--)
          min[i] = Math.min(nums[i] , min[i + 1]);
          
        for (int i = 1; i < nums.length; i++)
          max[i] = Math.max(nums[i] , max[i - 1]);
        
        for(int i=1; i < ints-1; i++)
        {
        	if(nums[i] > max[i-1] && nums[i] < min[i+1])
        		{
        		//System.out.println(nums[i]);
        		counter++;
        		}
        }
        
        if(nums[0] < part2(n,1,ints))
        	{
        	counter++;
        	//System.out.println(nums[0]);
        	}
        if(nums[ints-1] > part(n,0,ints-1))
        	{
        	//System.out.println(nums[ints-1]);
        	counter++;
        	}
        
        System.out.println(counter);
        
        scan.close();
        }

    }