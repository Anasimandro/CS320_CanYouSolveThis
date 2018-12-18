// get10Random...Questions returns
// 10x5 array
// x,0 question
// x,1 correct answers
// x,2 ; x,3 ; x,4 wrong answers

package Model;

import java.util.*;

enum Category {
    CELEBRITIES, FOOD, HISTORY, MOVIES, MUSIC;
}

public class QuestionArchive {

    private String[][] celebrityQuestions;
    private String[][] foodQuestions;
    private String[][] historyQuestions;
    private String[][] movieQuestions;
    private String[][] musicQuestions;
    Category category;

    public QuestionArchive() {

    }

    private String[][] get10RandomCelebrityQuestions() {
        String[][] finalCelebrityQuestions = new String[10][5];
        Random questionNumber = new Random();

        for(int i = 0 ; i < 10 ; i++) {
            int next = questionNumber.nextInt(25);
            for(int j = 0 ; j < 5 ; j++) {
                finalCelebrityQuestions[i][j] = celebrityQuestions[next][j];
            }
        }

        return finalCelebrityQuestions;
    }

    private String[][] get10RandomFoodQuestions() {
        String[][] finalFoodQuestions = new String[10][5];
        Random questionNumber = new Random();

        for(int i = 0 ; i < 10 ; i++) {
            int next = questionNumber.nextInt(25);
            for(int j = 0 ; j < 5 ; j++) {
                finalFoodQuestions[i][j] = foodQuestions[next][j];
            }
        }

        return finalFoodQuestions;
    }

    private String[][] get10RandomHistoryQuestions() {
        String[][] finalHistoryQuestions = new String[10][5];
        Random questionNumber = new Random();

        for (int i = 0; i < 10; i++) {
            int next = questionNumber.nextInt(25);
            for (int j = 0; j < 5; j++) {
                finalHistoryQuestions[i][j] = historyQuestions[next][j];
            }
        }

        return finalHistoryQuestions;
    }

    private String[][] get10RandomMovieQuestions() {
        String[][] finalMovieQuestions = new String[10][5];
        Random questionNumber = new Random();

        for (int i = 0; i < 10; i++) {
            int next = questionNumber.nextInt(25);
            for (int j = 0; j < 5; j++) {
                finalMovieQuestions[i][j] = movieQuestions[next][j];
            }
        }

        return finalMovieQuestions;

    }

    private String[][] get10RandomMusicQuestions() {
        String[][] finalMusicQuestions = new String[10][5];
        Random questionNumber = new Random();

        for (int i = 0; i < 10; i++) {
            int next = questionNumber.nextInt(25);
            for (int j = 0; j < 5; j++) {
                finalMusicQuestions[i][j] = musicQuestions[next][j];
            }
        }

        return finalMusicQuestions;

    }

    private String[][] getCelebrityQuestions() {
        celebrityQuestions = new String[25][5];

        //Question 1 & Answers
        celebrityQuestions[0][0] =

        celebrityQuestions[0][1] =
        celebrityQuestions[0][2] =
        celebrityQuestions[0][3] =
        celebrityQuestions[0][4] =

        //Question 2 & Answers
        celebrityQuestions[1][0] = "";

        celebrityQuestions[1][1] = "";
        celebrityQuestions[1][2] = "";
        celebrityQuestions[1][3] = "";
        celebrityQuestions[1][4] = "";

        //Question 3 & Answers
        celebrityQuestions[2][0] = "";

        celebrityQuestions[2][1] = "";
        celebrityQuestions[2][2] = "";
        celebrityQuestions[2][3] = "";
        celebrityQuestions[2][4] = "";

        //Question 4 & Answers
        celebrityQuestions[3][0] = "";

        celebrityQuestions[3][1] = "";
        celebrityQuestions[3][2] = "";
        celebrityQuestions[3][3] = "";
        celebrityQuestions[3][4] = "";

        //Question 5 & Answers
        celebrityQuestions[4][0] = "";

        celebrityQuestions[4][1] = "";
        celebrityQuestions[4][2] = "";
        celebrityQuestions[4][3] = "";
        celebrityQuestions[4][4] = "";

        //Question 6 & Answers
        celebrityQuestions[5][0] = "";

        celebrityQuestions[5][1] = "";
        celebrityQuestions[5][2] = "";
        celebrityQuestions[5][3] = "";
        celebrityQuestions[5][4] = "";

        //Question 7 & Answers
        celebrityQuestions[6][0] = "";

        celebrityQuestions[6][1] = "";
        celebrityQuestions[6][2] = "";
        celebrityQuestions[6][3] = "";
        celebrityQuestions[6][4] = "";

        //Question 8 & Answers
        celebrityQuestions[7][0] = "";

        celebrityQuestions[7][1] = "";
        celebrityQuestions[7][2] = "";
        celebrityQuestions[7][3] = "";
        celebrityQuestions[7][4] = "";

        //Question 9 & Answers
        celebrityQuestions[8][0] = "";

        celebrityQuestions[8][1] = "";
        celebrityQuestions[8][2] = "";
        celebrityQuestions[8][3] = "";
        celebrityQuestions[8][4] = "";

        //Question 10 & Answers
        celebrityQuestions[9][0] = "";

        celebrityQuestions[9][1] = "";
        celebrityQuestions[9][2] = "";
        celebrityQuestions[9][3] = "";
        celebrityQuestions[9][4] = "";

        //Question 11 & Answers
        celebrityQuestions[10][0] = "";

        celebrityQuestions[10][1] = "";
        celebrityQuestions[10][2] = "";
        celebrityQuestions[10][3] = "";
        celebrityQuestions[10][4] = "";

        //Question 12 & Answers
        celebrityQuestions[11][0] = "";

        celebrityQuestions[11][1] = "";
        celebrityQuestions[11][2] = "";
        celebrityQuestions[11][3] = "";
        celebrityQuestions[11][4] = "";

        //Question 13 & Answers
        celebrityQuestions[12][0] = "";

        celebrityQuestions[12][1] = "";
        celebrityQuestions[12][2] = "";
        celebrityQuestions[12][3] = "";
        celebrityQuestions[12][4] = "";

        //Question 14 & Answers
        celebrityQuestions[13][0] = "";

        celebrityQuestions[13][1] = "";
        celebrityQuestions[13][2] = "";
        celebrityQuestions[13][3] = "";
        celebrityQuestions[13][4] = "";

        //Question 15 & Answers
        celebrityQuestions[14][0] = "";

        celebrityQuestions[14][1] = "";
        celebrityQuestions[14][2] = "";
        celebrityQuestions[14][3] = "";
        celebrityQuestions[14][4] = "";

        //Question 16 & Answers
        celebrityQuestions[15][0] = "";

        celebrityQuestions[15][1] = "";
        celebrityQuestions[15][2] = "";
        celebrityQuestions[15][3] = "";
        celebrityQuestions[15][4] = "";

        //Question 17 & Answers
        celebrityQuestions[16][0] = "";

        celebrityQuestions[16][1] = "";
        celebrityQuestions[16][2] = "";
        celebrityQuestions[16][3] = "";
        celebrityQuestions[16][4] = "";

        //Question 18 & Answers
        celebrityQuestions[17][0] = "";

        celebrityQuestions[17][1] = "";
        celebrityQuestions[17][2] = "";
        celebrityQuestions[17][3] = "";
        celebrityQuestions[17][4] = "";

        //Question 19 & Answers
        celebrityQuestions[18][0] = "";

        celebrityQuestions[18][1] = "";
        celebrityQuestions[18][2] = "";
        celebrityQuestions[18][3] = "";
        celebrityQuestions[18][4] = "";

        //Question 20 & Answers
        celebrityQuestions[19][0] = "";

        celebrityQuestions[19][1] = "";
        celebrityQuestions[19][2] = "";
        celebrityQuestions[19][3] = "";
        celebrityQuestions[19][4] = "";

        //Question 21 & Answers
        celebrityQuestions[20][0] = "";

        celebrityQuestions[20][1] = "";
        celebrityQuestions[20][2] = "";
        celebrityQuestions[20][3] = "";
        celebrityQuestions[20][4] = "";

        //Question 22 & Answers
        celebrityQuestions[21][0] = "";

        celebrityQuestions[21][1] = "";
        celebrityQuestions[21][2] = "";
        celebrityQuestions[21][3] = "";
        celebrityQuestions[21][4] = "";

        //Question 23 & Answers
        celebrityQuestions[22][0] = "";

        celebrityQuestions[22][1] = "";
        celebrityQuestions[22][2] = "";
        celebrityQuestions[22][3] = "";
        celebrityQuestions[22][4] = "";

        //Question 24 & Answers
        celebrityQuestions[23][0] = "";

        celebrityQuestions[23][1] = "";
        celebrityQuestions[23][2] = "";
        celebrityQuestions[23][3] = "";
        celebrityQuestions[23][4] = "";

        //Question 25 & Answers
        celebrityQuestions[24][0] = "";

        celebrityQuestions[24][1] = "";
        celebrityQuestions[24][2] = "";
        celebrityQuestions[24][3] = "";
        celebrityQuestions[24][4] = "";

        return null;
    }

    private String[][] getFoodQuestions() {
        foodQuestions = new String[25][5];

        //Question 1 & Answers
        foodQuestions[0][0] = "Which of the following terms describes a vegetarian who does not eat eggs but does eat dairy products?";

        foodQuestions[0][1] = "Lacto-Ovo";
        foodQuestions[0][2] = "Ovo";
        foodQuestions[0][3] = "Paleo";
        foodQuestions[0][4] = "Vegan";

        //Question 2 & Answers
        foodQuestions[1][0] = "Black pepper, plum and blackberry flavors describe which wine?";

        foodQuestions[1][1] = "Shiraz";
        foodQuestions[1][2] = "Merlot";
        foodQuestions[1][3] = "Beaujolais";
        foodQuestions[1][4] = "Pinot Grigio";

        //Question 3 & Answers
        foodQuestions[2][0] = "What country is renowned for chocolate?";

        foodQuestions[2][1] = "Belgium";
        foodQuestions[2][2] = "Finland";
        foodQuestions[2][3] = "Venezuela";
        foodQuestions[2][4] = "Argentina";

        //Question 4 & Answers
        foodQuestions[3][0] = "In what country might you eat haggis?";

        foodQuestions[3][1] = "Scotland";
        foodQuestions[3][2] = "Paraguay";
        foodQuestions[3][3] = "Norway";
        foodQuestions[3][4] = "Lesotho";

        //Question 5 & Answers
        foodQuestions[4][0] = "If a wine is described as 'hot' it most likely means it?";

        foodQuestions[4][1] = "Has too high an alcohol content.";
        foodQuestions[4][2] = "Is spicy flavored.";
        foodQuestions[4][3] = "Is served at warmer than room temperature.";
        foodQuestions[4][4] = "Is bitter.";

        //Question 6 & Answers
        foodQuestions[5][0] = "If you were eating mole poblano, you would most likely be in what country?";

        foodQuestions[5][1] = "Mexico";
        foodQuestions[5][2] = "China";
        foodQuestions[5][3] = "Italy";
        foodQuestions[5][4] = "Tanzania";

        //Question 7 & Answers
        foodQuestions[6][0] = "In what country would you be most likely to find gruyere cheese in the market?";

        foodQuestions[6][1] = "Switzerland";
        foodQuestions[6][2] = "Spain";
        foodQuestions[6][3] = "Suriname";
        foodQuestions[6][4] = "Sweden";

        //Question 8 & Answers
        foodQuestions[7][0] = "Which of these countries is not a major producer of oranges?";

        foodQuestions[7][1] = "Iceland";
        foodQuestions[7][2] = "Italy";
        foodQuestions[7][3] = "Brazil";
        foodQuestions[7][4] = "USA";

        //Question 9 & Answers
        foodQuestions[8][0] = "Which Italian region in this list is home to Prosecco production?";

        foodQuestions[8][1] = "Veneto";
        foodQuestions[8][2] = "Sicily";
        foodQuestions[8][3] = "Tuscany";
        foodQuestions[8][4] = "Alto Adige";

        //Question 10 & Answers
        foodQuestions[9][0] = "Where would you find empanadas being made?";

        foodQuestions[9][1] = "Spain";
        foodQuestions[9][2] = "Tanzania";
        foodQuestions[9][3] = "Pakistan";
        foodQuestions[9][4] = "Japan";

        //Question 11 & Answers
        foodQuestions[10][0] = "In which country did the fortune cookie originate?";

        foodQuestions[10][1] = "USA";
        foodQuestions[10][2] = "China";
        foodQuestions[10][3] = "Taiwan";
        foodQuestions[10][4] = "Japan";

        //Question 12 & Answers
        foodQuestions[11][0] = "Which of the following refers not only to a dish but also to the pot it is cooked in?";

        foodQuestions[11][1] = "Tagine";
        foodQuestions[11][2] = "Poutine";
        foodQuestions[11][3] = "Smorgasboard";
        foodQuestions[11][4] = "Goulash";

        //Question 13 & Answers
        foodQuestions[12][0] = "What item is on the table at every Ethiopian meal?";

        foodQuestions[12][1] = "Injera Bread";
        foodQuestions[12][2] = "Curried Chickpeas";
        foodQuestions[12][3] = "Steamed Rice";
        foodQuestions[12][4] = "Pasta";

        //Question 14 & Answers
        foodQuestions[13][0] = "The world's most expensive spice is native to Southwest Asia. What is it?";

        foodQuestions[13][1] = "Saffron";
        foodQuestions[13][2] = "Cinnamon";
        foodQuestions[13][3] = "Vanilla";
        foodQuestions[13][4] = "Star Anise";

        //Question 15 & Answers
        foodQuestions[14][0] = "In order to eat a German weisswurst, or white sausage, like a real Münchner, you must do which of the following?";

        foodQuestions[14][1] = "Suck the sausage out of its casing.";
        foodQuestions[14][2] = "Dunk it in beer.";
        foodQuestions[14][3] = "Eat it on a roll.";
        foodQuestions[14][4] = "Cut it into small pieces.";

        //Question 16 & Answers
        foodQuestions[15][0] = "The world's largest fish market is in what capital city?";

        foodQuestions[15][1] = "Tokyo";
        foodQuestions[15][2] = "Beijing";
        foodQuestions[15][3] = "Mexico City";
        foodQuestions[15][4] = "Canberra";

        //Question 17 & Answers
        foodQuestions[16][0] = "What food is hummus made from?";

        foodQuestions[16][1] = "Chickpeas";
        foodQuestions[16][2] = "Tofu";
        foodQuestions[16][3] = "Corn";
        foodQuestions[16][4] = "Rice";

        //Question 18 & Answers
        foodQuestions[17][0] = "What's in a Martini?";

        foodQuestions[17][1] = "Vodka (or gin), vermouth, olive (or twist).";
        foodQuestions[17][2] = "Bourbon and seltzer";
        foodQuestions[17][3] = "Vodka, cranberry juice and a twist";
        foodQuestions[17][4] = "Rum, cola, and a lemon";

        //Question 19 & Answers
        foodQuestions[18][0] = "How many different types of liquor are in a Long Island Iced Tea ?";

        foodQuestions[18][1] = "5";
        foodQuestions[18][2] = "7";
        foodQuestions[18][3] = "3";
        foodQuestions[18][4] = "4";

        //Question 20 & Answers
        foodQuestions[19][0] = "Which type of pasta's name means little worms?";

        foodQuestions[19][1] = "Vermicelli";
        foodQuestions[19][2] = "Spaghetti";
        foodQuestions[19][3] = "Linguine";
        foodQuestions[19][4] = "Fusilli";

        //Question 21 & Answers
        foodQuestions[20][0] = "Swiss chard is also known as...";

        foodQuestions[20][1] = "Silverbeet";
        foodQuestions[20][2] = "English spinach";
        foodQuestions[20][3] = "Chicory";
        foodQuestions[20][4] = "Sorrel";

        //Question 22 & Answers
        foodQuestions[21][0] = "Where do Kalamata Olives originate from?";

        foodQuestions[21][1] = "Greece";
        foodQuestions[21][2] = "Turkey";
        foodQuestions[21][3] = "Italy";
        foodQuestions[21][4] = "Spain";

        //Question 23 & Answers
        foodQuestions[22][0] = "Where is the red colouring from that is used to make cochineal?";

        foodQuestions[22][1] = "Scale insects found in South America";
        foodQuestions[22][2] = "Grasshoppers";
        foodQuestions[22][3] = "Red ants";
        foodQuestions[22][4] = "Dried and ground South American fruit";

        //Question 24 & Answers
        foodQuestions[23][0] = "What is usually the main ingredient of a cheesecake?";

        foodQuestions[23][1] = "Cream Cheese";
        foodQuestions[23][2] = "Fresh Cream";
        foodQuestions[23][3] = "Limburger Cheese";
        foodQuestions[23][4] = "Cake Mix";

        //Question 25 & Answers
        foodQuestions[24][0] = "What Mexican cheese is produced by pressing cottage cheese?";

        foodQuestions[24][1] = "Queso Blanco";
        foodQuestions[24][2] = "Oaxaca Cheese";
        foodQuestions[24][3] = "Monterrey Jack";
        foodQuestions[24][4] = "Queso Amarillo";

        return foodQuestions;
    }

    private String[][] getHistoryQuestions() {
        historyQuestions = new String[25][5];

        //Question 1 & Answers
        historyQuestions[0][0] =

        historyQuestions[0][1] =
        historyQuestions[0][2] =
        historyQuestions[0][3] =
        historyQuestions[0][4] =

        //Question 2 & Answers
        historyQuestions[1][0] = "";

        historyQuestions[1][1] = "";
        historyQuestions[1][2] = "";
        historyQuestions[1][3] = "";
        historyQuestions[1][4] = "";

        //Question 3 & Answers
        historyQuestions[2][0] = "";

        historyQuestions[2][1] = "";
        historyQuestions[2][2] = "";
        historyQuestions[2][3] = "";
        historyQuestions[2][4] = "";

        //Question 4 & Answers
        historyQuestions[3][0] = "";

        historyQuestions[3][1] = "";
        historyQuestions[3][2] = "";
        historyQuestions[3][3] = "";
        historyQuestions[3][4] = "";

        //Question 5 & Answers
        historyQuestions[4][0] = "";

        historyQuestions[4][1] = "";
        historyQuestions[4][2] = "";
        historyQuestions[4][3] = "";
        historyQuestions[4][4] = "";

        //Question 6 & Answers
        historyQuestions[5][0] = "";

        historyQuestions[5][1] = "";
        historyQuestions[5][2] = "";
        historyQuestions[5][3] = "";
        historyQuestions[5][4] = "";

        //Question 7 & Answers
        historyQuestions[6][0] = "";

        historyQuestions[6][1] = "";
        historyQuestions[6][2] = "";
        historyQuestions[6][3] = "";
        historyQuestions[6][4] = "";

        //Question 8 & Answers
        historyQuestions[7][0] = "";

        historyQuestions[7][1] = "";
        historyQuestions[7][2] = "";
        historyQuestions[7][3] = "";
        historyQuestions[7][4] = "";

        //Question 9 & Answers
        historyQuestions[8][0] = "";

        historyQuestions[8][1] = "";
        historyQuestions[8][2] = "";
        historyQuestions[8][3] = "";
        historyQuestions[8][4] = "";

        //Question 10 & Answers
        historyQuestions[9][0] = "";

        historyQuestions[9][1] = "";
        historyQuestions[9][2] = "";
        historyQuestions[9][3] = "";
        historyQuestions[9][4] = "";

        //Question 11 & Answers
        historyQuestions[10][0] = "";

        historyQuestions[10][1] = "";
        historyQuestions[10][2] = "";
        historyQuestions[10][3] = "";
        historyQuestions[10][4] = "";

        //Question 12 & Answers
        historyQuestions[11][0] = "";

        historyQuestions[11][1] = "";
        historyQuestions[11][2] = "";
        historyQuestions[11][3] = "";
        historyQuestions[11][4] = "";

        //Question 13 & Answers
        historyQuestions[12][0] = "";

        historyQuestions[12][1] = "";
        historyQuestions[12][2] = "";
        historyQuestions[12][3] = "";
        historyQuestions[12][4] = "";

        //Question 14 & Answers
        historyQuestions[13][0] = "";

        historyQuestions[13][1] = "";
        historyQuestions[13][2] = "";
        historyQuestions[13][3] = "";
        historyQuestions[13][4] = "";

        //Question 15 & Answers
        historyQuestions[14][0] = "";

        historyQuestions[14][1] = "";
        historyQuestions[14][2] = "";
        historyQuestions[14][3] = "";
        historyQuestions[14][4] = "";

        //Question 16 & Answers
        historyQuestions[15][0] = "";

        historyQuestions[15][1] = "";
        historyQuestions[15][2] = "";
        historyQuestions[15][3] = "";
        historyQuestions[15][4] = "";

        //Question 17 & Answers
        historyQuestions[16][0] = "";

        historyQuestions[16][1] = "";
        historyQuestions[16][2] = "";
        historyQuestions[16][3] = "";
        historyQuestions[16][4] = "";

        //Question 18 & Answers
        historyQuestions[17][0] = "";

        historyQuestions[17][1] = "";
        historyQuestions[17][2] = "";
        historyQuestions[17][3] = "";
        historyQuestions[17][4] = "";

        //Question 19 & Answers
        historyQuestions[18][0] = "";

        historyQuestions[18][1] = "";
        historyQuestions[18][2] = "";
        historyQuestions[18][3] = "";
        historyQuestions[18][4] = "";

        //Question 20 & Answers
        historyQuestions[19][0] = "";

        historyQuestions[19][1] = "";
        historyQuestions[19][2] = "";
        historyQuestions[19][3] = "";
        historyQuestions[19][4] = "";

        //Question 21 & Answers
        historyQuestions[20][0] = "";

        historyQuestions[20][1] = "";
        historyQuestions[20][2] = "";
        historyQuestions[20][3] = "";
        historyQuestions[20][4] = "";

        //Question 22 & Answers
        historyQuestions[21][0] = "";

        historyQuestions[21][1] = "";
        historyQuestions[21][2] = "";
        historyQuestions[21][3] = "";
        historyQuestions[21][4] = "";

        //Question 23 & Answers
        historyQuestions[22][0] = "";

        historyQuestions[22][1] = "";
        historyQuestions[22][2] = "";
        historyQuestions[22][3] = "";
        historyQuestions[22][4] = "";

        //Question 24 & Answers
        historyQuestions[23][0] = "";

        historyQuestions[23][1] = "";
        historyQuestions[23][2] = "";
        historyQuestions[23][3] = "";
        historyQuestions[23][4] = "";

        //Question 25 & Answers
        historyQuestions[24][0] = "";

        historyQuestions[24][1] = "";
        historyQuestions[24][2] = "";
        historyQuestions[24][3] = "";
        historyQuestions[24][4] = "";
        return null;
    }

    private String[][] getMovieQuestions() {
        movieQuestions = new String[25][5];

        //Question 1 & Answers
        movieQuestions[0][0] =

        movieQuestions[0][1] =
        movieQuestions[0][2] =
        movieQuestions[0][3] =
        movieQuestions[0][4] =

        //Question 2 & Answers
        movieQuestions[1][0] = "";

        movieQuestions[1][1] = "";
        movieQuestions[1][2] = "";
        movieQuestions[1][3] = "";
        movieQuestions[1][4] = "";

        //Question 3 & Answers
        movieQuestions[2][0] = "";

        movieQuestions[2][1] = "";
        movieQuestions[2][2] = "";
        movieQuestions[2][3] = "";
        movieQuestions[2][4] = "";

        //Question 4 & Answers
        movieQuestions[3][0] = "";

        movieQuestions[3][1] = "";
        movieQuestions[3][2] = "";
        movieQuestions[3][3] = "";
        movieQuestions[3][4] = "";

        //Question 5 & Answers
        movieQuestions[4][0] = "";

        movieQuestions[4][1] = "";
        movieQuestions[4][2] = "";
        movieQuestions[4][3] = "";
        movieQuestions[4][4] = "";

        //Question 6 & Answers
        movieQuestions[5][0] = "";

        movieQuestions[5][1] = "";
        movieQuestions[5][2] = "";
        movieQuestions[5][3] = "";
        movieQuestions[5][4] = "";

        //Question 7 & Answers
        movieQuestions[6][0] = "";

        movieQuestions[6][1] = "";
        movieQuestions[6][2] = "";
        movieQuestions[6][3] = "";
        movieQuestions[6][4] = "";

        //Question 8 & Answers
        movieQuestions[7][0] = "";

        movieQuestions[7][1] = "";
        movieQuestions[7][2] = "";
        movieQuestions[7][3] = "";
        movieQuestions[7][4] = "";

        //Question 9 & Answers
        movieQuestions[8][0] = "";

        movieQuestions[8][1] = "";
        movieQuestions[8][2] = "";
        movieQuestions[8][3] = "";
        movieQuestions[8][4] = "";

        //Question 10 & Answers
        movieQuestions[9][0] = "";

        movieQuestions[9][1] = "";
        movieQuestions[9][2] = "";
        movieQuestions[9][3] = "";
        movieQuestions[9][4] = "";

        //Question 11 & Answers
        movieQuestions[10][0] = "";

        movieQuestions[10][1] = "";
        movieQuestions[10][2] = "";
        movieQuestions[10][3] = "";
        movieQuestions[10][4] = "";

        //Question 12 & Answers
        movieQuestions[11][0] = "";

        movieQuestions[11][1] = "";
        movieQuestions[11][2] = "";
        movieQuestions[11][3] = "";
        movieQuestions[11][4] = "";

        //Question 13 & Answers
        movieQuestions[12][0] = "";

        movieQuestions[12][1] = "";
        movieQuestions[12][2] = "";
        movieQuestions[12][3] = "";
        movieQuestions[12][4] = "";

        //Question 14 & Answers
        movieQuestions[13][0] = "";

        movieQuestions[13][1] = "";
        movieQuestions[13][2] = "";
        movieQuestions[13][3] = "";
        movieQuestions[13][4] = "";

        //Question 15 & Answers
        movieQuestions[14][0] = "";

        movieQuestions[14][1] = "";
        movieQuestions[14][2] = "";
        movieQuestions[14][3] = "";
        movieQuestions[14][4] = "";

        //Question 16 & Answers
        movieQuestions[15][0] = "";

        movieQuestions[15][1] = "";
        movieQuestions[15][2] = "";
        movieQuestions[15][3] = "";
        movieQuestions[15][4] = "";

        //Question 17 & Answers
        movieQuestions[16][0] = "";

        movieQuestions[16][1] = "";
        movieQuestions[16][2] = "";
        movieQuestions[16][3] = "";
        movieQuestions[16][4] = "";

        //Question 18 & Answers
        movieQuestions[17][0] = "";

        movieQuestions[17][1] = "";
        movieQuestions[17][2] = "";
        movieQuestions[17][3] = "";
        movieQuestions[17][4] = "";

        //Question 19 & Answers
        movieQuestions[18][0] = "";

        movieQuestions[18][1] = "";
        movieQuestions[18][2] = "";
        movieQuestions[18][3] = "";
        movieQuestions[18][4] = "";

        //Question 20 & Answers
        movieQuestions[19][0] = "";

        movieQuestions[19][1] = "";
        movieQuestions[19][2] = "";
        movieQuestions[19][3] = "";
        movieQuestions[19][4] = "";

        //Question 21 & Answers
        movieQuestions[20][0] = "";

        movieQuestions[20][1] = "";
        movieQuestions[20][2] = "";
        movieQuestions[20][3] = "";
        movieQuestions[20][4] = "";

        //Question 22 & Answers
        movieQuestions[21][0] = "";

        movieQuestions[21][1] = "";
        movieQuestions[21][2] = "";
        movieQuestions[21][3] = "";
        movieQuestions[21][4] = "";

        //Question 23 & Answers
        movieQuestions[22][0] = "";

        movieQuestions[22][1] = "";
        movieQuestions[22][2] = "";
        movieQuestions[22][3] = "";
        movieQuestions[22][4] = "";

        //Question 24 & Answers
        movieQuestions[23][0] = "";

        movieQuestions[23][1] = "";
        movieQuestions[23][2] = "";
        movieQuestions[23][3] = "";
        movieQuestions[23][4] = "";

        //Question 25 & Answers
        movieQuestions[24][0] = "";

        movieQuestions[24][1] = "";
        movieQuestions[24][2] = "";
        movieQuestions[24][3] = "";
        movieQuestions[24][4] = "";

        return null;
    }

    private String[][] getMusicQuestions() {
        musicQuestions = new String[25][5];

        //Question 1 & Answers
        musicQuestions[0][0] =

        musicQuestions[0][1] =
        musicQuestions[0][2] =
        musicQuestions[0][3] =
        musicQuestions[0][4] =

        //Question 2 & Answers
        musicQuestions[1][0] = "";

        musicQuestions[1][1] = "";
        musicQuestions[1][2] = "";
        musicQuestions[1][3] = "";
        musicQuestions[1][4] = "";

        //Question 3 & Answers
        musicQuestions[2][0] = "";

        musicQuestions[2][1] = "";
        musicQuestions[2][2] = "";
        musicQuestions[2][3] = "";
        musicQuestions[2][4] = "";

        //Question 4 & Answers
        musicQuestions[3][0] = "";

        musicQuestions[3][1] = "";
        musicQuestions[3][2] = "";
        musicQuestions[3][3] = "";
        musicQuestions[3][4] = "";

        //Question 5 & Answers
        musicQuestions[4][0] = "";

        musicQuestions[4][1] = "";
        musicQuestions[4][2] = "";
        musicQuestions[4][3] = "";
        musicQuestions[4][4] = "";

        //Question 6 & Answers
        musicQuestions[5][0] = "";

        musicQuestions[5][1] = "";
        musicQuestions[5][2] = "";
        musicQuestions[5][3] = "";
        musicQuestions[5][4] = "";

        //Question 7 & Answers
        musicQuestions[6][0] = "";

        musicQuestions[6][1] = "";
        musicQuestions[6][2] = "";
        musicQuestions[6][3] = "";
        musicQuestions[6][4] = "";

        //Question 8 & Answers
        musicQuestions[7][0] = "";

        musicQuestions[7][1] = "";
        musicQuestions[7][2] = "";
        musicQuestions[7][3] = "";
        musicQuestions[7][4] = "";

        //Question 9 & Answers
        musicQuestions[8][0] = "";

        musicQuestions[8][1] = "";
        musicQuestions[8][2] = "";
        musicQuestions[8][3] = "";
        musicQuestions[8][4] = "";

        //Question 10 & Answers
        musicQuestions[9][0] = "";

        musicQuestions[9][1] = "";
        musicQuestions[9][2] = "";
        musicQuestions[9][3] = "";
        musicQuestions[9][4] = "";

        //Question 11 & Answers
        musicQuestions[10][0] = "";

        musicQuestions[10][1] = "";
        musicQuestions[10][2] = "";
        musicQuestions[10][3] = "";
        musicQuestions[10][4] = "";

        //Question 12 & Answers
        musicQuestions[11][0] = "";

        musicQuestions[11][1] = "";
        musicQuestions[11][2] = "";
        musicQuestions[11][3] = "";
        musicQuestions[11][4] = "";

        //Question 13 & Answers
        musicQuestions[12][0] = "";

        musicQuestions[12][1] = "";
        musicQuestions[12][2] = "";
        musicQuestions[12][3] = "";
        musicQuestions[12][4] = "";

        //Question 14 & Answers
        musicQuestions[13][0] = "";

        musicQuestions[13][1] = "";
        musicQuestions[13][2] = "";
        musicQuestions[13][3] = "";
        musicQuestions[13][4] = "";

        //Question 15 & Answers
        musicQuestions[14][0] = "";

        musicQuestions[14][1] = "";
        musicQuestions[14][2] = "";
        musicQuestions[14][3] = "";
        musicQuestions[14][4] = "";

        //Question 16 & Answers
        musicQuestions[15][0] = "";

        musicQuestions[15][1] = "";
        musicQuestions[15][2] = "";
        musicQuestions[15][3] = "";
        musicQuestions[15][4] = "";

        //Question 17 & Answers
        musicQuestions[16][0] = "";

        musicQuestions[16][1] = "";
        musicQuestions[16][2] = "";
        musicQuestions[16][3] = "";
        musicQuestions[16][4] = "";

        //Question 18 & Answers
        musicQuestions[17][0] = "";

        musicQuestions[17][1] = "";
        musicQuestions[17][2] = "";
        musicQuestions[17][3] = "";
        musicQuestions[17][4] = "";

        //Question 19 & Answers
        musicQuestions[18][0] = "";

        musicQuestions[18][1] = "";
        musicQuestions[18][2] = "";
        musicQuestions[18][3] = "";
        musicQuestions[18][4] = "";

        //Question 20 & Answers
        musicQuestions[19][0] = "";

        musicQuestions[19][1] = "";
        musicQuestions[19][2] = "";
        musicQuestions[19][3] = "";
        musicQuestions[19][4] = "";

        //Question 21 & Answers
        musicQuestions[20][0] = "";

        musicQuestions[20][1] = "";
        musicQuestions[20][2] = "";
        musicQuestions[20][3] = "";
        musicQuestions[20][4] = "";

        //Question 22 & Answers
        musicQuestions[21][0] = "";

        musicQuestions[21][1] = "";
        musicQuestions[21][2] = "";
        musicQuestions[21][3] = "";
        musicQuestions[21][4] = "";

        //Question 23 & Answers
        musicQuestions[22][0] = "";

        musicQuestions[22][1] = "";
        musicQuestions[22][2] = "";
        musicQuestions[22][3] = "";
        musicQuestions[22][4] = "";

        //Question 24 & Answers
        musicQuestions[23][0] = "";

        musicQuestions[23][1] = "";
        musicQuestions[23][2] = "";
        musicQuestions[23][3] = "";
        musicQuestions[23][4] = "";

        //Question 25 & Answers
        musicQuestions[24][0] = "";

        musicQuestions[24][1] = "";
        musicQuestions[24][2] = "";
        musicQuestions[24][3] = "";
        musicQuestions[24][4] = "";

        return null;
    }

}
