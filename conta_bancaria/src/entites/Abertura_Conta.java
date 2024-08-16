package entites;
public class Abertura_Conta {
	
	private int number;
	private String name;
	private double balance;
	
	public Abertura_Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Abertura_Conta(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private double getBalance() {
		return balance;
	}

	private int getNumber() {
		return number;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void whitdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: "
				+ number
				+", Name: "
				+name
				+", Balance: $"
				+String.format("%.2f", balance);
	}
}
