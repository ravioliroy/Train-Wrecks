
public class LinearSearch {
	
	public static void main(String[] args) {
		// create some dummy data for our method
//		char letter ='d';
//		char[]letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 
//						'h', 'i', 'j', 'k', 'l', 'm', 'n', 
//						'o', 'p', 'q', 'r','s', 't', 'u', 'v', 
//						'w', 'x', 'y', 'z' };
	char letter = '0';
	char[] letters = null;
		// calling method
		LinearSearch ln = new LinearSearch();
		System.out.println(ln.findIndex(letter, letters));
}
	// creating method
	public int findIndex(char target, char[] data) {
		int result =-1;
		if(data == null)
			return -1;
		
		for (int i = 0; i <data.length; i++) {
			char temp = data[i];
			
			
			if(temp == target) {
				return i;
			}
		}
		
		return result;
	}
}
