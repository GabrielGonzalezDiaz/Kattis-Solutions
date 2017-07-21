import java.util.Scanner;

public class platforme {

	static Scanner scan = new Scanner(System.in);
	
	static int total = scan.nextInt();
	static int[] y = new int[total];
	static int[] x1 = new int[total];
	static int[] x2 = new int[total];
	
	public static int under1(int yy, int xx1)
	{
		
		int num = 0;
		
		for(int i=0; i < total; i++)
		{
			if((yy > y[i] && xx1 >= x1[i] && xx1 < x2[i]))
			{				
				if(yy-num > yy-y[i])
				{
					num = y[i];
				}
			}
		}
		
		return num;
		
	}
	public static int under2(int yy, int xx2)
	{
		
		int num = 0;
		
		for(int i=0; i < total; i++)
		{
			if((yy > y[i] && xx2 > x1[i] && xx2 <= x2[i]))
			{			
				if(yy-num > yy-y[i])
				{
					num = y[i];
				}
			}
		}
		
		return num;
		
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0; i < total; i++)
		{
			
			y[i] = scan.nextInt();
			x1[i] = scan.nextInt();
			x2[i] = scan.nextInt();
		}
		
		int count = 0;
		
		for(int i=0; i < total; i++)
		{
			count += (y[i] - under1(y[i], x1[i]));
			count += (y[i] - under2(y[i], x2[i]));
		}
		System.out.println(count);
		
		

	}

}
