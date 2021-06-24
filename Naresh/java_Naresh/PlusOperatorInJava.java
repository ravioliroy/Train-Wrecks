
public class PlusOperatorInJava {

		public static void main(String[] agrs) {
			
			int result=8+9;
			System.out.println(result);
			
			String textValue ="Hello" +" " + "Naresh";//Strings are not primitive data type
			System.out.println(textValue);
			
			String numberText = ""+6+8; // converting to the String first 
			String numberText1 = ""+(6+8);
			System.out.println(9+10+" ");// converting to the String later
			System.out.println(numberText);
			System.out.println(numberText1);
			//System.out.println(numberText1 instanceof String);
		}
}
