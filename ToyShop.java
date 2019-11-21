import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddies = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double toysTotalSum = puzzle * 2.60 + dolls * 3 + teddies * 4.10 + minions * 8.20 + trucks * 2;
        int totalToys = puzzle + dolls + teddies + minions + trucks;

        if (totalToys >= 50) {
            toysTotalSum = toysTotalSum * 0.75;
        }
        toysTotalSum = toysTotalSum * 0.90;

        if (toysTotalSum >= excursion) {

            System.out.printf("Yes! %.2f lv left.", toysTotalSum - excursion);
        } else {

            System.out.printf("Not enough money! %.2f lv needed.", excursion - toysTotalSum);
        }
    }
}
