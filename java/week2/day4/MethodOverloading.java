package week2.day4;

public class MethodOverloading {
	/*When 2 or more methods in the same class have same signature except
	the input arguments*/
	
	/*Static polymorphism works within the same class and with same method name
	 *having different argument counts/different type of arguments 
	 *
	 */
	
	public void add() {
		int a=2;
		int b=4;
		System.out.println(a+b);
	}
	
	//change the type of argument
	public void add(float a, float b) {
		
	}
	//change the no of arguments
	public void add(int x, int y, int z) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
