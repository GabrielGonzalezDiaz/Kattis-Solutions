import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class compoundwords 
{

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);		
		
		ArrayList<String> words = new ArrayList<String>();
		
		while( scan.hasNextLine() )
		{
			String line = scan.nextLine();
			String[] w = line.split( " " );
			for(int i=0; i < w.length; i++)     
			{
				words.add( w[i] );
			}
		}
		
		
		
		HashSet<String> sents = new HashSet<>();
		
		for(int i=0; i < words.size(); i++)
		{
			String s = words.get( i );
			words.remove( i );
			for(int j=0; j < words.size(); j++)
			{
				sents.add( s + words.get(j) );
				sents.add( words.get(j) + s );
			}
			
			words.add(i,s);
			
		}
		
		ArrayList<String> list = new ArrayList<>(sents);
		
		Collections.sort(list);
		
		for(String s : list)
			System.out.println(s);

		scan.close();
		
	}

}
