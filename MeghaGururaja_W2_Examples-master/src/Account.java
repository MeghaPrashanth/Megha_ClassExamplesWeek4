public class Account {

    private String name;
    private double balance;

    //constructor with 2 parameters
    public void setName(String name)
    {
        this.name=name;

    }

    public  Account (String name,double balance)
    {
        this.name=name;

        //check initial balance is grater than $0.0
        if(balance>0.0)
        {
            this.balance=balance;
        }
    }

    //Method that deposits only a valid amount
    public void deposit(double depositAmount){
        if(depositAmount>0.0){
            balance= balance + depositAmount;
            //balance += depositAmount;
        }

    }
    public double getBalance() {
        return balance;
    }


    public String getName()
    {
        return name;
    }
}
