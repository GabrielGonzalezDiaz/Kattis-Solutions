import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class flexible {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		
		int cuts = scan.nextInt();
		
		ArrayList<Integer> sizes = new ArrayList<>();
	
		int[] rooms = new int[cuts+2];
		
		rooms[0] = 0;
		rooms[rooms.length-1] = length;
		
		for(int i=1; i < rooms.length-1; i++)
		{
			rooms[i] = scan.nextInt();
		}
		
		for(int i=0; i < rooms.length; i++)
		{
			for(int j=i+1; j < rooms.length; j++)
			{
				sizes.add(rooms[j] - rooms[i]);
			}
		}
		
		Collections.sort(sizes);
		
		HashSet<Integer> list = new HashSet<>(sizes);
		
		for(int i : list)
		{
			System.out.println(i + " ");
		}
		
		scan.close();
		
	}

}
