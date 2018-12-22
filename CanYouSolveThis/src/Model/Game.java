package Model;

import java.io.*;
import java.util.*;

public class Game {

    private int currentQuestionIndex;
    private Timer timer; //instantiate
    Scanner scanner = new Scanner(System.in);

    FileReader fileReader = new FileReader(SCORES);
    FileWriter fileWriter = new FileWriter(SCORES);
    BufferedReader reader = new BufferedReader(fileReader);
    BufferedWriter writer = new BufferedWriter(fileWriter);

    private static final String SCORES = "/Users/eylulbasakdayi/Desktop/SCORES.txt";
    private QuestionArchive questionArchive;
    private String[][] questions;
    private int currentQuestion;
    private boolean reboundUsed = false;
    public Game() throws IOException {
        questionArchive = new QuestionArchive();
    }

    public void play() throws IOException {

        showIdleScreen();
    }

    private void showIdleScreen() throws IOException {

        System.out.println("type 1 for start 2 for exit");
        int input = scanner.nextInt();
        if (input == 1)
            selectCategory();
        else if(input == 2)
            System.exit(1);
        else
            showIdleScreen();


    }

    private void selectCategory() throws IOException {
        //TODO
        System.out.println("1:celebrities, 2:food, 3:history, 4:movies, 5:music");
        int input = scanner.nextInt();

        if (input == 1)
            questions = questionArchive.get10RandomCelebrityQuestions();
        else if (input == 2)
            questions = questionArchive.get10RandomFoodQuestions();
        else if (input == 3)
            questions = questionArchive.get10RandomHistoryQuestions();
        else if (input == 4)
            questions = questionArchive.get10RandomMovieQuestions();
        else if (input == 5)
            questions = questionArchive.get10RandomMusicQuestions();
        else
            selectCategory();

        showQuestion();
        //QuestionArchive
    }

    private void showQuestion() throws IOException {
        int currentQuestion = 0;
        for (int i = 0; i < 10; i++) {
            currentQuestion++;
            for (int j = 0; j < 5; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("Your answer: ");
            int input = scanner.nextInt();
            if (input != 1)
                endGame();
        }
    }

    private void endGame() throws IOException {
        //TODO
        if(currentQuestion > 5 && reboundUsed == false) {
            reboundUsed = true;
            rebound();
        }
        else
            showFinalScore();
            viewPreviousScores();

        //ask rebound if question 6...
        //showFinalScore();
    }

    private void showFinalScore() {
        //TODO
        //System.out.println("Your Score: " + calculateScore());
        System.out.println("Your Score: 1 " );
    }

    private int calculateScore() throws IOException {
        //TODO
        //calculation algorithm
        writer.write("Ozan buraya her seferinde calculate edilen score yazılacak String olarak.");
        return 0;
    }

    private void useJoker() {

    }

    private void rebound() throws IOException {
        for (int i= currentQuestion; i < 10; i++) {
            currentQuestion++;
            for (int j = 0; j < 5; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("Your answer: ");
            int input = scanner.nextInt();
            if (input != 1)
                endGame();
        }
    }

    private void viewPreviousScores() throws IOException {
        while(reader.readLine() != null) {
            System.out.println(reader.readLine());
        }
    }



}
