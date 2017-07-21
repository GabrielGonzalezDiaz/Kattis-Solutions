import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class averageseasy 
{
	
	public static double avg(ArrayList<Integer> list)
	{
		double sum = 0;
		
		for(int a : list)
			sum += a;
		
		return sum / (double)(list.size());
	}

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		
		scan.nextLine();
		scan.nextLine();
		
		while( cases --> 0 )
		{
			
			int counter = 0;
			
			int c = scan.nextInt();
			int e = scan.nextInt();
			ArrayList<Integer> cs = new ArrayList<>(c);
			ArrayList<Integer> ec = new ArrayList<>(e);
			
			
			while(c -- > 0)
				cs.add(scan.nextInt());
			while(e -- > 0)
				ec.add(scan.nextInt());
			
			Collections.sort(cs);
			
			for(int i=cs.size()-1; i >= 0; i--)
			{
				double csavg = avg(cs);
				double ecavg = avg(ec);
				ec.add(0, cs.remove(i));
				
				if(avg(cs) > csavg && avg(ec) > ecavg)
					counter++;
				
				cs.add(i,ec.remove(0));
				
			}
			
			System.out.println(counter);
			
		}
		
		scan.close();

	}

}
