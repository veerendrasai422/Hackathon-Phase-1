import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double waterConsumed;
        int bill;

        System.out.print("Enter water consumption in litres: ");
        waterConsumed = sc.nextDouble();

        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill = Rs." + bill);

        sc.close();
    }
}