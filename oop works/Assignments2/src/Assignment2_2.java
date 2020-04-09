
public class Assignment2_2 {

	public static int max(int[] seq) {
		int maximum = Integer.MIN_VALUE;
		int length=seq.length;
		if(length==0) {
			return maximum;
		}else {
			
			for (int i=0; i<=length;i++) {
				if (maximum > seq[i]) {
					maximum = seq[i];
				}//end of if
			}//end of for loop
			return maximum;
		}//end of if-else 
	
	}//end of max method
	
	public static int index(int[] seq, int el) {
		int ans =-1;
		boolean flag = false ;
		int length= seq.length;
		int i=0;
		while ((i<=length)&&(flag=false)) {
			if (seq[i]==el) {
				flag=true;
				ans=i;
			}//end of if 
			i++;
		}//end of while loop
		return ans;
		
	}//end of index method 
	
	public static boolean contains(int[] seq, int el) {
		boolean ans=false;
		int counter=0;
		int length=seq.length;
		while ((ans=false)&&counter<=length) {
			if (seq[counter]==el) {
				ans=true;
			}//end of if
			counter++;

		}//end of while loop
		return ans;
		
	}//end of contains method 
	
	public static boolean isPrime(int el) {
		boolean ans=true ;
		if (el>1) {
			for (int i=2;i<=el-1;i++) {
				if ((el%i==0)) {
					ans = false;
				}//end of if
			}//end of for loop
			
			return ans;
		}else {
			throw new IllegalArgumentException();
		}//end of if-else 
		
	}//end of isPrime method
	
	public static int countPrimes(int[] seq) {
		int ans= -1;
		int count=0;
		boolean flag=true;
		
		if (seq.length>0) {
			for(int j=0;j<=seq.length;j++) {
				for(int i=2; i<=seq[i]-1;i++) {
					if(seq[i]%i==0) {
						flag=false;
					}//end of if 
					
				}//end of for 
				
				if (flag=true) {
					count++;
					ans=count;
					
				}//end of if 
				
			}//end of for 
			
			return ans;
		}else {
			throw new IllegalArgumentException();
		}//end of if-else 
		
		
	}//end of countPrimes method 
	
	public static int[] primesIn(int[] seq) {
		int temp[]=new int[seq.length];
		int count=0;
		boolean flag=true;
		
		if (seq.length>0) {
			for(int j=0;j<=seq.length;j++) {
				for(int i=2; i<=seq[i]-1;i++) {
					if(seq[i]%i==0) {
						flag=false;
					}//end of if 
					
				}//end of for 
				
				if (flag=true) {
					count++;
					temp[count]=seq[j];
					
				}//end of if 
				
			}//end of for 
			int ans[] = new int[count];
			for (int i=0; i<=count;i++) {
				ans[i]=temp[i];
			
			}//end of for 
		
			return ans;
		}else {
			throw new IllegalArgumentException();
		}//end of if-else 
	
		
	}//end of primesIn method 
	
	
	public static int[] primesUpTo(int n) {
		int[] temp = new int[n];
		boolean flag=true ;
		int count=0;
		for (int j=1;j<n;j++) {
			if (j>=1) {
				for (int i=2;i<=j-1;i++) {
					if ((j%i==0)) {
						flag = false;
					}//end of if
				}//end of for loop
			if (flag=true) {
				temp[count]=j;
				count++;
			}
			}
		}//end of for 
		
		
		return temp;
	}//end of primesUpTo
	
	

}//end of assignment2_2 class
