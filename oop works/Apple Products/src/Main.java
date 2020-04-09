import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class Main {
    public static Scanner input;    //initializing the scanner here in order to be public
    public static String fileName;
    public static List<iPad> ipadList = new ArrayList<iPad>();
    public static List<iPhone> iphoneList= new ArrayList<iPhone>();
    public static ProductList productList;
    public static void main(String[] args){
        System.out.println("Please enter the file name");
        input = new Scanner(System.in);

        fileName = input.next();

        //readFile(fileName);
        //System.out.println("Please make your choice: \n 1 -Show the entire Apple catalogue2 \n –Add a new iPhone3 \n –Add a new iPad4 \n -Show the entire Apple catalogue sorted by product \n 5 –Show the entire Apple catalogue sorted by price (low to high) \n 6 –Write to file \n 7 –Stop the program");

        run();




    }//end of psvm

    /**
     * run method is where the program will run and the choices will be made
     */
    public static void run() {
        System.out.println("Please make your choice: \n 1 -Show the entire Apple catalogue \n 2-Add a new iPhone \n 3-Add a new iPad \n  4-Show the entire Apple catalogue sorted by product \n 5 -Show the entire Apple catalogue sorted by price (low to high) \n 6 -Write to file \n 7 -Stop the program");
       String choice = input.next();

        if (choice.equals("1")) {
            

        } else if (choice.equals("2")) {
        	option2();
        	run();
        } else if (choice.equals("3")) {
        	option3();
        	run();
        } else if (choice.equals("4")) {
        	option4();
        	run();
        } else if (choice.equals("5")) {

        } else if (choice.equals("6")) {
        	option6();
        	run();
        } else if (choice.equals("7")) {
            option7();
        }else{
            System.out.println("The options are only 1-7");
            run();
        }//end of if statement

    }//end of run method

    public static void option7(){
        System.out.println("Program will now terminate.BB");
        input.close();
        System.exit(0);
    }//end of option 7
    
    
    
    public static void option4(){
    	readFile(fileName);
    	for(int i=1 ;i<=iphoneList.size();i++) {
    		iPhone iphone = (iPhone) iphoneList.get(i);
    		System.out.println("APPLE "+iphone.name+ " with "+iphone.memory+" of memory \n     with an "+iphone.processor+" processor and "+iphone.size+" inch screen \n     "+iphone.price+" euros" );
    	}//end of for
    	
    	for (int i=1 ; i<=ipadList.size();i++) {
    		iPad ipad=(iPad) ipadList.get(i);
    		System.out.println("APPLE "+ipad.name+" with "+ipad.memory+" of memory \n     with an "+ipad.processor+" processor and "+ ipad.size+ " inch screen \n     having wifi \n     "+ipad.price+" euros");
    	}//end of for
    	
    	run();
    }//end of option1
    


    /**
     * Checks for exception on the file then passes the scanner to the readFile
     *
     * @param fileName
     */
    public static void readFile(String fileName){
       try{
           FileReader fr = new FileReader(fileName);
    	   Scanner sc = new Scanner(fr);
            readFile(sc);
       }catch(FileNotFoundException e){
           e.printStackTrace();
       }
    }

    /**
     * Reads the file using the scanner that it got
     * @param sc
     */
    public static void readFile(Scanner sc){
    	String name;
        String size;
        String processor;
        String colour;
        String memory;
        String price;
    	while (sc.hasNextLine()) {
    		
    		String line = sc.nextLine();
    		if(line.contains("IPHONE")) {
    			String modem;
    		    boolean touch3D;
    		    
    		    String[] temp =line.split(", ");
    		    name=temp[0];
    		    size=temp[1];
    		    processor=temp[2];
    		    modem=temp[3];
    		    colour=temp[4];
    		    memory=temp[5];
    		    touch3D =Boolean.parseBoolean(temp[6]);
    		    price=temp[7];
    		    
    		    iPhone i = new iPhone (name,size,processor,colour,memory,price,modem,touch3D);
    		    
    		    iphoneList.add(i);
    		    
    		    
    		}else if(line.contains("iPad")) {
    			boolean is4G;
    			
    			String[] temp = line.split(", ");
    			name=temp[0];
     		    size=temp[1];
     		    processor=temp[2];
    			is4G=Boolean.parseBoolean(temp[3]);
    			colour=temp[4];
     		    memory=temp[5];
     		    price=temp[6];
     		    
     		    iPad i = new iPad(name,size,processor,colour,memory,price,is4G);
     		    
     		    ipadList.add(i);
    		}//end of if -else
    	}
    	
    	
    	
    }//end of readFile


    public static void option6(){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter bw =new BufferedWriter(fw);
            System.out.println("Is it an iphone or an ipad?");
            String ch =input.next();
            String str="";
            if(ch.equals("iphone")){
                System.out.println("give the model name");
                String name = input.next();
                System.out.println("give the screensize");
                String size = input.next();
                System.out.println("give the processor");
                String pros = input.next();
                System.out.println("give the modem");
                String mode = input.next();
                System.out.println("give the colour");
                String color = input.next();
                System.out.println("give the amount of memory");
                String memo = input.next();
                System.out.println("give if its 3d or not");
                String isit3d = input.next();
                System.out.println("give the price");
                String money = input.next();

                 str = "IPHONE "+ name +", "+size+", "+pros+", "+mode+", "+color+", "+memo+", "+isit3d+", "+money;

            }else if(ch =="ipad"){
                System.out.println("give the model name");
                String name = input.next();
                System.out.println("give the screensize");
                String size = input.next();
                System.out.println("give the processor");
                String pros = input.next();
                System.out.println("Does it has 4g?");
                String isit4g = input.next();
                System.out.println("give the colour");
                String color = input.next();
                System.out.println("give the amount of memory");
                String memo = input.next();
                System.out.println("give the price");
                String money = input.next();

                str = "IPAD "+name+", "+size+", "+pros+", "+isit4g+", "+color+", "+memo+", "+money;
            }

            bw.write(str);
            bw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of option6
    
    public static void option2() {
    	System.out.println("Enter 1 if you want to add an iphone to the list \nEnter 2 if you want to add an iphone to the file ");
    	int d = input.nextInt();
    	
    	switch (d) {
    	case 2:  {option6();}
    				break;
    	
    	case 1:  {  String temp;
    				String name;
    				String size;
    				String processor;
    				String colour;
    				String memory;
    				String price;
    				String modem;
        		    boolean touch3D;
        		    
        		    System.out.println("Give name");
        		    temp=input.next();
        		    
        		    name=temp;
        		    System.out.println("Give size");
        		    temp=input.next();
        		    
        		    size=temp;
        		    System.out.println("Give processor");
        		    temp=input.next();
        		    processor=temp;
        		    System.out.println("Give modem");
        		    temp=input.next();
        		    modem=temp;
        		    System.out.println("Give colour");
        		    temp=input.next();
        		    colour=temp;
        		    System.out.println("Give memory");
        		    temp=input.next();
        		    memory=temp;
        		    System.out.println("Give if there is touch 3d");
        		    temp=input.next();
        		    touch3D =Boolean.parseBoolean(temp);
        		    System.out.println("Give price");
        		    temp=input.next();
        		    price=temp;
        		    
        		    iPhone i = new iPhone (name,size,processor,colour,memory,price,modem,touch3D);
        		    
        		    iphoneList.add(i);
        		    
    				}
    				break;
    	}//end of switch
    	run();
    }//end of option2;
    
    public static void option3() {
    	System.out.println("Enter 1 if you want to add an iphone to the list \nEnter 2 if you want to add an iphone to the file ");
    	int d = input.nextInt();
    	
    	switch (d) {
    	case 2:  {option6();}
    				break;
    	
    	case 1:  {  String temp;
    				String name;
    				String size;
    				String processor;
    				String colour;
    				String memory;
    				String price;
    				boolean is4G;
    				
    				System.out.println("Give name");
        		    temp=input.next();
        		    
        		    name=temp;
        		    System.out.println("Give size");
        		    temp=input.next();
        		    
        		    size=temp;
        		    System.out.println("Give processor");
        		    temp=input.next();
        		    processor=temp;
        		    
        		    System.out.println("Give colour");
        		    temp=input.next();
        		    colour=temp;
        		    System.out.println("Give memory");
        		    temp=input.next();
        		    memory=temp;
        		   
        		    System.out.println("Give price");
        		    temp=input.next();
        		    price=temp;
        		    
        		    System.out.println("Give if there is 4g");
        		    temp=input.next();
        		    is4G = Boolean.parseBoolean(temp);
        		    
        		    iPad i = new iPad(name,size,processor,colour,memory,price,is4G);
         		    
         		    ipadList.add(i);
   
    			}
    			break;
    	}//end of switch
    	run();
    }//end of option3
    
    public static void option1() {
    	 try{
             Scanner sc = new Scanner(new File(fileName));
             String[] temp;
             String name;
             String size;
             String processor;
             String colour;
             String memory;
             String price;
             
             String line= sc.nextLine();
             
             if (line.contains("IPHONE")) {
            	 boolean touch3D;
            	 String modem;
            	 temp=line.split(", ");
            	 name=temp[0];
     		     size=temp[1];
     		     processor=temp[2];
     		     modem=temp[3];
     		     colour=temp[4];
     		     memory=temp[5];
     		     touch3D =Boolean.parseBoolean(temp[6]);
     		     price=temp[7];
     		    
     		     iPhone iphone = new iPhone (name,size,processor,colour,memory,price,modem,touch3D);
  
            	 System.out.println("APPLE "+iphone.name+ " with "+iphone.memory+" of memory \n     with an "+iphone.processor+" processor and "+iphone.size+" inch screen \n     "+iphone.price+" euros" );
             }else if (line.contains("IPAD")) {
            	 boolean is4G;
            	 
            	 temp = line.split(", ");
     			 name=temp[0];
      		     size=temp[1];
      		     processor=temp[2];
     			 is4G=Boolean.parseBoolean(temp[3]);
     			 colour=temp[4];
      		     memory=temp[5];
      		     price=temp[6];
      		    
      		     iPad ipad = new iPad(name,size,processor,colour,memory,price,is4G);
      		     System.out.println("APPLE "+ipad.name+" with "+ipad.memory+" of memory \n     with an "+ipad.processor+" processor and "+ ipad.size+ " inch screen \n     having wifi \n     "+ipad.price+" euros");
             }//end of if -else
             
             
             sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
	
    }//end of option 1 
    
    public static void option5() {
    	new Sorting(productList, new ComparePrice()).start();
    }//end of option 5
    
}//end of main class
