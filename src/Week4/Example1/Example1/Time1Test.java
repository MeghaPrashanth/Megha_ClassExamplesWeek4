package Week4.Example1.Example1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(); // Invokes the Time1 default constructor

        displayTime("After time object is created",time);
         System.out.println();



        time.setTime(13,27,6);
        displayTime("After calling  set time",time);
        System.out.println();

        //Exception handling
        try {
            time.setTime(99, 99, 99);
        }
        catch (Exception e)
        {
            System.out.printf("Exception %s%n%n", e.getMessage());
        }

        displayTime("After calling set Time with invalid values",time);

    }

    public static void displayTime(String beginningstring, Time1 t)
    {
        System.out.printf("%s Universal time : %s%n Standard Time : %s%n",beginningstring,t.toUniversalString());
    }
}
