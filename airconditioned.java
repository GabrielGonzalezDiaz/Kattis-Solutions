import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class minion implements Comparable<minion>
{
	int lo;
	int hi;
	public minion(int lo, int hi)
	{
		this.lo = lo;
		this.hi = hi;
	}
	int range = hi-lo + 1;
	public minion intersection(minion m)
	{
		if(hi < m.lo || m.hi < lo)
		{
			return null;
		}
		else
		{
			return new minion(Math.max(lo, m.lo), Math.min(hi, m.hi));
		}
	}
	
	public int compareTo(minion o) 
	{
		return hi - o.hi;
	}
	
	public String toString()
	{
		return "[" + lo + ", " + hi + "] ";
	}
	
	
}

public class airconditioned {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int pop = scan.nextInt();

		ArrayList<minion> workers = new ArrayList<>();
		
		while(pop --> 0)
			workers.add(new minion(scan.nextInt(), scan.nextInt()));
		
		int count = 1;
		//System.out.println(workers);
		Collections.sort(workers);
		//System.out.println(workers);
		
		minion mi = workers.get(0);
		
		for(int i=1; i < workers.size(); i++)
		{
			if(workers.get(i).lo > mi.hi)
            {
                count++;
                mi = workers.get(i);
            }
		}
		
		scan.close();
		
		System.out.println(count);
			
		
		
	}
}

