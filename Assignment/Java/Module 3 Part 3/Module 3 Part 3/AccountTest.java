//Write  a AccountTest  and Account classes. Two Constructors of Account  class  accepts integer  accountNumber 1 parameter) and
// integer account number  and string customerName parameters.  Call those constructors from AccountTest class and display the values.
//Note: create display() to display values.

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(324);
        acc.display();
        Account acc1 = new Account(324, "Vishal");
        acc1.display1();
    }
}
    class Account {
        int accountNumber;
        String customerName;

        public Account(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Account(int accountNumber, String customerName) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
        }

        void display() {
            System.out.println("Account Number: " + accountNumber);
        }
        void display1() {
            System.out.println("Account Number: " + accountNumber + "\n Customer Name: " + customerName);
        }
    }
