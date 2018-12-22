package View;

import javax.swing.*;
import java.awt.*;

public class CategorySelection {

    private JPanel panel;

    public CategorySelection() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Choose a category!");
        label.setSize(600, 60);
        label.setLocation(400, 50);
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        JButton celebrities = new JButton();
        JButton movies = new JButton();
        JButton history = new JButton();
        JButton music = new JButton();
        JButton food = new JButton();

        celebrities.setText("Celebrities");
        celebrities.setFont(new Font("Arial", Font.PLAIN, 20));
        celebrities.setSize(300, 50);
        celebrities.setLocation(450, 180);
        celebrities.setBackground(Color.RED);

        movies.setText("Movies");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setSize(300, 50);
        movies.setLocation(450, 250);
        movies.setBackground(Color.CYAN);

        history.setText("History");
        history.setFont(new Font("Arial", Font.PLAIN, 20));
        history.setSize(300, 50);
        history.setLocation(450, 320);
        history.setBackground(Color.GREEN);


        music.setText("Music");
        music.setFont(new Font("Arial", Font.PLAIN, 20));
        music.setSize(300, 50);
        music.setLocation(450, 390);
        music.setBackground(Color.YELLOW);

        food.setText("Food");
        food.setFont(new Font("Arial", Font.PLAIN, 20));
        food.setSize(300, 50);
        food.setLocation(450, 460);
        food.setBackground(Color.ORANGE);


        panel.add(label);


        panel.add(celebrities);
        panel.add(movies);
        panel.add(history);
        panel.add(music);
        panel.add(food);


    }

    public JPanel getPanel() {
        return panel;
    }
}
