package LineComparisonProblem;

public class Line {
    Point start;
    Point end;
    Double length;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.length = calculateLength();
    }

    private double calculateLength() {
        return Math.sqrt(
                Math.pow(end.x - start.x, 2) +
                        Math.pow(end.y - start.y, 2)
        );
    }

    @Override
    public boolean equals(Object obj) {
        Line other = (Line) obj;
        return this.length.equals(other.length);
    }
}
