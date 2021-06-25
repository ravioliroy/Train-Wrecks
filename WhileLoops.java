import java.util.Arrays;
public class WhileLoops {
	public static void main(String[] args) {	
		int[] Arr = new int[5];
		
	int counter =1;
	int index =0;
	while(index < Arr.length) {
		Arr[index]= counter;
		counter++;
		index++;
	}
	System.out.println(Arrays.toString(Arr));
	index =0;
	do {
		// get the element in our array 
		int currentElement = Arr[index];
		
		//check odd number
		if(currentElement%2 !=0) {
	        Arr[index] = currentElement + 5;
		}
		
		System.out.println(Arr[index]);
		index++;
	}while(index <Arr.length);

	for(int i = 0; i<Arr.length; i++) {
		int currentElement = Arr[i];
		if(currentElement%4==0 && currentElement %6 ==0)
			System.out.println("four!!six!!!");
		else if(currentElement %4 ==0)
			System.out.println("four!!");
		else if(currentElement %6 ==0)
			System.out.println("six!!");
		else
			System.out.println(currentElement);
	}
	}
}