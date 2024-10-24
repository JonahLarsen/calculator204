import java.util.Random;

class Calculator {

    Calculator(){

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b){
        return a - b;
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    static int fibonacciNumberFinder(int n) {
        int previous = 0;
        int current = 1;
        for (int i = 1; i < n; i++) {
            int temp = current;
            current = previous + current;
            previous = temp;
        }
        return current;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    static String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return n + sb.toString() ;
    }


}

//Adding a comment
