import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class grandpabernie {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, ArrayList<Integer>> places = new HashMap<>();
		HashSet<String> record = new HashSet<>();
		int p = scan.nextInt();
		scan.nextLine();
		while(p -- > 0)
		{
			String str = scan.next();
			record.add(str);
			int year = scan.nextInt();
			scan.nextLine();
			if(places.containsKey(str))
			{
				places.get(str).add(year);
			}
			else
			{
				ArrayList<Integer> nums = new ArrayList<>();
				nums.add(year);
				places.put(str, nums);
			}
		}
		
		for(String s : record)
		{
			Collections.sort(places.get(s));
		}
		
		int q = scan.nextInt();
		scan.nextLine();
		
		while(q --> 0)
		{
			String str = scan.next();
			int time = scan.nextInt();
			scan.nextLine();
			System.out.println(places.get(str).get(time-1));
		}
		
		scan.close();

	}

}
