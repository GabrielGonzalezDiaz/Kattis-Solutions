import java.util.Scanner;

public class trik {

	public static void a(String[] a){
		String snoppDog = a[0];
		a[0] = a[1];
		a[1] = snoppDog;
	}
	
	public static void b(String[] a){
		String snoppDog = a[1];
		a[1] = a[2];
		a[2] = snoppDog;
	}
	
	public static void c(String[] a){
		String snoppDog = a[0];
		a[0] = a[2];
		a[2] = snoppDog;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String commands = scan.next();
		
		String[] cups = {"*","-","-"};
		
		for(int i=0; i < commands.length(); i++)
		{
			if(commands.charAt(i) == 'A')
			{
				a(cups);
			}
			else if(commands.charAt(i) == 'B')
			{
				b(cups);
			}
			else
			{
				c(cups);
			}
		}
		
		if(cups[0].equals("*"))
		{
			System.out.print("1");
		}
		else if(cups[1].equals("*"))
		{
			System.out.print("2");
		}
		else
		{
			System.out.print("3");
		}
		
		scan.close();

	}

}
