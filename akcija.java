import java.util.ArrayList;
import java.util.Collections;

public class Akcija {
	
	public static void main(String[] args) {
		
		Kattio scan = new Kattio(System.in, System.out);
		
		int books = scan.getInt();
		
		ArrayList<Integer> prices = new ArrayList<>();
		
		for(int i=0; i < books; i++)
		{
			prices.add(scan.getInt());
		}
		
		Collections.sort(prices);

		Collections.reverse(prices);
		
		int min = 0;
		
		
		for(int i=0; i < books-(books%3); i+=3)
		{
			min += prices.get(i);
			min += prices.get(i+1);
		}
		
		for(int i=books-(books%3); i < books; i++)
		{
			min += prices.get(i);
		}
		
		
		
		scan.print(min);
		
		scan.close();
		
		
		
	}

}
