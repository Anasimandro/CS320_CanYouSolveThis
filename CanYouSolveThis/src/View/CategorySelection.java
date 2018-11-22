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
        JButton generalculture = new JButton();
        JButton music = new JButton();
        JButton food = new JButton();

        celebrities.setText("Celebrities");
        celebrities.setFont(new Font("Arial", Font.PLAIN, 20));
        celebrities.setSize(300, 50);
        celebrities.setLocation(500, 300);

        movies.setText("Movies");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setSize(300, 80);
        movies.setLocation(500, 370);

        movies.setText("General Culture");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setSize(300, 80);
        movies.setLocation(500, 440);

        movies.setText("Music");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setSize(300, 80);
        movies.setLocation(500, 510);

        movies.setText("Food");
        movies.setFont(new Font("Arial", Font.PLAIN, 20));
        movies.setSize(300, 80);
        movies.setLocation(500, 580);


        panel.add(label);


        panel.add(celebrities);
        panel.add(movies);
        panel.add(generalculture);
        panel.add(music);
        panel.add(food);


    }

    public JPanel getPanel() {
        return panel;
    }
}
