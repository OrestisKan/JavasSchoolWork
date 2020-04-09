
public class Assignment1_4 {
	//initializing the run method 
	
	public static int run(int num1,int num2,int num3)
	{
		int max;
		if ((num1 ==num2 )&&(num1==num3))
		{
			max=-1;
		}else {
			max=num1;
			if ((num2>max)&&(num2>num3))
			{
				max=num2;
			}else if((num3>max)&&(num3>num2)) {
				max= num3;
			}	
			
		}//end of if-else
		
		return max;
	}
}
