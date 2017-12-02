import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class imagedecoding {
    
    public static void main( String[] args ) throws IOException {
        
        //Scanner scan = new Scanner( System.in );
    	BufferedReader scan = new BufferedReader( new InputStreamReader( System.in ) );
    	PrintWriter out = new PrintWriter( new BufferedOutputStream( System.out ) );
        boolean first = true;
        while( true ){
            String line = scan.readLine();
            if( line == null )
            	break;
            int lines = Integer.valueOf( line );
            		
            if( lines == 0 )
                break;
            if( first )
                first = false;
            else
            	out.println();
            int len = -1;
            boolean bad = false;
            while( lines --> 0 ) {
                String[] curr = scan.readLine().split( " " );
                char print = curr[ 0 ].charAt( 0 );
                int sum = 0;
                String str = "";
                for( int i=1; i < curr.length; i++ ){
                    int chars = Integer.valueOf( curr[ i ] );
                    sum += chars;
                    for( int j=0; j < chars; j++)
                        str += print;
                    if( print == '#' )
                        print = '.';
                    else
                        print = '#';
                    }
                out.println(str);
                if( len != -1 && len != sum )
                    bad = true;
                len = sum;
                }
            
            if(bad)
                out.println("Error decoding image" );
            }
        
        scan.close();
        out.close();
    }

}