import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        System.out.println("How old are you !");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You are a minor !");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult !");
        } else if (age >= 60) {
            System.out.println("You are a senior citizen !");
            
        }else if (age < 0) {
            System.out.println("Invalid input !");
            
        } else {
            System.out.println("Invalid input !");
            
        }
    }
}
