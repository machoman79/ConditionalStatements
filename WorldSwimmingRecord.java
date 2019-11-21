import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double totalDistance = distanceMetres * timeSeconds;
        double delay = Math.floor(distanceMetres / 15);
        delay *= 12.50;
        double totalTimeSwam = delay + totalDistance;

        if (totalTimeSwam < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeSwam);
        } else if (totalTimeSwam >= recordSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimeSwam - recordSeconds);
        }
    }
}
