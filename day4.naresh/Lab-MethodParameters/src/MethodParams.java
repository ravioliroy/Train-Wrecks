
public class MethodParams {
	public static void main(String[] args) {
		//create a class instance
		MethodParams mp=new MethodParams();
		//call your method
		double d = mp.convertIntoDouble(44);
		System.out.println(d);
		double total = mp.sum(6, 4, 10);
		System.out.println(total);
	}
	//create your first method
	public double convertIntoDouble(int num) {
		return (double)num;
	}
	public double sum(double num1, double num2, double num3) {
		return num1 +num2 + num3;
	}
}
