import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("quit")) {
      input = scanner.nextLine();
      String[] inputsSplit = input.split(" ");
      switch(inputsSplit[0]) {
        case "add":
          System.out.println(Calculator.add(Integer.parseInt(inputsSplit[1]), Integer.parseInt(inputsSplit[2])));
          break;
        case "subtract":
          System.out.println(Calculator.subtract(Integer.parseInt(inputsSplit[1]), Integer.parseInt(inputsSplit[2])));
          break;
        case "multiply":
          System.out.println(Calculator.multiply(Integer.parseInt(inputsSplit[1]), Integer.parseInt(inputsSplit[2])));
          break;
        case "divide":
          System.out.println(Calculator.divide(Integer.parseInt(inputsSplit[1]), Integer.parseInt(inputsSplit[2])));
          break;
        case "fibonacci":
          System.out.println(Calculator.fibonacciNumberFinder(Integer.parseInt(inputsSplit[1])));
          break;
        case "binary":
          System.out.println(Calculator.intToBinaryNumber(Integer.parseInt(inputsSplit[1])));
          break;
      }
    }
    scanner.close();
  }
}
