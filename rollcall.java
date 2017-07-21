import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student implements Comparable<student>
{
	String name;
	String last;
	boolean rep;
	
	public student(String name, String last)
	{
		this.name = name;
		this.last = last;
	}

	public int compareTo(student s) {
		return name.compareTo(s.name);
	}
	
	
}

public class rollcall {

	public static String last(String str)
	{
		return str.substring( str.indexOf(" ") + 1 );
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<student> students = new ArrayList<>();
		
		while( scan.hasNextLine() )
		{
			students.add(new student(scan.next(), scan.next()));
			scan.nextLine();
		}
		
		scan.close();
		
		Collections.sort(students);
		
		for(int i=0; i < students.size()-1; i++)
		{
			if(students.get(i).name.equals(students.get(i+1).name))
			{
				students.get(i).rep = true;
				students.get(i+1).rep = true;
			}
		}
		
		for(int i=0; i < students.size()-1; i++){
			for(int j=0; j < students.size()-1-i; j++){
				if(students.get(j).last.compareTo(students.get(j+1).last) > 0){
					student temp = students.get(j);
					students.set(j, students.get(j+1));
					students.set(j+1, temp);
				}
			}
		}
		
		for(int i=0; i < students.size(); i++)
		{
			if(students.get(i).rep)
			{
				System.out.println( students.get(i).name + " " + students.get(i).last );
			}
			else
			{
				System.out.println( students.get(i).name );
			}
		}

	}

}
