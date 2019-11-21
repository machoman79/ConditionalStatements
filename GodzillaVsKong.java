import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double uniformPrice = Double.parseDouble(scanner.nextLine());

        double uniformSum = people * uniformPrice;
        double decor = budget * 0.1;

        if (people > 150) {
            uniformSum *= 0.9;
        }
        double totalExpenses = decor + uniformSum;
        double difference = Math.abs(totalExpenses - budget);

        if (totalExpenses <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}
