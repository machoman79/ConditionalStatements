import java.util.Scanner;

public class NumbersToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String digit;

        if (num == 1)
            digit = "one";
        else if (num == 2)
            digit = "two";
        else if (num == 3)
            digit = "three";
        else if (num == 4)
            digit = "four";
        else if (num == 5)
            digit = "five";
        else if (num == 6)
            digit = "six";
        else if (num == 7)
            digit = "seven";
        else if (num == 8)
            digit = "eight";
        else if (num == 9)
            digit = "nine";
        else
            digit = "number too big";
        System.out.println(digit);
    }

}

