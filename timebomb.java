import java.util.ArrayList;
import java.util.Scanner;

public class timebomb {

	public static int getNum(ArrayList<String> list)
	{
		if( list.get(0).equals("  *") )
			return 1;
		else if( list.get(0).equals("* *") )
			return 4;
		
		else if( list.get(1).equals("* *") )
		{
			if( list.get(2).equals("* *") )
				return 0;
			else
			{
				if( list.get(3).equals("* *") )
					return 8;
				else return 9;
			}
		}
		
		else if( list.get(1).equals("  *") )
		{
			if( list.get(2).equals("  *") )
				return 7;
			else
			{
				if( list.get(3).equals("  *") )
					return 3;
				else return 2;
			}
		}
		
		else
		{
			if(list.get(3).equals("  *"))
				return 5;
			else return 6;
		}
		
			
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<ArrayList<String>> digs = new ArrayList<>();
		
		int skrt=5;
		while(skrt --> 0)
		{
			String line = scan.nextLine();
			int len = line.length()/3;
			while(len --> 0)
			{
				digs.add(new ArrayList<String>());
			}
			int counter = 0;
			for(int i=0; i < line.length()-2; i+= 3)
			{
				digs.get(counter).add(line.substring(i, i+3));
				counter++;
			}
		}
		
		int num = 0;
		
		for(int i=0; i < digs.size(); i++)
		{
			num *= 10;
			num += getNum(digs.get(i));
		}
		
		if(num % 6 == 0)
			System.out.println("BEER! !");
		else 
			System.out.println("BOOM! !");
		
		
		
		scan.close();

	}

}
