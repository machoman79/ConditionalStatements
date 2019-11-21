import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());// cantimetres
        String in = scanner.nextLine();
        String out = scanner.nextLine();

        if ("mm".equals(in)) {
            number /= 10;
        } else if ("m".equals(in)) {
            number *= 100;
        }

        if ("mm".equals(out)) {
            number *= 10;

        } else if ("m".equals(out)) {
            number /= 100;
        }
        System.out.printf("%.3f", number);
    }
}