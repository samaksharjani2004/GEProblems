package LineComparisonProblem;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(
                new Point(0, 0),
                new Point(3, 4)
        );

        Line line2 = new Line(
                new Point(1, 1),
                new Point(4, 5)
        );

        Line line3 = new Line(
                new Point(0, 0),
                new Point(6, 8)
        );

        System.out.println("Line1 Length: " + line1.length);
        System.out.println("Line2 Length: " + line2.length);
        System.out.println("Line3 Length: " + line3.length);

        System.out.println("\n--- Equality Check ---");
        System.out.println("Line1 equals Line2: " + line1.equals(line2));
        System.out.println("Line1 equals Line3: " + line1.equals(line3));

        System.out.println("\n--- Comparison ---");
        compareLines(line1, line2);
        compareLines(line1, line3);
        compareLines(line2, line3);
    }

    private static void compareLines(Line l1, Line l2) {
        int result = l1.compareTo(l2);

        if (result == 0)
            System.out.println("Both lines are equal");
        else if (result > 0)
            System.out.println("First line is greater than second line");
        else
            System.out.println("First line is smaller than second line");
    }
}