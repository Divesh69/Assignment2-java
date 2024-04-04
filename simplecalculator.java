import java.util.Scanner;
public class simplecalculator {
    public static void main(String[]args){
        System.out.println("Simple Calculator");
        Scanner a=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter second number");
        int number2=b.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.println("Choose an operation to perform");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        int op=c.nextInt();
        int result;
        switch (op){
            case 1:result=number1+number2;
                System.out.println("The sum of the entered numbers is"+result);
                break;
            case 2:result=number1-number2;
                System.out.println("The difference of the entered numbers is "+result);
                break;
            case 3:result=number1*number2;
                System.out.println("The product of the entered number is "+result);
                break;
            case 4:result=number1/number2;
                System.out.println("The division of the entered numbers is"+result);
                break;
            case 5:result=number1%number2;
                System.out.println("The modulus of the entered number is"+result);
                break;
            default:System.out.println("Invalid choice");
        }
    }
}
