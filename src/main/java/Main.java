import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter();


        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int firstNumber;
        int secondNumber;
        do {
            System.out.println("Counter program. Please choose an action: ");
            System.out.println("1. Count up");
            System.out.println("2. Count down");
            System.out.println("\n Enter Quit to end program ... ");
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput){
                case "Quit":
                    System.out.println("Exiting application....");
                    break;
                case "1":
                    System.out.println("\n Please enter first number ");
                    firstNumber = scanner.nextInt();
                    System.out.println("\n Please enter second number ");
                    secondNumber = scanner.nextInt();
                    counter.countTo(firstNumber,secondNumber);
                    break;
                case "2":
                    System.out.println("\n Please enter first number ");
                    firstNumber = scanner.nextInt();
                    System.out.println("\n Please enter second number ");
                    secondNumber = scanner.nextInt();
                    counter.countDown(firstNumber,secondNumber);
                    break;
                default:
                    break;

            }


        }
        while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }


}

