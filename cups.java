import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class cup implements Comparable<cup>
{
	
	String color;
	int radius;
	
	public cup(String color, int radius)
	{
		this.color = color;
		this.radius = radius;
	}

	
	public int compareTo(cup c) {
		return radius - c.radius;
	}
	
	public String toString()
	{
		return color;
	}
	
}

public class cups {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numOfCups = scan.nextInt();
		scan.nextLine();
		
		ArrayList<cup> cups = new ArrayList<>();
		
		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("0");
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		numbers.add("7");
		numbers.add("8");
		numbers.add("9");
		
		
		while(numOfCups --> 0)
		{
			String line = scan.nextLine();
			if(numbers.contains(line.substring(0,1)))
			{
				int diameter = Integer.valueOf(line.substring(0,line.indexOf(" "))) / 2;
				String color = line.substring(line.indexOf(" ") + 1);
				cups.add(new cup(color, diameter));
			}
			else
			{
				String color = line.substring(0,line.indexOf(" "));
				int radius = Integer.valueOf(line.substring(line.indexOf(" ") + 1));
				cups.add(new cup(color, radius));
			}
		}
		
		Collections.sort(cups);
		
		for(cup c : cups)
		{
			System.out.println(c);
		}
		
		scan.close();
		
		
	}

}
