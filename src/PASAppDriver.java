import java.util.Scanner;

public class PASAppDriver {

    public static void main(String[] args) {

        PASApp app = new PASApp();
        Scanner input = new Scanner(System.in);

        int option;

        do {
            app.displayMenu();


            switch (option = input.nextInt()) {

                case 1:
                    app.createAccount();
                    break;

                case 2://get a policy quote and buy the policy
                    System.out.println("Enter Account Number: ");
                    int acct = input.nextInt();
                    if(app.isAccountExisting(acct)){
                        app.searchAccountNumber(acct);
                        app.quotePolicy(acct);
                    } else {
                        System.out.println("Create account first!\n");
                    }


                case 3://Cancel a specific policy
                    System.out.println("Enter policy number for cancellation: ");


                case 4:// File an accident claim against a policy. All claims must be maintained by system and should be searchable.

                case 5://Search for a Customer account

                case 6://Search for and display a specific policy

                case 7://Search for and display a specific claim

                case 8://Exit the PAS System


            }

        }while(option != 8);



    }
}