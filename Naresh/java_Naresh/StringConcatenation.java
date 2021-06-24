
public class StringConcatenation {
	
	public static void main(String[] args) {
		String beginning ="Hello";
		
		String end = " World";
		String combo = beginning + end;
		System.out.println(combo);
		
		long l = 203L;
		System.out.println("The value of l: " +l);
		
		boolean b = true;
		System.out.println(b + " is true");
		
		int x =2;
		int y=3;
		
		//order matter in String
		System.out.println("The sum of x and y is "+ x +y);// it will concatinate
		System.out.println("The sum of x and y is "+(x +y));//ti will add 
		System.out.println(x + y + " The sum of x and y is");//it will add
	}

}
