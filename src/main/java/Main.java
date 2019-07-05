import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe a policzę podatek");
        double a = scan.nextDouble();
        System.out.printf("Podatek z kwoty 85529 to %.02f \n", Vat.vat(a));    }
}
