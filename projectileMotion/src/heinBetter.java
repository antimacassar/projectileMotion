import java.util.*;

public class heinBetter {

    static double Range(){
        double initialVelocity, angleDeg, angleRad;
        System.out.println("Enter initial velocity and angle in degrees respectively");
        Scanner smithereens = new Scanner(System.in);
        initialVelocity = smithereens.nextDouble();
        angleDeg = smithereens.nextDouble();
        angleRad = Math.toRadians(angleDeg);
        double range = ((initialVelocity*initialVelocity)*2*angleDeg)/9.8;
        System.out.println(range);

        return 0;
    }
    static double heightMax(){
        double initialVelocity, angleDeg, angleRad;
        System.out.println("Enter initial velocity and angle in degrees respectively");
        Scanner smithereens = new Scanner(System.in);
        initialVelocity = smithereens.nextDouble();
        angleDeg = smithereens.nextDouble();
        angleRad = Math.toRadians(angleDeg);
        double hMax = ((initialVelocity*initialVelocity)*(angleRad*angleRad)/19.6);
        System.out.println(hMax);

        return 0;
    }
    static double timeFlight(){
        double initialVelocity, angleDeg, angleRad;
        System.out.println("Enter initial velocity and angle in degrees respectively");
        Scanner smithereens = new Scanner(System.in);
        initialVelocity = smithereens.nextDouble();
        angleDeg = smithereens.nextDouble();
        angleRad = Math.toRadians(angleDeg);
        double timeOfFlight = (2*initialVelocity*angleRad)/9.8;
        System.out.println(timeOfFlight);

        return 0;
    }

    static double everyValue(){
        double initialVelocity, angleDeg, angleRad;
        System.out.println("Enter initial velocity and angle in degrees respectively");
        Scanner smithereens = new Scanner(System.in);
        initialVelocity = smithereens.nextDouble();
        angleDeg = smithereens.nextDouble();
        angleRad = Math.toRadians(angleDeg);
        double timeOfFlight = (2*initialVelocity*angleRad)/9.8;
        System.out.println(timeOfFlight + " is the time of flight");
        double hMax = ((initialVelocity*initialVelocity)*(angleRad*angleRad)/19.6);
        System.out.println(hMax + " is the maximum height");
        double range = ((initialVelocity*initialVelocity)*2*angleDeg)/9.8;
        System.out.println(range + " is the range");

        return 0;
    }
    public static void main(String[] args) {
        char charChar;
        System.out.println("What would you like to find out? Height - H, Time of flight - T, Range - R and All - A");
        Scanner scannerScanner = new Scanner(System.in);
        charChar = scannerScanner.next().charAt(0);

        switch (charChar){
            case 'H':
                heightMax();
                break;

            case 'T':
                timeFlight();
                break;

            case 'R':
                Range();
                break;

            case 'A':
                everyValue();
                break;

            default:
                System.out.println("invalid input.");
                break;
        }

    }
}
