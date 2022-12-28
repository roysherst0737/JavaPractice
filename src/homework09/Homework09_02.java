package homework09;

class BankAccount {
	private int balance = 0;
	
	synchronized public void deposit(int amt) {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amt;
		System.out.println("媽媽存了" + amt + "，帳戶共有：" + balance);
		notify();
	}
	
	synchronized public void withdraw(int amt) {
		while (balance < amt) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amt;
		System.out.println("熊大領了" + amt + "，帳戶共有：" + balance);
		if (balance < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}

class Mom extends Thread {
	BankAccount account;

	public Mom(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.deposit(2000);
	}
}

class Bear extends Thread {
	BankAccount account;

	public Bear(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.withdraw(1000);
	}
}

public class Homework09_02 {
	public static void main(String[] args) {
		BankAccount account =new BankAccount();
		Mom mom = new Mom(account);
		Bear bear = new Bear(account);
		mom.start();
		bear.start();		
	}
}
