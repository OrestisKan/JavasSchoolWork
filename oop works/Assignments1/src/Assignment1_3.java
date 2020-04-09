
public class Assignment1_3 {
	
	public static char run(String phrase )
	{
		char ans;
		//checking if it contains andy
		boolean cont =phrase.contains("Andy");
		
		if (cont==true )
			{
				ans= 'V';
		} else { //if it doesnt contain andy
				ans='X';
		}//end of if
			
				return ans;
				
	}// end of run
}
