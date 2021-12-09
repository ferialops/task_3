package ru.vsu.cs.kunakhova_a_y;

import ru.vsu.cs.kunakhova_a_y.Figures.Picture;
import ru.vsu.cs.kunakhova_a_y.Figures.SimpleColor;

public class Test {

    public boolean testProgram(Picture picture) {
        if (picture.getColor(-2, 5) != SimpleColor.GREEN) {
            System.out.println("Test 1 is not completed");
            return false;
        }
        if (picture.getColor(4, 5) != SimpleColor.ORANGE) {
            System.out.println("Test 2 is not completed");
            return false;
        }
        if (picture.getColor(0, 0) != SimpleColor.BLUE) {
            System.out.println("Test 3 is not completed");
            return false;
        }
        if (picture.getColor(3, 0) != SimpleColor.WHITE) {
            System.out.println("Test 4 is not completed");
            return false;
        }
        if (picture.getColor(-1, -5) != SimpleColor.WHITE) {
            System.out.println("Test 5 is not completed");
            return false;
        }
        if (picture.getColor(2, -6) != SimpleColor.BLUE) {
            System.out.println("Test 6 is not completed");
            return false;
        }
        if (picture.getColor(4, -9) != SimpleColor.BLUE) {
            System.out.println("Test 7 is not completed");
            return false;
        }
        if (picture.getColor(6, -1) != SimpleColor.BLUE) {
            System.out.println("Test 8 is not completed");
            return false;
        }
        return true;
    }
}
