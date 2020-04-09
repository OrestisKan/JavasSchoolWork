
public class Assignment1_5 {
	
	public static String run(int N)
	{
		String text="";
		for ( int rows=0;   rows !=N;  rows++)
		{
			for(int collumns=0; collumns!=N; collumns++)
			{
				text=text.concat("*");
			
			}//end of for(collumns)
			
				text=text.concat("\n");
		
		
		}// end of for(rows)
			return text;
	}//end of run
	
}//end of class
