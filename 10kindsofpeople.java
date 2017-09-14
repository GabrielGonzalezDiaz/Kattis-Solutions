import java.util.ArrayList;

public class T10kindsofpeoplePRO {

	static int[] R = {0,1,0,-1};
    static int[] C = {1,0,-1,0};
	
    //WITH A CRUCIAL FIX BY PEDRO CONTIPELLI: https://github.com/PedroContipelli
    
    public static void setgroup(TPnode[][] map, int r, int c, int group){
    	ArrayList<TPnode> queue = new ArrayList<>();
    	queue.add(map[r][c]);
    	map[r][c].group = group;

    	while (!queue.isEmpty())
    		{
    		TPnode n = queue.remove(0);
    		
    		for (int i = 0; i < 4; i++)
    			{
    			int newR = n.r + R[i];
    			int newC = n.c + C[i];

    			if (ir(map, newR, newC))
    				if (map[r][c].val == map[newR][newC].val && map[newR][newC].group == -1){
    					map[newR][newC].group = group;
    					queue.add(map[newR][newC]);
    					}
    			}
    		}
    	}
    
    public static boolean ir(TPnode[][] map, int r, int c){
        return r > -1 && c > -1 && r < map.length && c < map[0].length;
        }
    
	public static void main(String[] args) {
		
		Kattio scan = new Kattio(System.in);
        int rows = scan.getInt();
        int cols = scan.getInt();
        
        TPnode[][] map = new TPnode[rows][cols];
        
        for(int r=0; r < rows; r++){
            String line = scan.getWord();
            for(int c=0; c < cols; c++){
                map[r][c] = new TPnode(r, c, line.charAt(c));
                }
            }
        
        int group = 1;
        
        for(int r=0; r < rows; r++){
            for(int c=0; c < cols; c++){
                if(map[r][c].group == -1){
                	setgroup(map, r, c, group);
                	group++;
                	}
                }
            }
        
        
        
        int cases = scan.getInt();
        
        while(cases --> 0){
            int r1 = scan.getInt()-1;
            int c1 = scan.getInt()-1;
            int r2 = scan.getInt()-1;
            int c2 = scan.getInt()-1;
            
            if(map[r1][c1].group == map[r2][c2].group){
            	if(map[r1][c1].val == '0')
                    System.out.println("binary");
                else
                    System.out.println("decimal");
                
            	}
            else{
            	System.out.println("neither");
            	}
            
            }
        
        scan.close();
		

		}

	
	
	}

class TPnode{
	
    int r;
    int c;
    char val;
    int group = -1;
    public TPnode(int r, int c, char val){
        this.r = r;
        this.c = c;
        this.val = val;
        }
    
    public String toString(){
        return val + " ";
        }
    }
