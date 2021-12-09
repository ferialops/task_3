package ru.vsu.cs.kunakhova_a_y;

import java.util.Scanner;
import java.util.Locale;

import ru.vsu.cs.kunakhova_a_y.Figures.Line;
import ru.vsu.cs.kunakhova_a_y.Figures.Picture;
import ru.vsu.cs.kunakhova_a_y.Figures.VerticalParabola;

public class Main {

    private static final VerticalParabola verticalParabola1 = new VerticalParabola(0, -4, -0.25);
    private static final VerticalParabola verticalParabola2 = new VerticalParabola(6, 0, -1.0);
    private static final Line line1 = new Line(2, 4, 0.25);
    private static final Line line2 = new Line(3, 3, 5.5);

    public static final Picture picture = new Picture(verticalParabola1, verticalParabola2, line1, line2);

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        if (test.testProgram(picture)) {
            System.out.println("Test completed");

            double x = readCoordinates("Enter x = ");

            double y = readCoordinates("Enter y = ");

            colorOfPoint(x, y);

        }

    }

    private static double readCoordinates(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        double coordinate = sc.nextDouble();
        if (coordinate > 10 || coordinate < -10) {
            System.out.print("Coordinate should be in {-10;10}");
            System.exit(1);
        }
        return coordinate;

    }

    private static final Test test = new Test();

    public static void colorOfPoint(double x, double y) {
        System.out.print("(" + x + ";" + y + ") is ");
        System.out.println(picture.getColor(x, y));
    }

}
