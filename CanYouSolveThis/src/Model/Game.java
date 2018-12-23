package Model;

import java.io.*;
import java.util.*;

public class Game {

    private int currentQuestionIndex;
    private Timer timer; //instantiate
    Scanner scanner = new Scanner(System.in);
    static final String SCORES = "C:\\ata.baykara\\CST\\CS320_CanYouSolveThis\\CanYouSolveThis\\src\\SCORES";
    FileReader fileReader = new FileReader(SCORES);
    FileWriter fileWriter = new FileWriter(SCORES, true);
    BufferedReader reader = new BufferedReader(fileReader);
    BufferedWriter writer = new BufferedWriter(fileWriter);

    private boolean hasJoker = true;


    private QuestionArchive questionArchive;
    private String[][] questions;
    private int currentQuestion;
    private boolean reboundUsed = false;
    private int score = 0;

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
            currentQuestion++;
            for (int j = 0; j < 5; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("Your answer: ");
            int input = scanner.nextInt();
            if (input != 1 && !(input == 5 && hasJoker)) {
                endGame();
                showIdleScreen();
            }
            else if (input == 5 && hasJoker)
                hasJoker = false;
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

    private void showFinalScore() throws IOException {
        //TODO
        //System.out.println("Your Score: " + calculateScore());
        writer.append("YENİ CALCULATE EDİLEN SCORE\n");
        System.out.println("Your Score: 1 " );
    }

    private void calculateScore() {
        if(currentQuestion == 1 || currentQuestion == 2 || currentQuestion == 3 || currentQuestion == 4) {
            score += 100;
        } else if (currentQuestion == 5 || currentQuestion == 6 || currentQuestion == 7) {
            score += 200;
        } else {
            score += 300;
        }
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
            if (input != 1 && !(input == 5 && hasJoker)) {
                endGame();
                showIdleScreen();
            }
            else if (input == 5 && hasJoker)
                hasJoker = false;
        }
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

    public String[] getPreviousScores() throws IOException {
        String[] prevScores = new String[10];
        prevScores[0] = reader.readLine();
        prevScores[1] = reader.readLine();
        prevScores[2] = reader.readLine();
        prevScores[3] = reader.readLine();
        prevScores[4] = reader.readLine();
        prevScores[5] = reader.readLine();
        prevScores[6] = reader.readLine();
        prevScores[7] = reader.readLine();
        prevScores[8] = reader.readLine();
        prevScores[9] = reader.readLine();

        return prevScores;

    }

    public boolean checkAnswer (String answer) {
        String rightAnswer = questions[currentQuestion][1];
        return rightAnswer.equals(answer);

    }

    public String[] getCurrentQuestion () {
        return questions[currentQuestion];
    }



}
