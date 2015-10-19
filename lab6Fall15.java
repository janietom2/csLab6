import java.util.Scanner;

public class lab6Fall15 {

public static void sop(Object typeHere){
	System.out.println(typeHere);
}
	/********************************************************************
	 * ACTIVITY 1.1
	 * 1. What does the following method do?
	 * 2. Provide feedback about the coding style
	 * 3. Rewrite it in an appropriate manner
	 ********************************************************************/
public static int mystery(int[] numbersArray){

		int indexSelector = 0;
		int counterPrime = 1;

		for (int indexCounter = 0; indexCounter < numbersArray.length; indexCounter++) {
			if (numbersArray[indexCounter] > numbersArray[counterPrime]){
				counterPrime = indexCounter;
				indexSelector = counterPrime;
			}
		}
			return indexSelector;
}


/********************************************************************
 * ACTIVITY 1.2
 * 1. What does the following method do?
 * 2. Provide feedback about the coding style
 * 3. Rewrite it in an appropriate manner
 ********************************************************************/
public static void mystery2() {

	Scanner scan = new Scanner(System.in);

	int arraySize;
	System.out.println("Enter Array Size");
	arraySize = scan.nextInt();

	String[] stringArray = new String[arraySize];
	int[] integerArray = new int[arraySize];

	for (int counter = 0; counter < arraySize; counter++) {
		System.out.println("Enter string:");
		stringArray[counter] = scan.next();
		System.out.println("Enter number:");
		integerArray[counter] = scan.nextInt();
	}

	int counterPrime = 1;

	for (int indexCounter = 0; indexCounter < arraySize; indexCounter++ ){
		if (integerArray[indexCounter] < integerArray[counterPrime]) {
			counterPrime = indexCounter;
		}
	}

sop("=====");
sop(integerArray[counterPrime]+ " ==> " + stringArray[counterPrime]);

}


		/********************************************************************
		 * ACTIVITY 2.1
		 * Method called minmax
		 * 1. This method takes an array A of integers (of any size) as a parameter
		 * 2. and returns an array of integers of size 2 that contains:
		 * 		- the minimum value in A (as the first element of the returned array)
		 * 		- the maximum value in A (as the second element of the returned array)
		 ********************************************************************/
		public static int[] minmax(int[] A) {
			//Max
			int indexSelectorMax = 0;
			int counterPrimeMax = 1;
			int indexCounterMax;

			for (indexCounterMax = 0; indexCounterMax < A.length; indexCounterMax++ ) {
					if (A[indexCounterMax] > A[counterPrimeMax]){
						counterPrimeMax = indexCounterMax;
						indexSelectorMax = counterPrimeMax;
					}
			}
			int maxNumber = indexSelectorMax;

			// Min
			int indexCounterMin;
			int counterPrimeMin = 1;

			for (indexCounterMin = 0; indexCounterMin < A.length; indexCounterMin++ ) {
					if (A[indexCounterMin] < A[counterPrimeMin]) {
						counterPrimeMin = indexCounterMin;
					}
			}
			int minNumber = counterPrimeMin;

			// New array
			//int[] mechanicalArray = new int[2];
   		int[] mechanicalArray = {A[minNumber], A[maxNumber]};

			return mechanicalArray;

		}

		/********************************************************************
		 * ACTIVITY 2.2
		 * Method called displayArray
		 * 1. This method takes an array A of integers (of any size) as a parameter
		 * 2. and displays this array
		 * 3. Write it (almost) from scratch (see below) in such a way that
		 * 		the calls made in the main method will work properly
		 ********************************************************************/
		public static void displayArray(int A[]){
			int arrayPrintCounter;

			for (arrayPrintCounter = 0; arrayPrintCounter < A.length; arrayPrintCounter++) {
					sop(A[arrayPrintCounter]);
			}

		} //... and here goes the rest of your code ...


		/***********************************************************************************/
		/************* MAIN METHOD *********************************************************/
		/************* This is where you write the name ************************************/
		/************* of the code you want to execute  ************************************/
		public static void main(String[] args) {
			int[] A = {1, -3, 4, -19, 35};
			sop("=== DISPLAY ARRAY ===");
			displayArray(A);
			sop("=== MIN || MAX ===");
			displayArray(minmax(A));

			// mystery2();
			// sop(mystery(A) + " is Max index in the array");

		}
}
