
public class UsingIfStatement {
	public static void main(String[] args) {
		int x = 6;// as soon as we reach a true condition that's the only code run. 
		/*if(condition has to be boolean)
		 * stuff you want to happen when true
		 * else 
		 * stuff is not true
		 * 
		 */
		if(x%2==0) {
			System.out.println("A: even");
		}
		else if(x%3==0) {
			System.out.println("B:divisible by 3");
		}
			else {
				System.out.println("C:odd");
			}
		System.out.println("D");
		
		boolean flag = true;
		if(flag) {
			System.out.println("yay -true");
			
			flag =false; //bad!!!!
					if(flag=true) {
						System.out.println("uh oh");
					}
					else
						System.out.println("oh no");
					
					if(!flag) {
						System.out.println("print when flag is flase");
					}
		}
		}
	}
