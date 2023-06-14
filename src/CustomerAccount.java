public class CustomerAccount {

    int accountNumber;
    String firstName, lastName, address;


    public void printCustomer(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);
        System.out.println(accountNumber);
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerAccount{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
