package Week3.Week3_Examples;
import java.util.Scanner;
public class MaximumFinder {

    public static void main (String args)
    {
        Scanner input = new Scanner(System.in);

//Prompt user to enter values

        System.out.print("enter three floating-point values seperated by spaces : ");

//Read values from user

        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();

        double result = maximum(number1,number2,number3);
        System.out.println("Maximum is:" + result);
    }

    public static  double maximum(double x,double y,double z)
    {
        double maximumValue = x;
        if(y>x)
            maximumValue=y;

        if(z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }

}
