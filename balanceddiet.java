import java.util.ArrayList;
import java.util.Scanner;

public class balanceddiet {

	static public ArrayList<Integer> subsetSum(ArrayList< Integer > input, int total)
	{
    boolean T[][] = new boolean[input.size() + 1][total + 1];
    for (int i = 0; i <= input.size(); i++)
    	{
    	T[i][0] = true;
    	}
    for (int i = 1; i <= input.size(); i++)
    	for (int j = 1; j <= total; j++) 
    		if (j - input.get( i - 1) >= 0) 
    			T[i][j] = T[i - 1][j] || T[i - 1][j - input.get(i - 1)];
            else 
            	T[i][j] = T[i-1][j];
    
    if(T[input.size()][total])
    	{
    	int s = 0;
    	ArrayList<Integer> set = new ArrayList<>();
    	int rr = input.size();
    	int cc = total;
    	while(s != total)
    		{
    		if(rr-1 >= 0)
    			{
    			if(T[rr-1][cc] == false)
    				{
    				s += input.get(rr-1);
    				set.add(input.get(rr-1));
    				cc -= input.get(rr-1);
    				}
    		rr--;
    			}
    		}
    	return set;
    	}
    return null;
    }
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		
		while( true ){
			
			int len = scan.nextInt();
			if(len == 0)
				break;
			ArrayList< Integer > nums = new ArrayList< Integer >();
			int sum = 0;
			for( int i=0; i < len; i++ ) {
				nums.add(scan.nextInt());
				sum += nums.get( i );
				}
			
			int target = sum / 2;
			
			boolean found = false;
			
			ArrayList<Integer> set = new ArrayList<Integer>();
			
			while(!found){
				set = subsetSum(nums, target);
				if(set != null)
					found = true;
				else
					target--;
				}
			
			System.out.println((sum - target) + " " + target);
			
			}
			
		

		}

	}
