package Model;

import java.util.*;

public class Game {

    private int currentQuestionIndex;
    private Timer timer; //instantiate
    Scanner scanner = new Scanner(System.in);
    private QuestionArchive questionArchive;
    private String[][] questions;
    private int currentQuestion;
    private boolean reboundUsed = false;
    private boolean hasJoker = true;
    public Game() {
        questionArchive = new QuestionArchive();
    }

    public void play() {

        showIdleScreen();
    }

    private void showIdleScreen() {

        System.out.println("type 1 for start 2 for exit");
        int input = scanner.nextInt();
        if (input == 1)
            selectCategory();
        else if(input == 2)
            System.exit(1);
        else
            showIdleScreen();


    }

    private void selectCategory() {
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

    private void showQuestion() {
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

    private void endGame() {
        //TODO
        if(currentQuestion > 5 && reboundUsed == false) {
            reboundUsed = true;
            rebound();
        }
        else
            showFinalScore();

        //ask rebound if question 6...
        //showFinalScore();
    }

    private void showFinalScore() {
        //TODO
        //System.out.println("Your Score: " + calculateScore());
        System.out.println("Your Score: 1 " );
    }

    private int calculateScore() {
        //TODO
        //calculation algorithm
        return 0;
    }

    private void useJoker() {
        hasJoker = false;
    }

    private void rebound() {
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

    private void viewPreviousScores() {
        //TODO
    }



}
