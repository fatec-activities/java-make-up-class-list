public class Geometry {
    private Geometry() {
    }

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }
}