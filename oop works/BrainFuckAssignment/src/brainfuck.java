import java.util.Scanner;

public class brainfuck {
	public static final int TAPE_SIZE = 1000;
	
	int temp;
	
	private int pointer= 0;
	private int [] tape ;
		
	public brainfuck(int size) {
		tape = new int[size];
		
	}//end of constructor
	public void interpret(String bfsource) {
		Scanner input = new Scanner(System.in);
		for (int i = 0 ; i < bfsource.length() ; i++ ) {

			
		
				switch(bfsource.charAt(i)) {
				case '+' :	if (tape[pointer]==255) {
								tape[pointer]=0;
							}else {
								tape[pointer] ++;
							}
							break;
				case '-':  if (tape[pointer]==0) {
							tape[pointer]=255;
							}else {
								tape[pointer] --;
							}
							break;
				case '<':  pointer -- ;
							break;
				case '>':  pointer++ ;
							break;
				case ',':  tape[pointer]=input.next().charAt(0);
							break;
				case '.':  int n=tape[pointer];
						   char ch=(char) n;
						   System.out.print(ch);
						    break;
				
						    
						    
						    
				case '[':  if(tape[pointer]==0) {
								do {
									i++;
								}while(bfsource.charAt(i)!=']');
									}//end of if
							break;
				
				case ']': if(tape[pointer]!=0) {
								do {
									i--;
								}while(bfsource.charAt(i)!='[');
								
							}//end of if-else 
	
				
				}//end of switch
				
			
		
		
		
		}//end of for loop
		
	
	
	
	input.close();
	}//end of interpret method	 
	

}//end of brainfuck class