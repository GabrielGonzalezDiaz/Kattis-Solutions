import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class statistics {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int cases = 1;
		
		while(scan.hasNextInt())
		{
			
			int skrt = scan.nextInt();
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			for(int i=0; i < skrt; i++)
			{
				nums.add(scan.nextInt());
			}
			
			Collections.sort(nums);
			
			System.out.print("Case " + cases + ": " + nums.get(0) + " " + nums.get(nums.size()-1) + " " + (nums.get(nums.size()-1)-nums.get(0)));
			System.out.println();
			cases++;
			
			
		}
		scan.close();
	}

}
