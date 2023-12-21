package practice8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс фигуры
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        // Генерируем случайный цвет
        Random rand = new Random();
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    public abstract void draw(Graphics g);
}

// Класс для кругов
class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

// Класс для прямоугольников
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class task1 extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public task1() {
        shapes = new Shape[NUM_SHAPES];
        Random rand = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = rand.nextInt(WIDTH);
            int y = rand.nextInt(HEIGHT);
            int choice = rand.nextInt(2);

            if (choice == 0) {
                int radius = rand.nextInt(50) + 10; // Радиус от 10 до 59
                shapes[i] = new Circle(x, y, radius);
            } else {
                int width = rand.nextInt(100) + 20; // Ширина от 20 до 119
                int height = rand.nextInt(80) + 20; // Высота от 20 до 99
                shapes[i] = new Rectangle(x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // очистим от мусора

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(WIDTH, HEIGHT);
            frame.add(new task1());
            frame.setVisible(true);
        });
    }
}
