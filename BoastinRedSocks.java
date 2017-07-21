import java.util.Scanner;

public class BoastinRedSocks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double red = scan.nextDouble();
			double total = scan.nextDouble();
			if(red == 0 && total == 0)
			{
				break;
			}
			else
			{
				boolean found = false;
				double num1 = 1.0, num2 = 2.0;
				double den1 = 2.0, den2 = 3.0;
			
				                  //2499550020
				for(double i=0; i < total; i++, num1++, num2++, den1++, den2++)
				{
					if((num1/den1) * (num2/den2) == red/total)
					{
						found = true;
						System.out.println((int)num2 + " " + (int)(den2-num2));
					}
				}
				
				if(!found)
					System.out.println("impossible");
				
			}
		}
		
		scan.close();
	}
}
