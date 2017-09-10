import java.util.ArrayList;

class Star{
    int r;
    int c;
    char val;
    public Star(int r, int c, char val){
        this.r = r;
        this.c = c;
        this.val = val;
        }
    }

public class countingstars {
    
    public static boolean ir(Star[][] sky, int r, int c){
        return r > -1 && c > -1 && r < sky.length && c < sky[0].length;
        }
    
    public static void flod(Star[][] sky, boolean[][] visited, int r, int c){
        int[] R = {0,1,0,-1};
        int[] C = {1,0,-1,0};
        visited[r][c] = true;
        for(int i=0; i < 4; i++)
        	if(ir(sky,r+R[i],c+C[i]) && !visited[r+R[i]][c+C[i]] && sky[r+R[i]][c+C[i]].val == '-')
        		flod(sky,visited,r+R[i],c+C[i]);
    	}
    
    public static int BFS(Star[][] sky){
        
        int stars = 0;
        boolean[][] visited = new boolean[sky.length][sky[0].length];
        for(int r=0; r < sky.length; r++){
            for(int c=0; c < sky[0].length; c++){
                if(visited[r][c] || sky[r][c].val == '#')
                    continue;
                stars++;
               
               flod(sky, visited, r, c);
                               
            	}
            }
        	
        return stars;
        }
    
    public static void main(String[] args) {
        
        
        Kattio scan = new Kattio(System.in);
        int num = 1;
        while(scan.hasMoreTokens()){
            int rows = scan.getInt();
            int cols = scan.getInt();
    
            Star[][] sky = new Star[rows][cols];
            
            for( int r=0; r < rows; r++ ) {
                String line = scan.getWord();
                for(int c=0; c < cols; c++){
                    sky[r][c] = new Star(r,c,line.charAt(c));
                    }   
                }
            
            scan.println("Case " + num + ": " + BFS(sky));
            num++;
        }
        scan.close();

        }

    }