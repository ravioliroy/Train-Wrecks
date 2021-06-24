
public class MathematicalOperators {

	public static void main(String[] args) {
		//define variables
		int x=5;
		int y =3;
		int z;
		
		//simple addition 
		z =x+y;
		System.out.println("5+3 " + z);
		//simple subtraction
		z=x-y;
		System.out.println("5-3 " + z);
		//simple Multiplication
		z=x*y;
		System.out.println("5*3 " + z);
		//simple Division
		z =x/y;
		System.out.println("5/3 " +z);
		//simple Modulus
		z=x%y;
		System.out.println("5%3 " +z);
		//float vs int.
		float f=3.6f;
		int i = 22;
		int result=(int)f+i;
		System.out.println("float to int "+ result);
	}
}
