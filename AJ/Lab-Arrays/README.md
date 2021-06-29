# Lab: Using Arrays
## Arrays
## Background
In this exercise, you'll practice creating different arrays and using a few properties of arrays.

Arrays are an important construct in many modern languages because they serve as a backbone for higher level data structures. Arrays are also commonly used because they are fast and efficient at obtaining data because of the way the system stores them in memory.

Recall that an array can be thought of as a one-row grid. Each piece of data is referred to as an element and each element has a position referred to as an index. Array indexes start at 0 (zero).

To create an array, you'll specify the datatype followed by brackets ([]).

int[] intArray;
The above line will create an array of int datatype or an integer array.

To initialize an array, you'll need to know its length beforehand. For example, to create an array that has 5 elements you would use the following code:

int[] myArray = new int[5];
Notice that we've also used the new keyword. Anytime you create datatypes other than primitives, you'll use the new keyword.

## Instructions
## Project Setup
Open your IDE (Eclipse), and select File > New > Java Project. 
Provide the name, Lab-Arrays and click Finish.  a. If a window displays to create a module-info.java file then click Don't Create.
Right-click on the newly created project and select New > Class.
Provide the class the name, DisplayingArrays and click OK.
Now edit the file so that it looks like the following:
public class DisplayingArrays {

  public static void main(String[] args) {
    int[] intArray = new int[3];

    System.out.println(intArray);
  }
}
Run the program.

You'll notice something peculiar:



The output looks like some mix of characters unrelated to your array. This is the default way that a program will print an array. You'll see this often with non-primitive datatypes. The output is the address of the memory location of the array. 

To print the contents of the array, we can refer to individual elements.

Edit the class to assign values for two positions in the array and then to print the first value (which is index 0). 

public class DisplayingArrays {

  public static void main(String[] args) {
    int[] intArray = new int[3];
    intArray[0] = -5123;
    intArray[2] = 32;

    System.out.println(intArray[0]);
  }
}
Run the program.

You should see the following output:



Notice that the value of the first element is printed. Again, the first element has index 0.

Edit the file and to print the second element (the second element will have index 1):

public class DisplayingArrays {

  public static void main(String[] args) {
    int[] intArray = new int[3];
    intArray[0] = -5123;
    intArray[2] = 32;

    System.out.println(intArray[1]);
  }
}
Run the program.

You should see the following output:



Notice that the program prints the default value of an integer, 0, since we did not specify a value.

Edit the file again to try and print a value outside of the range specified for the array:

public class DisplayingArrays {

  public static void main(String[] args) {
    int[] intArray = new int[3];
    intArray[0] = -5123;
    intArray[2] = 32;

    System.out.println(intArray[3]);
  }
}
What do you think will happen?

Run the program.

You'll see the following output:



Notice that we didn't get any compiler errors. This type of error is referred to as a Runtime exception (because it occurs during the execution or run of the program). Neat, huh?

Reading through the message, you'll see that it is an ArrayIndexOutOfBoundsException and the index that was attempted is 3. This error simply means that you're accessing a position not defined by the array. The index 3 is not part of our array (which has indexes 0, 1, and 2).

As long as you access indexes supported by the array, then you won't get this particular exception…

## Array length property
What happens if you're writing a bit of code and you were passed or given an array? How would you know what indexes were available?

You can use the length property of the array to access its size. This property is automatically populated with the array's size on creation and exists whenever an array is created.

In this part of the exercise we'll create another class in the same project to demonstrate usage of the length property. Yes. You can place multiple classes under one project. Most applications have hundreds of files in one project. :)

Right-click on the newly created project and select New > Class.
Provide the class the name, ArrayLength and click OK.
Now edit the file so that it looks like the following:
public class ArrayLength {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
  }

}
Notice that we've used the shortcut way to create an array and initialize it with specific values. Instead of saying new int[10] we've used curly braces and separated each value with a comma.

This will create an array with 10 elements with the values 1 through 10.

Now print the length of the array to the console:

public class ArrayLength {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(arr.length);
  }

}
Run the program.
You will see the following output:

Congratulations! You're done.

# Lab: Multi-dimensional Arrays
## Background
In this exercise, you'll practice creating different multi-dimensional arrays and understand how they are organized.

A multi-dimensional array is an array that has an array as one or more of its elements.

To create a multi-dimensional array you'll specify the datatype followed by the number of brackets ([]) according to the number of dimensions that you need.

For example, the following will create a 2-dimensional array that holds integer values. 

int[][] array2d;

Note that a 2-dimensional array is one in which the first element is another int array. Instead of thinking of it as a one-row grid, you now have multiple rows. each row is indicated by the first index and the value in that row is indicated by a second index. Essentially multi-dimensional arrays are "arrays of arrays".

# Initializing Multi-dimensional Arrays
To initialize a multi-dimensional array, you'll need to review the same rules as a single dimension array as they are the same. Most importantly, you should know its length beforehand.

For example, to create a 2D array that is a 5x4 grid, then you would use the following code:

int[][] my2dArray = new int[5][4];

Notice that we've used the new keyword to actually create a new instance of the 2D array. Anytime you create datatypes other than primitives, you'll use the new keyword.

## Guided Practice
The following section will walk you through creating a small project to define multi-dimensional arrays. 

## Project Setup
Open your IDE (Eclipse), and select File > New > Java Project.

Provide the name, Lab-MultiArrays and click OK.

Right-click on the newly created project and select New > Class.

Provide the class the name, MultiDimensionalArrays and click OK.

Now edit the file so that it looks like the following:

public class MultiDimensionalArrays{  
  
 public static void main(String\[\] args) {  
   int\[\]\[\]\[\] my3dArray = new int\[3\]\[3\]\[3\];  
 }  
}
Now edit your code to assign a value to the first position in your array.

public class MultiDimensionalArrays{  
  
 public static void main(String[] args) {  
   int[][][] my3dArray = new int[3][3][3];  
  
   my3dArray[0][0][0] = 1;  
   System.out.println(my3dArray[0][0][0]);  
 }  
}
The newly added code will place the value '1' in the zero index of the array which points to the zero index of another array which points to the zero index of yet another array.

If you were to think of each position as a plot in a 3D graph, then the position (0,0,0) is at the origin.

Just like 1-dimensional arrays, multi-dimensional arrays only support positive index values. For example, the following is erroneous: my3darray[-1][0][-2];

Run the program.

You'll see output like the following:



This confirms that we've successfully assigned the value of 1 to the first position in our 3D array.

Let's take another approach to creating a multidimensional array. We'll use the shortcut syntax in which we declare the array and initialize it all in one step.

Edit your code to resemble the following:

public class MultiDimensionalArrays{  
  
 public static void main(String\[\] args) {  
   int[][][] my3dArray = new int[3][3][3];  
  
   my3dArray[0][0][0] = 1;  
   System.out.println(my3dArray[0][0][0]);  
  
   int[][] my2dArray =  {{1,2,0}, {4, 5, 6}, {1, 4, 5}};  
 }  
}
The new line of code uses curly braces to declare the values and groupings of values. In this case, we're creating a 2D array that has the size of 3x3. 

Let's see what happens when we call the length property on the array.

Edit your code to resemble the following:

public class MultiDimensionalArrays{  
  
 public static void main(String[] args) {  
   int[][][] my3dArray = new int[3][3][3];  
  
   my3dArray\[0\]\[0\]\[0\] = 1;  
   System.out.println(my3dArray\[0\]\[0\]\[0\]);  
  
   int[][] my2dArray =  {{1,2,0}, {4, 5, 6}, {1, 4, 5}};  
   System.out.println(my2dArray.length);  
 }  
}
Run the program.

You'll see output like the following:



Notice that the value of 3 is printed. This confirms that our first value of our array is an array with 3 elements (each element being an array of length 3).

Say that we wanted to print the value 6 that is stored in our current array.

At what index does our 2D array contain this value?

Looking at the code, you can verify that the value 6 is in the second array located at the third index of that array. Collectively, the index should be (1,2).

Edit your code to resemble the following:

public class MultiDimensionalArrays{  
  
 public static void main(String[] args) {  
   int[][][] my3dArray = new int[3][3][3];  
  
   my3dArray[0][0][0] = 1;  
   System.out.println(my3dArray[0][0][0]);  
  
   int[][] my2dArray =  {{1,2,0}, {4, 5, 6}, {1, 4, 5}};  
   System.out.println(my2dArray.length);  
  
   System.out.println(my2dArray[1][2]);  
 }  
}
Run the program.

You'll see output like the following:

We've correctly retrieved the value of 6!

In summary, multi-dimensional arrays behave just like 1-dimensional arrays. The main difference is that you'll specify an additional index for each added dimension. For example, to specify a value in a 4D array you'll need 4 indexes (eg. [1][2][2][3])

This concludes the lab.
