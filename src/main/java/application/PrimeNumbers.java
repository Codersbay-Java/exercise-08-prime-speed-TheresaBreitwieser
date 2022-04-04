package application;

import java.util.Random;

public class PrimeNumbers {
    int amountOfPrimeNumbers;

    /**
     * This method calculates the first x prime numbers.
     * Example: amountOfPrimeNumbers = 3
     * Return: [2, 3, 5]
     *
     * @param amountOfPrimeNumbers
     * @return an array containing only the calculated prime numbers
     */
    public int[] getPrimeNumbers(int amountOfPrimeNumbers)
    //loop through numbers and check if numbers are Prime, if yes then write in array.
    {
        int[] primesArray = new int[amountOfPrimeNumbers];
		int number=2;
		int helper=0;
		int i=0;

		do{
			if(isPrime(number)){
				primesArray[i++] = number;
				helper++;
			}
			number++;
		}
		while(helper != amountOfPrimeNumbers);

        return primesArray;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

}








