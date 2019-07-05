import java.util.Scanner;

public class Vat {
    public static double vat(double a) {
        double pod;
        if (a < 85528) {
            pod = (a * 0.18) - 556.02;
        } else {
            pod = 15395.04 + ((a - 85528) * 0.32);
        }
        return pod;
    }
}
