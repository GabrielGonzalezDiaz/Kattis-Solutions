import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());
		nums.add(scan.nextInt());
		
		Collections.sort(nums);
		
		scan.nextLine();
		
		String str = scan.nextLine();
		
		for(int i=0; i < 3; i++)
		{
			if(str.substring(i, i+1).equals("A"))
				System.out.print(nums.get(0) + " ");
			else if(str.substring(i, i+1).equals("B"))
				System.out.print(nums.get(1) + " ");
			else if(str.substring(i, i+1).equals("C"))
				System.out.print(nums.get(2) + " ");
		}
		
		scan.close();

	}

}
