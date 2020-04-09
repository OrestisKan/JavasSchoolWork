	import java.util.Scanner;

	public class brainfuck2 {
		public static final int TAPE_SIZE = 100; 
		
		private int pointer= 0;
		private int [] tape ;
			
		public brainfuck2(int size) {
			tape = new int[size];
			
		}
		public void interpret(String bfsource) {
			Scanner input = new Scanner(System.in);
			for (int i = 0 ; i < bfsource.length() ; i++ ) {
				
				if(bfsource.charAt(i) == '>') { pointer++ ;}
				else if(bfsource.charAt(i) == '<') { pointer -- ;}
				else if(bfsource.charAt(i) == '+') { tape[pointer] ++ ;}
				else if(bfsource.charAt(i) == '-') { tape[pointer] --;}
				else if(bfsource.charAt(i) == ',') { 
					tape[pointer]=input.next().charAt(0);
				}
				else if(bfsource.charAt(i) == '.') { 
					int n=tape[pointer];
					char ch=(char) n;
					System.out.print(ch);
				}
				else if(bfsource.charAt(i) == '[') { 
					if(tape[pointer] == 0) {
						int loop = 1 ;
						i++;
						while (loop != 0) {
							if(bfsource.charAt(i) == '[') { loop ++ ;}
							else if(bfsource.charAt(i) == ']') { loop --;}
							i++;

						}
					}
					else if(bfsource.charAt(i) == ']') { 
						if(tape[pointer] != 0) {
							int loop = 1 ;
							i--;
							while (loop != 0) {
								if(bfsource.charAt(i) == ']') { loop ++ ;}
								else if(bfsource.charAt(i) == '[') { loop --;}
								i--;

						}

						

					}

					
					

				}



				}


			
		}
	
		input.close();
		
		}
		
	}

