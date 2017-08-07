import java.util.HashMap;

public class judging {
	
	public static void main(String[] args) 
	{
		
		Kattio scan = new Kattio(System.in);
		
		int n = scan.getInt();
		
		HashMap<String, Integer> kat = new HashMap<>();
		HashMap<String, Integer> dom = new HashMap<>();
		
		for( int i=0; i < n; i++)
			{	
			String lol = scan.getWord();
			if(kat.containsKey(lol))
				kat.put(lol, kat.get(lol) + 1);
			else
				kat.put(lol, 1);
			}
		
		for( int i=0; i < n; i++)
			{	
			String lol = scan.getWord();
			if(dom.containsKey(lol))
				dom.put(lol, dom.get(lol) + 1);
			else
				dom.put(lol, 1);
			}
		
		int counter = 0;
		
		if(dom.size() < kat.size())
			{
			for(String s : dom.keySet())
				{
				if(kat.containsKey(s))
					counter += Math.min(dom.get(s), kat.get(s));
				}
			}
		else
			{
			for(String s : kat.keySet())
				{
				if(dom.containsKey(s))
					counter += Math.min(dom.get(s), kat.get(s));
				}
			}	
		
		System.out.println(counter);
		
		scan.close();
		
	}

}
