package practice8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task3 extends JPanel implements ActionListener {
    private int currentFrame = 0;
    private final int totalFrames = 4;
    private Timer timer;
    private Image[] frames;

    public task3() {
        frames = new Image[totalFrames];

        for (int i = 0; i < totalFrames; i++) {
            String filename ="src/practice8/images/" + i + ".jpg";
            frames[i] = new ImageIcon(filename).getImage();
        }

        int delay = 100; // Задержка в миллисекундах между кадрами
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Отрисовка
        g.drawImage(frames[currentFrame], 0, 0, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Обновление кадров
        currentFrame = (currentFrame + 1) % totalFrames;

        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Анимация");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            task3 animation = new task3();
            frame.add(animation);

            frame.setVisible(true);
        });
    }
}
