
public class Assignment2_1 {
	
	public static void println(int[] seq) {
		int n = seq.length;
		for (int i=0 ; i<=n; i++) {
			System.out.print(seq[i]+" ");
			
		}//end of for loop
		System.out.println();
	}//end of println method
	
	public static void swap(int[] seq) {
		if (seq.length >=2) {
			int temp;
			temp =seq[1];
			seq[1]=seq[0];
			seq[0]=temp;
			
			swap(new int[] {seq[0],seq[1]});
			
		
		}else {
			
			throw new IllegalArgumentException();
		
		}//end of if-else
	
		
	
	}//end of swap method

	public static int[] copy(int[] seq) {
		
		int n =seq.length;
		int[] result =new int[n];
		for (int i=0;i<=n;i++) {
			result[i]=seq[i];
		
		}//end of for loop
	
		return result;
	
	}//end of copy method 
	
	public static void rotate(int[] seq) {
		int n = seq.length;
		if (n >=1) {
			int[] temp= new int[n];
			for (int i=0;i<=n;i++) {
				temp[i]=seq[i];
			}//end of for loop
			for (int i=0; i<=n-1;i++) {
				seq[i+1]=temp[i];
				
			}//end of for 
			seq[0]=temp[n];
		
		}else {
			
			throw new IllegalArgumentException();
		}//end of if-else
	
	}//end of rotate method 

	public static void rotate(int[] seq, int n) {
		int length = seq.length;
		if ((length >=1)&&(n>0) ) {
			for (int j=0; j <=n; j++) {
				int[] temp= new int[length];
				for (int i=0;i<=length;i++) {
					temp[i]=seq[i];
				}//end of for loop
				for (int i=0; i<=length-1;i++) {
					seq[i+1]=temp[i];
					
				}//end of for 
				seq[0]=temp[length];
			
			}//end of j for loop 
			
		}else {

			throw new IllegalArgumentException();	
		}//end of if-else
		
		
		
		
	}//end fo rotate with n method 








}//end of Assignment2_1 classs

