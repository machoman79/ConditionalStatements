import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        String word = "";

        if (speed <= 10) {
            word = "slow";
        } else if (speed <= 50) {
            word = "average";
        } else if (speed <= 150) {
            word = "fast";
        } else if (speed <= 1000) {
            word = "ultra fast";
        } else {
            word = "extremely fast";
        }
        System.out.println(word);
    }
}
