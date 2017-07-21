import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lineup {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
	
		
		ArrayList<String> names = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			names.add(scan.next());
		}
		
		ArrayList<String> inc = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			inc.add(names.get(i));
		}
		
		ArrayList<String> dec = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			dec.add(names.get(i));
		}
		
		Collections.sort(dec);
		Collections.reverse(dec);
		Collections.sort(inc);
		
		if(dec.equals(names)) System.out.println("DECREASING");
		else if(names.equals(inc)) System.out.println("INCREASING");
		else System.out.println("NEITHER");
		
		scan.close();
		
		
		
	}

}
