import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teh principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest(in percentage):");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period (in yeaars):");
        double time = scanner.nextDouble();
        double simpleInterest =(principal * rate * time)/100;
        System.out.println("Simple Interest: " + simpleInterest);
        scanner.close();
    }
}
