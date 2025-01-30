import java.util.Scanner;

public class Input{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Enter your name ");
        name = scanner.nextLine();

        int age;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        float weight;
        System.out.println("Enter your weight: ");
        weight = scanner.nextFloat();

        boolean isSmoker;
        System.out.println("Are you a smoker? Enter either true or false.");
        isSmoker = scanner.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Is a smoker: " + isSmoker);

    }
}

