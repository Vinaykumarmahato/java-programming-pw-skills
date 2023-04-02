package project;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class project_6_BankingTTransaction_System {

	public static void main(String[] args) {
		
		
		   Scanner scanner = new Scanner(System.in);
	        double balance = 0;
	        String dataFileName = "banking_data.txt";

	        // Create file if it does not exist
	        File dataFile = new File(dataFileName);
	        if (!dataFile.exists()) {
	            try {
	                dataFile.createNewFile();
	            } catch (IOException e) {
	                System.out.println("Error creating data file");
	            }
	        }

	        // Read balance from file if it exists
	        try {
	            Scanner dataScanner = new Scanner(dataFile);
	            if (dataScanner.hasNextDouble()) {
	                balance = dataScanner.nextDouble();
	            }
	            dataScanner.close();
	        } catch (IOException e) {
	            System.out.println("Error reading data file");
	        }

	        while (true) {
	            try {
	                System.out.println("\nBanking Transaction System");
	                System.out.println("--------------------------");
	                System.out.println("1. Deposit");
	                System.out.println("2. Withdraw");
	                System.out.println("3. Check Balance");
	                System.out.println("4. Exit");
	                System.out.print("Enter your choice: ");
	                int choice = scanner.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter amount to deposit: ");
	                        double depositAmount = scanner.nextDouble();
	                        if (depositAmount < 0) {
	                            throw new IllegalArgumentException("Deposit amount cannot be negative");
	                        }
	                        balance += depositAmount;
	                        System.out.println("Deposit of " + depositAmount + " successful");
	                        break;

	                    case 2:
	                        System.out.print("Enter amount to withdraw: ");
	                        double withdrawAmount = scanner.nextDouble();
	                        if (withdrawAmount < 0) {
	                            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
	                        }
	                        if (withdrawAmount > balance) {
	                            throw new IllegalArgumentException("Insufficient balance");
	                        }
	                        balance -= withdrawAmount;
	                        System.out.println("Withdrawal of " + withdrawAmount + " successful");
	                        break;

	                    case 3:
	                        System.out.println("Balance: " + balance);
	                        break;

	                    case 4:
	                        System.out.println("Exiting program...");
	                        // Write balance to file
	                        try {
	                            FileWriter dataWriter = new FileWriter(dataFile);
	                            dataWriter.write(Double.toString(balance));
	                            dataWriter.close();
	                        } catch (IOException e) {
	                            System.out.println("Error writing data file");
	                        }
	                        System.exit(0);

	                    default:
	                        System.out.println("Invalid choice, please try again");
	                        break;
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            } catch (Exception e) {
	                System.out.println("An error occurred, please try again");
	                scanner.nextLine();
	            }
	        }
		
      }
}


