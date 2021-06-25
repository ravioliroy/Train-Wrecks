
public class ReturnTypes {
public static void main(String[] args) {
	//create a class instance
	ReturnTypes rt = new ReturnTypes();
	//call your method here
	rt.returnNothing();
	boolean b = rt.returnBoolean();
	System.out.println("value b is: "+ b);
}
//create your first method here
public void returnNothing() {
	System.out.println("Inside of a void method);");
	}
public boolean returnBoolean() {
	return true;
}
}
