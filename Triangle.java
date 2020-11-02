public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public double getPerimeter() {
        double d1 = v1.distanceTo(v2);
        double d2 = v2.distanceTo(v3);
        double d3 = v1.distanceTo(v3);

        return Math.round((d1 + d2 + d3) * 10000) / 10000.0;
    }

    public double getArea() {
        double d1 = v1.distanceTo(v2);
        double d2 = v2.distanceTo(v3);
        double d3 = v1.distanceTo(v3);

        double semiP = (d1 + d2 + d3) / 2.0;

        return Math.sqrt(semiP * (semiP - d1) * (semiP - d2) * (semiP - d3));
    }

    public String classify() {
        double d1 = v1.distanceTo(v2);
        double d2 = v2.distanceTo(v3);
        double d3 = v1.distanceTo(v3);

        if (d1 == d2 && d1 == d3)
            return "equilateral";
        else if (d1 == d2 || d1 == d3 || d2 == d3)
            return "isosceles";
        else
            return "scalene";
    }

    public String toString() {
        return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX()
                + ", " + v3.getY() + ")";
    }

    public void setVertex(int index, Point newP) {
        if (index == 0)
            v1 = newP;
        else if (index == 1)
            v2 = newP;
        else if (index == 2)
            v3 = newP;
    }
}