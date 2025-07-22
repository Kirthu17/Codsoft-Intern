package codsoft;

import java.util.Scanner;
public class CurrencyConverter {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 String[] currencies = {"USD", "EUR", "INR"};
 double[][] rates = {
 {1.0, 0.85, 75.0}, 
 {1.18, 1.0, 88.0}, 
 {0.013, 0.011, 1.0} 
 };
 System.out.println("Available currencies: 0 - USD, 1 - EUR, 2 - INR");
 System.out.print("Choose base currency index: ");
 int base = scanner.nextInt();
 System.out.print("Choose target currency index: ");
 int target = scanner.nextInt();
 System.out.print("Enter amount to convert: ");
 double amount = scanner.nextDouble();
 double converted = amount * rates[base][target];
 System.out.printf("Converted Amount: %.2f %s\n", converted, currencies[target]);
 }
}
