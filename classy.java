import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class person implements Comparable<person>
	{
		
	private char val(String s)
	{
		if(s.equals("upper"))
			return '3';
		else if(s.equals("middle"))
			return '2';
		else 
			return '1';
	}
	
	private String convert(String[] arr)
		{
			char[] nums = new char[12];
			Arrays.fill(nums, '2');
			for (int i = 12 - arr.length; i < nums.length; i++)
				nums[i] = val(arr[i - (12 - arr.length)]);
			
			String ans = "";
			
			for(int i=nums.length-1; i >= 0; i--)
				ans += nums[i] + "";

			return ans;
		}
		
	String name;
	String rank;
	
	public person(String name, String rank)
		{
		this.name = name.substring(0, name.length()-1);
		this.rank = convert(rank.split("-"));
		}
	
	public int compareTo(person p) 
		{
		if(this.rank.equals(p.rank))
			return this.name.compareTo(p.name);
		return p.rank.compareTo(this.rank);
		}
	
	public String toString(){return this.name;}
	
	}	
	

public class classy 
	{
	
	public static void main(String[] args) 
		{	
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		scan.nextLine();
		while(cases--> 0)
			{
			int pop = scan.nextInt();
			scan.nextLine();
			
			ArrayList<person> people = new ArrayList<>();
 			
			while(pop --> 0)
				{
				people.add(new person(scan.next(), scan.next()));
				scan.nextLine();
				}
			
			Collections.sort(people);
			
			for(person p : people)
				System.out.println(p);
			
			System.out.println("==============================");
			
			}
		
		scan.close();
		
		}

	}