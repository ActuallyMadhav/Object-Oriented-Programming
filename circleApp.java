import java.util.Scanner;
public class circleApp {
    public static void main(String[] args){
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle(0);

        while(isRunning){
            System.out.println("== Circle Computation =====");
            System.out.println("|1. Create a new circle   |");
            System.out.println("|2. Print Area            |");
            System.out.println("|3. Print Circumference   |");
            System.out.println("|4. Quit                  |");
            System.out.println("===========================");
            System.out.print("Choose Option (1-4): ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.println("Enter radius: ");
                    int rad = scanner.nextInt();
                    c.setRadius(rad);
                    System.out.println("A new circle is created.");
                }
                case 2 -> {
                    System.out.println("Area of circle");
                    System.out.println("Radius: " + c.getRadius());
                    System.out.println("Area: " + c.area());
                }
                case 3 -> {
                    System.out.println("Circumference of circle");
                    System.out.println("Radius: " + c.getRadius());
                    System.out.println("Circumference: " + c.circumference());
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Try again!");
            }
        }

        System.out.println("Thank you!!");
        scanner.close();
    }
}
