import java.util.ArrayList;
import java.util.Scanner;

public class AnotherCandies 
{

	public static double sum(ArrayList<Double> list)
	{
		double count = 0;
		for(double a : list)
			count += a;
		
		return count;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		scan.nextLine();
		scan.nextLine();
		
		ArrayList<ArrayList<Double>> candies = new ArrayList<ArrayList<Double>>(cases);
		
		while(cases --> 0)
		{
			candies.add( new ArrayList<Double>() );
		}
		
		for(int i=0; i < cases; i+=0)
		{
			String line = scan.nextLine();
			
			if(line.isEmpty() || !scan.hasNextLine())
			{
				cases++;
				continue;
			}
			else
			{
				candies.get(cases).add(Double.valueOf(line));
			}
		}
		
		for(ArrayList<Double> list : candies)
		{
			if( sum(list) % list.size() == 0 )
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
		scan.close();
		
	}

}
