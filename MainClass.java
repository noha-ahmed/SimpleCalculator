import java.util.Scanner;

interface Icalculator {
	int add(int x, int y);
	int divide (int x , int y) throws RuntimeException;
}
class Calculator implements Icalculator{
	public int add(int x, int y) {
		return x+y;
	}
	public int divide (int x , int y) throws RuntimeException{
		if(y==0) {
			throw new RuntimeException("cannot divide by zero");
		}
		return x/y;	
	}
	
}

public class MainClass {
	public static void main( String[] args) {
		try {
			Calculator c= new Calculator();
			System.out.println(c.divide(2, 0));
			
		}
		catch( Exception e) {
			System.out.println(e);	
		}
		
		
		
		
	}

}
