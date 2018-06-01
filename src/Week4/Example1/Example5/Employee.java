package Week4.Example1.Example5;

public class Employee{

    private String firstName;
    private  String lastName;
    private Date birthDate;
    private  Date hireDate;

    public Employee(String fName, String lName, Date bDate, Date hDate)
    {
        firstName=fName;
        lastName=lName;
        birthDate=bDate;
        hireDate=hDate;

    }

    public  String toString()
    {
        return  String.format("%s%n %s%n %d%n %d%n",firstName,lastName,birthDate,hireDate);
    }

}
