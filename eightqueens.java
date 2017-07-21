import java.util.Scanner;

public class eightqueens {

	public static boolean queens(String board[][])
	{
		int queens=0;
		
		for(int r=0; r < 8; r++)
		{
			for(int c=0; c < 8; c++)
			{
				if(board[r][c].equals("*")) queens++;
			}
		}
		
		return queens == 8;
		
	}
	
	public static boolean ir(int r, int c){ return c > -1 && c < 8 && r > -1 && r < 8;}
	
	public static boolean oneQueen(String[][] board, int r, int c)
	{
		int queens = 0;
		
		for(int cc = 0; cc < 8; cc++)
		{
			if(cc != c)
			{
				if(board[r][cc].equals("*"))
				{
					queens++;
				}
			}
		}
		
		for(int rr = 0; rr < 8; rr++)
		{
			if(rr != r)
			{
				if(board[rr][c].equals("*"))
				{
					queens++;
				}
			}
		}
		
		int rrr = r-9;
		int ccc = c-9;
		
		for(int i=0; i < 30; i++)
		{
			if(ir(rrr+i, ccc+i) && rrr + i != r && ccc + i != c)
			{
				if(board[rrr+i][ccc+i].equals("*"))
				{
					queens++;
				}
			}
		}
		
		int rrrr = r-10;
		int cccc = c+10;
		
		for(int i=0; i < 30; i++)
		{
			if(ir(rrrr+i, cccc-i) && rrrr + i != r && cccc - i != c)
			{
				if(board[rrrr+i][cccc-i].equals("*"))
				{
					queens++;
				}
			}
		}
		
		return queens == 0;
		
	}
	
	public static void main(String[] args) {
		
		String[][] board = new String[8][8];
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int r=0; r < 8; r++)
		{
			String str = scan.nextLine();
			for(int c=0; c < 8; c++)
			{
				board[r][c] = str.substring(c,c+1);
			}
		}
		
		if(!queens(board))
		{
			System.out.println("invalid");
		}
		else
		{
			
		
			boolean found = false;
			
			loop1:for(int r=0; r < 8; r++)
			{
				for(int c=0; c < 8; c++)
				{
					if(board[r][c].equals("*"))
					{
						if(!oneQueen(board, r, c))
						{
							found = true;
							System.out.println("invalid");
							break loop1;
						}	
					}
				}	
			}
		
			if(!found) System.out.println("valid");
		
		}
			
	}

}
