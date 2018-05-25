import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1=new Account("Megha",1000);
        Account account2=new Account("Pavan",-7.50);

        System.out.printf("%s balance : %.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance : %.2f%n", account2.getName(),account2.getBalance());

        Scanner input=new Scanner(System.in);
        System.out.printf("Enter deposit amount for account1 :");
        double depositAmount=input.nextDouble();
        System.out.printf("%nAdding %.2f to account1 balance%n%n",depositAmount);

    }

}
