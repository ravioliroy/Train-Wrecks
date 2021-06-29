public class ExampleOne {
    public static void main(String[] args) {
        //create some dum
    int input = 5;

    ExampleOne eo = new ExampleOne();

    
        //call your methods here
        System.out.println(eo.factorial(input));
    }

    // create your first method here
    public int factorial(int num) {
        if (num <= 0) {
            return 0;
        }
        else if (num == 1) {
            return 1;
        }
    
        return num * factorial(num - 1);

    }
}
