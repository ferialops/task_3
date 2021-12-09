package ru.vsu.cs.kunakhova_a_y.Figures;

//import ru.vsu.cs.kunakhova_a_y.Figures.SimpleColor;

public class Picture {

    private final VerticalParabola verticalParabola1;
    private final VerticalParabola verticalParabola2;
    private final Line line1;
    private final Line line2;

    public Picture(VerticalParabola verticalParabola1, VerticalParabola verticalParabola2, Line line1, Line line2) {
        this.verticalParabola1 = verticalParabola1;
        this.verticalParabola2 = verticalParabola2;
        this.line1 = line1;
        this.line2 = line2;
    }

    public SimpleColor getColor(double x, double y) {
        if (line1.isPointAboveLine(x, y)) { //если точка над L1
            if (line2.isPointAboveLine(x, y)) { //если точка над L2
                return SimpleColor.GREEN;
            } else {
                return SimpleColor.ORANGE;
            }
        } else {
            if (line2.isPointAboveLine(x, y)) { //если точка над L2
                if (!verticalParabola1.isPointBelowOfParabola(x, y)) {  //снаружи P1
                    return SimpleColor.BLUE;
                } else {
                    return SimpleColor.WHITE;
                }
            } else {
                if (verticalParabola1.isPointBelowOfParabola(x, y) || verticalParabola2.isPointBelowOfParabola(x, y)) {
                    return SimpleColor.BLUE;
                } else {
                    return SimpleColor.WHITE;
                }
            }
        }
    }
}
