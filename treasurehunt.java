import java.util.Scanner;

public class treasurehunt {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		scan.nextLine();
		String[][] map = new String[rows][cols];
		boolean[][] visited = new boolean[rows][cols];
		
		for(int r=0; r < rows; r++)
		{
			String line = scan.nextLine();
			for(int c=0; c < cols; c++)
			{
				map[r][c] = line.substring(c, c+1);
			}
		}
		
		int counter = 0;
		
		int posr=0;
		int posc=0;
		
		boolean found = false;
		
		String ans = "";
		
		while(!found)
		{
			if(posr < 0 || posc < 0 || posr >= rows || posc >= cols)
			{
				ans = "out";
				break;
			}
			String pos = map[posr][posc];
			if(pos.equals("T"))
			{
				found = true;
				ans = counter + "";
			}
			else
			{
				if(visited[posr][posc])
				{
					ans = "lost";
					break;
				}
				visited[posr][posc] = true;
				counter++;
				if(pos.equals("N")) posr--;
				else if(pos.equals("S")) posr++;
				else if(pos.equals("W")) posc--;
				else if(pos.equals("E")) posc++;
			}
		}
		
		System.out.println(ans);
		
		scan.close();

	}

}
