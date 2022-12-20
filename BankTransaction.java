public class BankTransaction {
    int amount, balance = 30000;

    synchronized void withdraw(int amt) {
        System.out.println("withdraw the amount...");

        if (this.amount < amt) {
            System.out.println("Less account balance; waiting for the deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }

        balance = balance - amt;
        System.out.println("withdraw amount is " + amt);
        System.out.println("total balance completed..." + balance);
    }

    synchronized void deposit(int amt) {
        balance = balance - amount;
        System.out.println("going to deposit..." + amt);


        System.out.println("deposit completed... " + amt);
        if (this.amount > balance) {
            deposit(1000);
        } else {

            notify();
        }

    }
}

