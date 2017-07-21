import java.util.Scanner;

public class bijele {

	public static void main(String[] args) {
		
		/**One king
		One queen
		Two rooks
		Two bishops
		Two knights
		Eight pawns*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] current = new int[6];
		int[] best = new int[6];
		int[] ans = new int[6];
		
		best[0] = 1;
		best[1] = 1;
		best[2] = 2;
		best[3] = 2;
		best[4] = 2;
		best[5] = 8;
		
		for(int i=0; i<6; i++){
			current[i] = scan.nextInt();
		}
		
		for(int i=0; i<6; i++){
			if(current[i] == best[i]) ans[i] = 0;
		}
		
		for(int i=0; i<6; i++){
						
			if(current[i] < best[i]){
				ans[i] = best[i] - current[i];
			}else{
				ans[i] = -1 * (current[i] - best[i]);
			}
			
		}
		
		for(int i=0; i<6; i++){
			System.out.print(ans[i] + " ");
		}
		
		scan.close();
		
		 
		
		
		

	}

}
