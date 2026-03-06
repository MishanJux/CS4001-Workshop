import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        // fare rules used in this program:
        // base fare = Rs. 30
        // per km    = Rs. 15
        // per min   = Rs. 2
        // local discount = 10% when distance > 5km
        // night surcharge = 20%

        Scanner sc = new Scanner(System.in);

        System.out.println("Biratnagar Rickshaw Fare System");
        System.out.println("--------------------------------");

        System.out.print("Distance (km)   : ");
        double km = sc.nextDouble();

        System.out.print("Time (minutes)  : ");
        int mins = sc.nextInt();

        System.out.print("Local customer? (1=yes 0=no) : ");
        int localAns = sc.nextInt();

        System.out.print("Night travel?   (1=yes 0=no) : ");
        int nightAns = sc.nextInt();

        // ternary operator used here as required by the question
        boolean isLocal = (localAns == 1) ? true : false;
        boolean isNight = (nightAns == 1) ? true : false;

        double fare = 30 + (km * 15) + (mins * 2);

        // apply 10% local discount only when distance is over 5km
        double disc = (isLocal && km > 5) ? fare * 0.10 : 0;

        // night surcharge of 20%
        double extra = isNight ? fare * 0.20 : 0;

        fare = fare - disc + extra;

        System.out.println("\n--- Fare Summary ---");
        System.out.println("Discount applied : Rs. " + disc);
        System.out.println("Night surcharge  : Rs. " + extra);
        System.out.println("Total Fare       : Rs. " + fare);

        sc.close();
    }
}
