package Week3.Week3_Examples.Example2;

import java.security.SecureRandom;
public class RandomInteger {

    public static void main(String[] args) {

        //Create random number object

        SecureRandom randomNumbers = new SecureRandom();

        //3 for loop parameters are:
        //1. Local variable counter
        //2. Check to exit for loop
        //3. Increment to counter

        //Generate values for a standard D6 dice
        for(int counter = 1; counter <= 20 ; counter++)
        {
            int face =  randomNumbers.nextInt(6);

        }
    }
}
