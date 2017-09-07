import java.util.ArrayList;
import java.util.HashSet;

class GoldNode{
	int r;
	int c;
	char val;
	public GoldNode(int r, int c, char val){
		this.r = r;
		this.c = c;
		this.val = val;
		}
	}

public class gold {

	public static boolean ir(GoldNode[][] map, int r, int c){
		return r > -1 && c > -1 && r < map.length && c < map[0].length;
		}
	
	public static int BFS(GoldNode[][] map, int r, int c){
		int gold = 0;
		
		HashSet<GoldNode> visited = new HashSet<>();
		ArrayList<GoldNode> q = new ArrayList<>();
		
		int[] R = {0,1,0,-1};
		int[] C = {1,0,-1,0};
		
		q.add(map[r][c]);
		
		
		queue : while(!q.isEmpty()){
			GoldNode pos = q.remove(0);
			if(pos.val == 'G')
				gold++;
				
			for(int i=0; i < 4; i++){
				int newR = pos.r + R[i];
				int newC = pos.c + C[i];
				if(ir(map,newR, newC)){
					if(map[newR][newC].val == 'T')
						continue queue;
					}
				}
			
			for(int i=0; i < 4; i++){
				int newR = pos.r + R[i];
				int newC = pos.c + C[i];
				if(ir(map,newR, newC) && !visited.contains(map[newR][newC])){
					if(map[newR][newC].val != '#')
						q.add(map[newR][newC]);
						visited.add(map[newR][newC]);
					}
				}
			
			
			}
		
		return gold;
		
		}
	
	public static void main(String[] args) {
		
		Kattio scan = new Kattio(System.in);
		
		int cols = scan.getInt();
		int rows = scan.getInt();

		GoldNode[][] map = new GoldNode[rows][cols];
		
		int startR = 0;
		int startC = 0;
		
		for( int r=0; r < rows; r++ ) {
			String line = scan.getWord();
			for(int c=0; c < cols; c++){
				char letter = line.charAt(c);
				map[r][c] = new GoldNode(r,c,letter);
				if(letter == 'P'){
					startR = r;
					startC = c;
					}
				}
			}
		
		System.out.println(BFS(map,startR,startC));
		
		scan.close();
		
		}

	}
