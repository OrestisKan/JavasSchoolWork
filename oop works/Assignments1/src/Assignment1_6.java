
public class Assignment1_6 {
	
	public static String run(int n)
	{
		String text="";
		for (int rows=0; rows !=n; rows++)
		{
			for (int collumns=0; collumns!=rows; collumns++)
			{
				text=text.concat("*");
			}//end of collumns for
	
			text=text.concat("\n");
		}//end of rows for
	
		return text;
	}//end of run method 


}//end of class
