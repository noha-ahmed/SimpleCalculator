
public class Calculator implements ICalculator{
	public int add(int x, int y) {
		return x+y;
	}
	public float divide (int x , int y) throws RuntimeException{
		if(y==0) {
			throw new RuntimeException("cannot divide by zero");
		}
		else if(x==0) {
			return 0;
		}
		return (float)x/y;	
}
}
