package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r;
        double pi = 3.14, angle;


        Scanner inp = new Scanner(System.in);
        System.out.print("Enter r: ");
        r = inp.nextInt();

        Scanner inp2 = new Scanner(System.in);
        System.out.print("Enter angle: ");
        angle = inp2.nextInt();

        double circleArea = pi * r * r;
        double circumference = 2 * pi * r;
        double areaOfSector = (pi * (r * r) * angle) / 360;

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area of Sector/Pie: " + areaOfSector);


    }
}
