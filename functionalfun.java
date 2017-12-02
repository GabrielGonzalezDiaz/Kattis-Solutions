import java.util.ArrayList;
import java.util.Scanner;

public class functionalfun {

	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextLine() ){
			boolean injective = true;
			boolean surjective = true;
			boolean notfunc = false;
			scan.next();
			/**String[] domain = **/scan.nextLine().trim().split( " " );
			
			scan.next();
			String[] codomain = scan.nextLine().trim().split( " " );
			int p = scan.nextInt();
			point[] points = new point[p];
			int counter = 0;
			while( p --> 0 ) {
				String x = scan.next();
				scan.next();
				String y = scan.nextLine().trim();
				points[ counter ] = new point( x, y );
				counter++;
				}
			
			ArrayList< String > visited = new ArrayList< String >();
			
			for( point j : points ){
				if( visited.contains( j.y ) )
					injective = false;
				else
					visited.add( j.y );
				}
			
			if( codomain.length != visited.size() )
				surjective = false;
			
			ArrayList< String > xs = new ArrayList< String >();
			
			for( point j : points ){
				if( xs.contains( j.x ) ) {
					notfunc = true;
					break;
					}
				else
					xs.add( j.x );
				}
			
			if( notfunc )
				System.out.println( "not a function" );
			else if(injective && surjective)
				System.out.println( "bijective" );
			else if( injective )
				System.out.println( "injective" );
			else if(surjective)
				System.out.println( "surjective" );
			else
				System.out.println( "neither injective nor surjective" );
			
			
			}
		
		scan.close();
		
		}

	}

class point {
	
	String x;
	String y;
	public point( String x, String y ) {
		this.x = x;
		this.y = y;
	}
	
	}
