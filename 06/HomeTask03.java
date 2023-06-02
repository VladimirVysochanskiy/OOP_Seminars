// 3) Переписать код в соответствии с Interface Segregation Principle:
// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

public class HomeTask03 {
    public static void main(String[] args) {

    }

}

public interface FlatShape {
    double area();
}

public interface VolumetricShape {
    double volume();
}

public class Circle implements FlatShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements FlatShape, VolumetricShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
