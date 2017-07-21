import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class plantingtrees {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int trees = scan.nextInt();
		
		int[] field = new int[trees];
		
		for(int i=0; i < trees; i++)
		{
			field[i]=scan.nextInt();
		}
		
		
		ArrayList<Integer> newfield = new ArrayList<Integer>();
		
		for(int i=0; i < trees; i++)
		{
			newfield.add(field[i]);
		}
		
		Collections.sort(newfield);
		
		Collections.reverse(newfield);
		
		for(int i=0; i < trees; i++)
		{
			newfield.set(i, newfield.get(i) + 1);
		}
		
		for(int i=0; i < trees; i++)
		{
			newfield.set(i, newfield.get(i) + i);
		}
		
		int max = 0;
		
		for(int i=0; i < trees; i++)
		{
			if(newfield.get(i)>max) max = newfield.get(i);
		}
		
		System.out.println(max + 1);
		
		scan.close();

	}

}
