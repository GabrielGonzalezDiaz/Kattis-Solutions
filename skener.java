import java.util.Scanner;

public class skener {

	public static void printMatrix(String[][] a){
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a[0].length; j++) {
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		int scaleR = scan.nextInt();
		int scaleC = scan.nextInt();
		
		scan.nextLine();
		
		String[][] text = new String[r][c];
		
		for(int i=0; i < r; i++)
		{
				String str = scan.nextLine();
				for(int o = 0; o < str.length(); o++)
				{
					text[i][o] = str.substring(o, o+1);
				}
			
		}
		for(int i=0; i < text.length; i++)
		{
			for(int u=0; u < scaleR; u++)
			{
				for(int j=0; j < text[0].length; j++){
					for(int o=0; o < scaleC; o++)
					{
						System.out.print(text[i][j]);
					}
				
				}
			System.out.println();
			}
		}
	
		scan.close();

	}

}
