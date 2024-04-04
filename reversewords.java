import java.util.Scanner;

public class reversewords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for(int i = words.length - 1; i>= 0; i--){
            reversedString.append(words[i]).append(" ");
        }
        System.out.println("Reversed string: " + reversedString.toString().trim());
        scanner.close();
    }
}
