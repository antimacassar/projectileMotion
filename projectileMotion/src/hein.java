//test file

import java.util.*;

public class hein {
    public static void main(String[] args) {
        double initialVelocity, heightMax, angleDeg, angleRad, timeFlight, range;
        char toFind;

        System.out.println("What would you like to find? (Hmax - H, Time of flight - T, Range - R)");
        Scanner surprise = new Scanner(System.in);
        toFind = surprise.next().charAt(0);

        switch (toFind){
            case 'H':
                System.out.println("Enter velocity and angle of projection in degrees respectively.");

                initialVelocity = surprise.nextDouble();
                angleDeg = surprise.nextDouble();

                angleRad = Math.toRadians(angleDeg);
                heightMax = ((initialVelocity*initialVelocity)*(angleRad*angleRad)/19.6);
                System.out.println(heightMax);
                break;

            case 'T':
                System.out.println("Enter velocity and angle of projection in degrees respectively.");

                initialVelocity = surprise.nextDouble();
                angleDeg = surprise.nextDouble();

                angleRad = Math.toRadians(angleDeg);
                timeFlight = (2*initialVelocity*angleRad)/9.8;
                System.out.println(timeFlight);
                break;

            case 'R':
                System.out.println("Enter velocity and angle of projection in degrees respectively.");

                initialVelocity = surprise.nextDouble();
                angleDeg = surprise.nextDouble();

                range = ((initialVelocity*initialVelocity)*2*angleDeg)/9.8;
                System.out.println(range);
                break;

            default:
                System.out.println("invalid input");
                break;
        }
    }
}
