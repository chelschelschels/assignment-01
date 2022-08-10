public class MyInteger {
private int myvalue; //data field

public MyInteger(int value) { 
myvalue = value;
}
public int getValue() {
return myvalue;
}

public boolean isEven() { 
return (myvalue % 2) == 0;
}

public boolean isOdd() { 
return (myvalue % 2) == 1;
}

public boolean isPrime() { 
if (myvalue == 1 || myvalue == 2) {
return true;
}
else {
for(int i = 2; i < myvalue; i++) {
if(i % myvalue == 0)
return false;
}
}
return true;
}

public static boolean isEven(MyInteger myInt) { 
return myInt.isEven();
}

public static boolean isOdd(MyInteger myInt) { 
return myInt.isOdd();
}

public static boolean isPrime(MyInteger myInt) { 
return myInt.isPrime();
}

public boolean equals(int obInt) { //value of object
if(obInt == myvalue)
return true;
else
return false;

}

}
import java.util.*;
import java.io.*;
public class assignmentone {//start of class
	public static void main(String[] args)throws FileNotFoundException { //start of main method
		
		Scanner input=new Scanner(new File("word.txt"));
		while(input.hasNextLine()) {//start of while loop 
			String line=input.nextLine();
			Scanner ScanLine=new Scanner(line);
			int count=0;
			while(ScanLine.hasNext()) {//start of while loop 
				String word=ScanLine.next();
				count++;
			}//end of while loop 
			System.out.println("Line has "+count+" words");
		}//end of while loop 
	}//end of main method for word count 
	
public static void charactercount(String[] args)throws FileNotFoundException { 
	//start of main method
	  Scanner input=new Scanner(new File("word.txt"));  
	  String input1 = input.nextLine();    
      int count = 0; //Count the characters in the string except space    
      for(int i = 0; i < input1.length(); i++) {   //start of for statement 
          if(input1.charAt(i) != ' ')    
              count++;    
      } //end of for statement 
        
      System.out.println("Line has " + count+" characters");    
      //Displays the total number of characters in the string  
  }    //end of main method   

public static void linecount(String[] args)throws FileNotFoundException {//start of line method

    int count = 0;

    try {//start of scanner file 
      // create a new file object
      File file = new File("word.txt");

      // create an object of Scanner
      // associated with the file
      Scanner sc = new Scanner(file);

      // read each line and
      // count number of lines
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("Total Number of Lines " + count);

      // close scanner
      sc.close();
    } //end of scanner file 
    catch (Exception e) { //beginning of catch statement
      e.getStackTrace();
    }//end of catch statement 
}//end of line method
}//end of class 