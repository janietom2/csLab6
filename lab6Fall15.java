import java.util.Scanner;

public class lab6Fall15 {

	/********************************************************************
	 * ACTIVITY 1.1
	 * 1. What does the following method do?
	 * 2. Provide feedback about the coding style
	 * 3. Rewrite it in an appropriate manner
	 ********************************************************************/
public static int mystery(int[] a)
	{
		int w = 0;

		for (int i = 0; i < a.length; i++) { 
			if (a[i] >= z){
				z = a[i];
				w = i;
			}
		}

			return w;
}


/********************************************************************
 * ACTIVITY 1.2
 * 1. What does the following method do?
 * 2. Provide feedback about the coding style
 * 3. Rewrite it in an appropriate manner
 ********************************************************************/
public static void mystery2() {

	Scanner x = new Scanner(System.in);
	int y;
	System.out.println("Enter y");
	y = x.nextInt();
	String[] z = new String[y];
	int[] a = new int[y];

	for (int i=0; i<y; i++) {
		System.out.println("Enter string:");
		z[i] = x.next();
		System.out.println("Enter number:");
		a[i] = x.nextInt();
	}

	int b = 0;
	int c = a[0];
	for (int i=1; i<y; i++) {
		if (a[i] < c) {
				c = a[i];
				b = i;
			}
		}

System.out.println(c + " ; " + z[b] + ".");}


		/********************************************************************
		 * ACTIVITY 2.1
		 * Method called minmax
		 * 1. This method takes an array A of integers (of any size) as a parameter
		 * 2. and returns an array of integers of size 2 that contains:
		 * 		- the minimum value in A (as the first element of the returned array)
		 * 		- the maximum value in A (as the second element of the returned array)
		 ********************************************************************/
		public static int[] minmax(int[] A) {
			// your code goes here
		}

		/********************************************************************
		 * ACTIVITY 2.2
		 * Method called displayArray
		 * 1. This method takes an array A of integers (of any size) as a parameter
		 * 2. and displays this array
		 * 3. Write it (almost) from scratch (see below) in such a way that
		 * 		the calls made in the main method will work properly
		 ********************************************************************/
		public static //... and here goes the rest of your code ...


		/***********************************************************************************/
		/************* MAIN METHOD *********************************************************/
		/************* This is where you write the name ************************************/
		/************* of the code you want to execute  ************************************/
		public static void main(String[] args) {
			int[] A = {1,-3, 4, -19, 35};
			displayArray(A);
			displayArray(minmax(A));
		}
}
