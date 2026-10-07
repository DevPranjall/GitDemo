public class BankAccountDemo

{

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Pranjal", 1234567890L, 10000);

        account.displayAccountDetails();

        System.out.println("\n--- Transactions ---");

        account.deposit(5000);

        account.withdraw(2500);

        account.withdraw(20000);

        System.out.println("\nFinal Balance: ₹" + account.getBalance());
    }
}