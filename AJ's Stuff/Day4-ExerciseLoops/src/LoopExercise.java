import java.util.Arrays;

public class LoopExercise {
    public static void main(String[] args) {
        int x = 1;
        int index = 0;
        int[] newArray = new int[50];
        while (index < newArray.length) {
            newArray[index] = x;
            x++;
            index++;
        }
        System.out.println(Arrays.toString(newArray));

        index = 0;
        do {
            int current = newArray[index];
            if (current % 2 != 0) {
                newArray[index] = current + 5;
            }
            index++;
        } while (index < newArray.length);

        System.out.println(Arrays.toString(newArray));

        for (index = 0; index < newArray.length; index++) {
            int current = newArray[index];
            if (current % 4 == 0 && current % 6 == 0) {
                System.out.println("FOUR!!SIX!!!");
            } else if (current % 6 == 0) {
                System.out.println("SIX!!!");
            } else if (current % 4 == 0) {
                System.out.println("FOUR!!");
            } else {
                System.out.println(current);
            }
        }
    }
}
