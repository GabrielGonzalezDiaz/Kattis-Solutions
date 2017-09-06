import java.util.ArrayList;
import java.util.HashSet;

class node{
	
	int r;
	int c;
	int val;
	boolean flow = false;
	boolean visited = false;
	public node(int r, int c, int val){
		this.r = r;
		this.c = c;
		this.val = val;
		}	
	
	}

public class terraces {
    
	public static boolean ir(node[][] maze, int r, int c){
        return r >= 0 && r < maze.length && c >= 0 && c < maze[0].length;
        }
	
	
	public static int BFS(node[][] map){
		int pools = 0;
		int[] R = {0,1,0,-1};
        int[] C = {1,0,-1,0};
        HashSet<node> visited = new HashSet<node>();
        
		for(int r=0; r < map.length; r++){
			cols : for(int c=0; c < map[0].length; c++){
				if(visited.contains(map[r][c]))
					continue cols;
				int adj = 0;
				boolean pooled = true;
				ArrayList<node> q = new ArrayList<>();
				q.add(map[r][c]);
				visited.add(map[r][c]);
				while(!q.isEmpty()){
					node n = q.remove(0);
					adj++;
					for(int i=0; i < 4; i++){
						int rr = n.r + R[i];
						int cc = n.c + C[i];
						
						if(ir(map,rr,cc)){
							if(map[rr][cc].val == map[r][c].val && !visited.contains(map[rr][cc])){
								q.add(map[rr][cc]);
								visited.add(map[rr][cc]);
								}
							if(map[rr][cc].val < map[r][c].val){
								pooled = false;
								}
							}
						}
					
					}
				if(pooled)
					pools += adj;
				}
			}
		return pools;
		}
   
    public static void main(String[] args) {
    	
    	Kattio scan = new Kattio(System.in);
    	
    	int cols = scan.getInt();
    	int rows = scan.getInt();
    	
    	node[][] terrace = new node[rows][cols];
    	
    	for(int r=0; r < rows; r++)
    		for(int c=0; c < cols; c++)
    			terrace[r][c] = new node(r,c,scan.getInt());
    		
    	
    	int pool = BFS(terrace);
    	
    	System.out.println(pool);
        
        scan.close();
        
        }

    }