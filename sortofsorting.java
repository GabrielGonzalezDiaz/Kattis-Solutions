import java.util.Scanner;

public class sortofsorting {

	public static boolean bigger(String a, String b)
	{
		if(a.length() > 2)
			a = a.substring(0, 2);
		if(b.length() > 2)
			b = b.substring(0, 2);
		
		if(a.length() < 2 && b.length() < 2)
		{
			return a.charAt(0) > b.charAt(0);
		}
		else if(a.length() < 2 || b.length() < 2)
		{
			if(a.charAt(0) == b.charAt(0))
				return false;
			else
				return a.charAt(0) > b.charAt(0);
		}
		else
		{
			if(a.charAt(0) == b.charAt(0))
				return a.charAt(1) > b.charAt(1);
			else
				return a.charAt(0) > b.charAt(0);
		}
		
	}	
		
	public static String[] BubbleSortStr(String[] a){
		
		for(int i=0; i < a.length-1; i++){
			for(int j=0; j < a.length-1-i; j++){
				if(bigger(a[j],a[j+1])){
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int names = scan.nextInt();
			scan.nextLine();
			String[] list = new String[names];
			for(int i=0; i < names; i++)
			{
				list[i] = scan.nextLine();
			}
			
			list = BubbleSortStr(list);
			
			for(int i=0; i < names; i++)
			{
				System.out.println(list[i] + " ");
			}
			
			System.out.println();
			
		}
		
		scan.close();

	}

}
