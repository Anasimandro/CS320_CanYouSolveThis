package Model;

import java.io.*;
import java.util.*;
import java.awt.event.*;

public class Game {

    private int currentQuestionIndex;
    private Timer timer; //instantiate
    Scanner scanner = new Scanner(System.in);
    static final String SCORES = "D:\\workspace\\CS320_CanYouSolveThis\\CS320_CanYouSolveThis\\CanYouSolveThis\\SCORES";
    FileReader fileReader = new FileReader(SCORES);
    FileWriter fileWriter = new FileWriter(SCORES, true);
    BufferedReader reader = new BufferedReader(fileReader);
    BufferedWriter writer = new BufferedWriter(fileWriter);

    private boolean joker = true;

    private QuestionArchive questionArchive;
    private String[][] questions;
    private int currentQuestion = 0;
    private boolean reboundUsed = false;
    private int score = 0;
    private boolean testFinished = false;

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
        currentQuestion = 0;
        for (int i = 0; i < 10; i++) {
            currentQuestion = i;
            for (int j = 0; j < 5; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("Your answer: ");
            int input = scanner.nextInt();
            if (input != 1 && !(input == 5 && joker)) {
                endGame();
                showIdleScreen();
            }
            else if (input == 5 && joker)
                joker = false;

            calculateScore();
        }
        testFinished = true;
        endGame();
    }

    private void endGame() throws IOException {
        //TODO
        if(currentQuestion > 5 && reboundUsed == false && testFinished == false) {
            reboundUsed = true;
            rebound();
        }
        else
            showFinalScore();
        viewPreviousScores();

        //ask rebound if question 6...
        //showFinalScore();
    }

    private void showFinalScore() throws IOException {
        //TODO
        //System.out.println("Your Score: " + calculateScore());

        writer.append(score + "\n");
        writer.close();
        System.out.println("Your Score: " + score );
    }

    private void calculateScore() {
        if(currentQuestion == 0 || currentQuestion == 1 || currentQuestion == 2 || currentQuestion == 3) {
            score += 100;
        } else if (currentQuestion == 4 || currentQuestion == 5 || currentQuestion == 6) {
            score += 200;
        } else {
            score += 300;
        }
    }


    private void rebound() throws IOException {
        System.out.println("1 to rebound, 2 to exit");
        int reboundChoice = scanner.nextInt();
        if (reboundChoice == 1) {
            int reboundedQuestionIndex = currentQuestion;
            for (int i= reboundedQuestionIndex; i < 10; i++) {
                currentQuestion = i;
                for (int j = 0; j < 5; j++) {
                    System.out.println(questions[i][j]);
                }
                System.out.println("Your answer: ");
                int input = scanner.nextInt();
                if (input != 1 && !(input == 5 && joker)) {
                    endGame();
                    showIdleScreen();
                } else if (input == 5 && joker)
                    joker = false;

                calculateScore();
            }
        }
        else if (reboundChoice == 2)
            System.exit(1);

        testFinished = true;
        endGame();

    }

    private void viewPreviousScores() throws IOException {
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
    }

    public boolean checkAnswer (String answer) {
        String rightAnswer = questions[currentQuestion][1];
        return rightAnswer.equals(answer);

    }

    public String[] getCurrentQuestion () {

        return questions[currentQuestion];
    }

    public int getCurrentScore () {
        return score;
    }

    public int getCurrentQuestionIndex () {
        return currentQuestion;
    }

    public boolean hasJoker() {
        return joker;
    }



}
