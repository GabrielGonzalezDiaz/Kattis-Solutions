import java.util.ArrayList;
import java.util.Scanner;

public class speedlimit {

	public static int sum(ArrayList<Integer> list)
	{
		int sum = 0;
		
		for(int i=0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> hrs = new ArrayList<>();
		hrs.add(0);
		
		
		while(scan.hasNext())
		{
			
			int miles = 0;
			int times = scan.nextInt();
			if(times == -1) break;
			//System.out.println(times);
			for(int i=0; i < times; i++)
			{
				int m = scan.nextInt();
				int t = scan.nextInt();
				int tt = t;
				t -= hrs.get(hrs.size()-1);
				hrs.add(tt);
				miles += m * t;
			}
			System.out.println(miles + " miles ");
			hrs.clear();
			hrs.add(0);
			
		}
		
		scan.close();

	}

}
