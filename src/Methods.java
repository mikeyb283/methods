import java.util.Scanner;
public class Methods {
  public static void main(String[] args) {

    char  quit = 'y';
    String input;
    int userChoice = 0;

    Scanner scanner = new Scanner(System.in);

    while (quit != 'n') {

      System.out.println("AREA CALCUALTOR");
      System.out.println("Choose a shape to calculate the area:");
      System.out.println("**");
      System.out.println("1) Square");
      System.out.println("2) Rectangle");
      System.out.println("3) Parallelogram");
      System.out.println("4) Triangle");
      System.out.println("**");
      if (scanner.hasNextInt())
        userChoice = scanner.nextInt();

      switch (userChoice) {
        case 1:
          squareCalc(scanner);
          break;
        case 2:
          rectCalc(scanner);
          break;
        case 3:
          parallelCalc(scanner);
          break;
        case 4:
          triangleCalc(scanner);
          break;
        default:
          System.out.println("Invalid choice. ");
          break;
      }
      System.out.println("\nWould you like to use the calculator again? Yy/Nn");
      input = scanner.next().toLowerCase();
      quit = input.charAt(0);
    }
  }
  private static double ask(Scanner scanner, String prompt) {
    System.out.print(prompt);
    return scanner.nextDouble();
  }

  private static void squareCalc(Scanner scanner) {
    double length = ask(scanner, "Enter length in inches: ");
    double area = (length * length);
    System.out.println("The area of the square is " + area + " square inches.");

  }
  private static void rectCalc(Scanner scanner) {
    double length = ask(scanner, "Enter length in inches: ");
    double width = ask(scanner, "Enter width in inches: ");
    double area = (length * width);
    System.out.println("The area of the rectangle is " + area + " square inches.");
  }
//
  private static void parallelCalc(Scanner scanner) {
    double base = ask(scanner, "Enter the base length in inches: ");
    double height = ask(scanner, "Enter the height in inches: ");
    double area = (base * height);
    System.out.println("The area is of the parallelogram is " + area + " square inches.");
  }

  private static void triangleCalc(Scanner scanner) {
    double base = ask(scanner, "Enter the base length in inches: ");
    double height = ask(scanner, "Enter the height in inches: ");
    double area = (0.5 * base * height);
    System.out.println("The area of the triangle is " + area + " square inches." );
  }
}