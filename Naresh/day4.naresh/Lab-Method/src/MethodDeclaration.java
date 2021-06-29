
public class MethodDeclaration {
public static void main(String[] args) {
	// create a class instance
	MethodDeclaration md = new MethodDeclaration();
	md.talk();
	MethodDeclaration total = new MethodDeclaration();
	int cash = total.amount(5);
	System.out.println(cash);
	//call your first method here
}
//create your first method here.
public void talk() {
	System.out.println("inside of the talk method");
	
}
public int amount(int input){
	return input*2;
}
}
