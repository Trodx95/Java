
public class BankAccount {
	
	public static int numAccounts = 0;
	public static double totalHoldings = 0;
	private static String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}

	
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;

	public BankAccount() {
		BankAccount.numAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.generateId();
	}

	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}

	public void depositMoney(double amount, String account) {
		if(account.equals("savings"))
			this.savingsBalance += amount;
		else if(account.equals("checking"))
			this.checkingBalance += amount;
		BankAccount.totalHoldings += amount;
	}

	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings")) {
			
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalHoldings -= amount;
		}
	}

	public void displayAccountBalance() {
		
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}

	public static void main(String[] args) {
		
        BankAccount b = new BankAccount();
		
        b.depositMoney(100.49, "checking");
		b.depositMoney(3.00, "savings");
		b.displayAccountBalance();
		System.out.println(BankAccount.totalHoldings);


		b.withdrawMoney(50, "checking");
		b.withdrawMoney(50, "savings");
		b.displayAccountBalance();
		System.out.println(BankAccount.totalHoldings);

	}
}