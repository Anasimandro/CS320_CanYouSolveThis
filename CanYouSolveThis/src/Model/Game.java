package Model;

import java.util.*;

public class Game {

    private int currentQuestionIndex;
    private Timer timer; //instantiate
    Scanner scanner = new Scanner(System.in);

    public Game() {

    }


    private void play() {
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
            System.out.println("Please enter either 1 or 2");
            showIdleScreen();


    }

    private void selectCategory() {
        //TODO
        System.out.println("1:celebrities, 2:food, 3:history, 4:movies, 5:music");
        int input = scanner.nextInt();


        //QuestionArchive
    }

    private void showQuestion() {
        //TODO
        //Shows the current question
        /*
         * for(currentQuestion;currentQuestion < ...;currentQuestion++)
         * print question i
         *
         * */
    }

    private void endGame() {
        //TODO
        //ask rebound if question 6...
        //showFinalScore();
    }

    private void showFinalScore() {
        //TODO
        //calculateScore();
    }

    private int calculateScore() {
        //TODO
        //calculation algorithm

        if(currentQuestionIndex == 0)
            return 0;
        else if (currentQuestionIndex <= 3)
            return currentQuestionIndex * 125;
        else if(currentQuestionIndex <= 6)
            return 500 + (currentQuestionIndex - 3 ) * 200;


        return 0;
    }

    private void useJoker() {

    }

    private void rebound() {

    }

    private void viewPreviousScores() {
        //TODO
    }



}
