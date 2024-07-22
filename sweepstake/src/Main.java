import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int choose = 1;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (choose == 1 || choose == 2) {

            // test

            System.out.println();
            System.out.println("Do you want to drawn a number or a people?");
            System.out.println();
            System.out.println("[1] - Number");
            System.out.println("[2] - People");
            System.out.println("[3] - Exit");

            System.out.println();

            System.out.print("You answer: ");
            choose = scanner.nextInt();
            scanner.nextLine();

            if(choose == 3) {
                scanner.close();

                System.out.println();
                System.out.println("Thanks for enjoying!");
            }

            if (choose == 1) {

                System.out.println();

                System.out.print("How many numbers you want to draw: ");
                int numbers = scanner.nextInt();
                scanner.nextLine();

                int randomNumber = random.nextInt(numbers);

                System.out.println();
                System.out.println("!=!=!=!=!=!=!=!=!=");
                System.out.println("Result: " + randomNumber);
                System.out.println("!=!=!=!=!=!=!=!=!=");
                System.out.println();

            }

            if (choose == 2) {

                System.out.println();
                System.out.print("How many peoples you want do draw: ");
                int peopleCount = scanner.nextInt();
                scanner.nextLine();

                String[] names = new String[peopleCount]; // Cria uma lista names

                for (int i = 0; i < peopleCount; i++) {

                    System.out.println();
                    System.out.println("Name of people " + (i + 1) +  ": ");
                    String name = scanner.nextLine();
                    names[i] = name;

                }

                int randomWinner = random.nextInt(names.length);

                System.out.println();
                System.out.println("!=!=!=!=!=!=!=!=!=");
                System.out.println("The winner is: " + names[randomWinner]);
                System.out.println("!=!=!=!=!=!=!=!=!=");
                System.out.println();

            }

        }
    }


}