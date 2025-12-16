package LineComparisonProblem;

public class Line implements Comparable<Line> {

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

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Line otherLine = (Line) obj;
        return this.length.equals(otherLine.length);
    }

    @Override
    public int compareTo(Line other) {
        return this.length.compareTo(other.length);
    }
}