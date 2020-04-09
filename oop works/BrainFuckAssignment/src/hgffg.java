import java.util.*;
public class hgffg {

	public static void main(String[] args) {
		brainfuck interpreter = new brainfuck(1000);
		
		Scanner input = new Scanner(System.in);
		
		interpreter.interpret(input.next());
		input.close();
	}
	
}
