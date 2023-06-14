import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PASApp {

    //customerAccountVariables
    int accountNumber =1000;


    Scanner input = new Scanner(System.in);

    List<CustomerAccount> accountsList = new ArrayList<>();




    public void displayMenu(){
        System.out.println("""
                         MENU OPTIONS
                     ENTER 1-8 TO SELECT
                1. Create a new Customer Account
                2. Get a policy quote and buy the policy.
                3. Cancel a specific policy (i.e change the expiration date of a policy to an earlier date than originally specified)
                4. File an accident claim against a policy. All claims must be maintained by system and should be searchable.
                5. Search for a Customer account
                6. Search for and display a specific policy
                7. Search for and display a specific claim
                8. Exit the PAS System
                """);
    }


    public void createAccount(){
        CustomerAccount acct = new CustomerAccount();
        System.out.println("CUSTOMER ACCOUNT DETAILS"); //the instructions assumed customers are unique

        System.out.println("Enter your First Name: ");
        acct.firstName = input.nextLine();

        System.out.println("Enter your Last Name: ");
        acct.lastName = input.nextLine();


        System.out.println("Enter you address: ");
        acct.address = input.nextLine();

        accountNumber++;
        acct.setAccountNumber(accountNumber);

        acct.printCustomer();
        accountsList.add(acct);
    }

    public void searchAccountNumber(int accountNumber){
        for (CustomerAccount accnt: accountsList) {
            System.out.println(accnt.accountNumber);
            System.out.println(accnt.firstName + " " + accnt.lastName );
        }
    }

    public boolean isAccountExisting(int accountNumber){
        for (CustomerAccount accnt: accountsList) {
           if (accountNumber == accnt.accountNumber){
               return true;
           }
        }
        return false;
    }



}
