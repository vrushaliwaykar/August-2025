package Pac1;

public class Lab2_5_Person {
	// Main.java

	
	    String name;
	    float age;

	    Lab2_5_Person(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }
	}

	// Abstract Account class
	abstract class Account {
	    static long nextAccNum = 1000;
	    long accNum;
	    double balance;
	    Lab2_5_Person accHolder;

	    Account(double balance, Lab2_5_Person accHolder) {
	        this.accNum = nextAccNum++;
	        this.balance = balance;
	        this.accHolder = accHolder;
	    }

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " to " + accHolder.name);
	    }

	    abstract void withdraw(double amount); // Abstract method

	    double getBalance() {
	        return balance;
	    }

	    public String toString() {
	        return "AccNum: " + accNum + ", Balance: ₹" + balance + ", Holder: [" + accHolder + "]";
	    }
	}

	// Concrete BankAccount class
	class BankAccount extends Account {
	    final double MIN_BALANCE = 500;

	    BankAccount(double balance, Lab2_5_Person accHolder) {
	        super(balance, accHolder);
	    }

	    @Override
	    void withdraw(double amount) {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from " + accHolder.name);
	        } else {
	            System.out.println("Cannot withdraw ₹" + amount + " from " + accHolder.name + ". Minimum ₹500 must be left.");
	        }
	    }
	}

	


