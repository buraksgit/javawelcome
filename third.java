import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Hello, World !");
         System.out.println("Please enter your name and age !");
         Scanner input = new Scanner(System.in);
         String name = input.nextLine();
         int age = input.nextInt();
         System.out.println("Hello,"+name);
         System.out.println("Your age is "+age);
    }
}
