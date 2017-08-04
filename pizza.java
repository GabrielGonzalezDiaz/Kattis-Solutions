
public class pizza 
	{

	//THIS PROBLEM WAS USED AT THE 2017 FIU COMP SCI COMPETITION, SO THIS 
	//SOLUTION IS VERY SIMILAR TO THEIRS
	
	
	static int getCenterRow(int rows, int cols, int numDeliveries, int[][] L) {
        
        int rowSum = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                rowSum += L[i][j];
                if( rowSum >= numDeliveries / 2) {
                    return i;
                }
            }         
        }     
        return 0;
    }
    
    static int getCenterColumn(int rows, int cols, int numDeliveries, int[][] L) {
        int sum = 0;
        for(int j=0; j<cols; j++) {
            for(int i=0; i<rows; i++) {
                sum += L[i][j];
                if( sum >= numDeliveries / 2) {
                    return j;
                }
            }              
        }    
        return 0;
    }
	
	public static int sum(int[] a)
		{
		int sum = 0;
		for(int i=0; i < a.length; i++)
			sum += a[i];
		return sum;
		}
	
	public static void main(String[] args) 
		{
		
		Kattio scan = new Kattio(System.in);
		
		int cases = scan.getInt();
		
		while( cases --> 0 )
			{
			int cols = scan.getInt();
			int rows = scan.getInt();
			int[][] city = new int[rows][cols];
			int numDeliv = 0;
			for(int r=0; r < rows; r++)
				for(int c=0; c < cols; c++)
					{	
					city[r][c] = scan.getInt();
					numDeliv += city[r][c];
					}
			
			int centerRow = getCenterRow(rows,cols, numDeliv, city);
	        int centerCol = getCenterColumn(rows,cols, numDeliv, city);
	            
	            
	        int cost = 0;
	        for(int i=0; i<rows; i++) {
	        	for(int j=0; j<cols; j++) {
	        		int dist = Math.abs(centerRow-i) + Math.abs(centerCol-j); 
	                cost += (dist * city[i][j]);
	                }            
	            }
	            
	        System.out.println( cost + " blocks");
			
			
			
			
			}
		
		scan.close();

		}

	}
