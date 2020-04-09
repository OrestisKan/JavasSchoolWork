import java.io.*;
import java.util.Scanner;

public class Main {
	public static String fileName;
	public static Scanner input; 
	public static CarList carList;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Pls give the file name");
		fileName=input.next();
		
		try {
			carList.read(fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		run();
	}//end of psvm
	
	public static void run()  {
		System.out.println("1 - Show the entire Mobility4You catalogue\r\n" +"2 – Add a new electric car\r\n" + 	"3 – Add a new gas-powered car\r\n" +"4 – Add a new hybrid car\r\n" +"5 - Show the entire Mobility4You catalogue sorted by car-type\r\n" + "6 – Show the entire Mobility4You catalogue sorted by brand\r\n" +" (alphabetically)\r\n" +"7 – Write to file\r\n" + 	"8 – Stop the program ");
		String choice=input.next();
		
		if(choice.equals("1")) {
			option1();
			run();
		}else if(choice.equals("2")) {
			option2();
			run();
		}else if(choice.equals("3")) {
			option3();
			run();
		}else if(choice.equals("4")) {
			option4();
			run();
		}else if(choice.equals("5")) {
			
		}else if(choice.equals("6")) {
			
		}else if(choice.equals("7")) {
			try {
				option7();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			run();
		}else if(choice.equals("8")) {
			option8();
		}else {
			System.out.println("Pls enter a valid number(1-8)");
			run();
		}
	}//end of run method
	public static void option1() {
		try {
			carList = CarList.read(fileName);
			System.out.println(carList.getCarList().toString());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}//end of option1
	
	public static void option2() {
		System.out.println("Enter Brand");
		String brand = input.next();
		System.out.println("Enter name");
		String name = input.next();
		System.out.println("Enter power");
		String power = input.next();       
		System.out.println("Enter price");
		String price = input.next();
		System.out.println("Enter battery");
		String battery= input.next();
		
		Electric e = new Electric (brand,name,power,price,battery);
		
		carList.add(e);
	}//end of option2
	
	public static void option3() {
		System.out.println("Enter Brand");
		String brand = input.next();
		System.out.println("Enter name");
		String name = input.next();
		System.out.println("Enter power");
		String power = input.next();       
		System.out.println("Enter price");
		String price = input.next();
		System.out.println("Enter displacement");
		String displacement= input.next();
		
		Gas g = new Gas(brand,name,power,price,displacement);
		
		carList.add(g);
	}//end of option3
	
	public static void option4() {
		System.out.println("Enter Brand");
		String brand = input.next();
		System.out.println("Enter name");
		String name = input.next();
		System.out.println("Enter power");
		String power = input.next();       
		System.out.println("Enter price");
		String price = input.next();
		System.out.println("Enter battery");
		String battery= input.next();
		System.out.println("Enter displacement");
		String displacement= input.next();
	
		Hybrid h = new Hybrid(brand,name,power,price,battery,displacement);
		carList.add(h);
	}//end of option4
	
	public static void option7() throws IOException {
		
		
		if (carList.getCarList().size()>=1) {
			FileWriter fw =new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.close();
			for(int i=1;i<=carList.getCarList().size();i++) {
				bw.write(carList.getCarList().get(i).toString());
				bw.newLine();
			}
		
		}else {
			throw new IllegalArgumentException();
		}
		
	}//end of option7()
	
	
	public static void option8() {
		System.out.println("Program will now terminate");
		input.close();
		System.exit(0);
	}//end of option 8 
}//end of class
