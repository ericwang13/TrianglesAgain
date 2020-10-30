public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(13, 7);
        Point p2 = new Point(19, 89);
        Point p3 = new Point(17, 1);
        Point p4 = new Point(19, 89);

        System.out.println(p1.distanceTo(p2));
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p4));

        Triangle t1 = new Triangle(p1, p2, p3);
    }
}