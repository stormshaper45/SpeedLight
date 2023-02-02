/**
 * class: ITEC 2140
 * date:01/27/23
 * aurthur:Joshua Wilson
 * descrpition: This program is to calculate the area and perimeter of a circle with a radius of 9.5
 */
public class Circle {

    public static void main (String[] args) {
        // we need to start by listing the formulas
        double Radius = 9.5;
        System.out.print("The given radius is 9.5. ");
        // the formula for area is (radius * radius * Math.PI)
        double Area = Radius * Radius * 3.14;
        System.out.print("The area of the circle is " + Area);
        // the formula for perimeter is (2 * radius * Math.PI)
        double Perimeter = 2 * Radius * 3.14;

        System.out.print(", The perimeter of the circle is " + Perimeter);


    }
}
