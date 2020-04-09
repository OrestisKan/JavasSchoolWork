
public class Assignment1_7{
	
	//creating the max method
	public static double max(double x , double y)
	{
		double ans;
		if (x>y)
		{
			ans=x;
		}else {
			ans=y;
		}//end of if-else
		return ans;
	} //end of max
	
	//creating abs method
	public static double abs(double x)
	{
		double ans;
		if (x >= 0) {
			ans=x;
		}else {
			ans=x*(-1);
		}//end of if-else
		return ans;
		
	}//end of abs method
	
	
	//creating squared method 
	public static double squared(double x)
	{
		double ans;
		ans=x*x;
		return ans;
		
	}//end of squared method

	
	//creating distance method 
	public static double distance(double x1,double y1,double x2 , double y2)
	{
		double dist;
		dist = Math.sqrt( (x2-x1)*(x2-x1) +(y2-y1)*(y2-y1) );

		return dist;
		
	}//end of distance method



}//end of class
