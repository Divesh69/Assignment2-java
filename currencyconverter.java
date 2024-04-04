import java.util.Scanner;
public class currencyconverter {
    public static void main(String[]args){
        System.out.println("Nepali Currency Converter");
        Scanner NRS=  new Scanner(System.in);
        System.out.println("Enter Nepalese Rupees");
        double nepali=NRS.nextDouble();
        Scanner convert=new Scanner(System.in);
        System.out.println("Choose your desired currency to convert your Nepalese Rupees");
        System.out.println("1.United States Dollar");
        System.out.println("2.United Arab Emirates Dirham");
        System.out.println("3.Japanese Yen");
        System.out.println("4.Chinese Yuan");
        System.out.println("5.Indian Rupee");
        System.out.println("6.Russian Ruble");
        System.out.println("7.Brazilian Real");
        int choice=convert.nextInt();
        double currency;
        switch (choice){
            case 1:currency=91.7565*nepali;
                System.out.println("United States Dollar="+currency);
                break;
            case 2: currency=24.9321*nepali;
                System.out.println("United Arab Emirates Dirham= "+currency);
                break;
            case 3:currency=0.606*nepali;
                System.out.println("Japanese Yen="+currency);
                break;
            case 4:currency=12.6928*nepali;
                System.out.println("Chinese Yuan="+currency);
                break;
            case 5: currency=1.1011*nepali;
                System.out.println("Indian Rupee="+currency);
                break;
            case 6: currency=18.2328*nepali;
                System.out.println("Russian Ruble="+currency);
                break;
            case 7:currency=26.50*nepali;
                System.out.println("Brazilian Real="+currency);
                break;
            default:System.out.println("Invalid choice");
        }
    }
}
