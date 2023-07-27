package ex1_2;

import java.util.Scanner;

public class Foot {
    static FootShape shape = new FootShape();

    public static void draw(String shapeOfFoot) {
        switch(shapeOfFoot) {
            case "Ellipse":
                System.out.println(shape.drawAsEllipse());
                break;
            case "Rectangle":
                System.out.println(shape.drawAsRectangle());
                break;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                draw("Ellipse");
                break;
            case 2:
                draw("Rectangle");
        }
    }
}
