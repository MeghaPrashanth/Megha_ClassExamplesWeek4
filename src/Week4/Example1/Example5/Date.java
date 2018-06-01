package Week4.Example1.Example5;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public  Date(int month,int day,int year)
    {
        if(month <= 0 || month >12){

        }
    }

    public  String toString()
    {
        return  String.format("%d /%d/ %d",month,day,year);
    }
}
