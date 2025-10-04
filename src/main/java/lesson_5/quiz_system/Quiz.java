package lesson_5.quiz_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    Player player;
    Team team;
    List<Question> allQuestions = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void createPlayer() {
        System.out.println("Hello, will you play solo or with a team?\n- Solo\n- Team");
        String chooseType = scanner.nextLine();

        if (chooseType.equals("Solo")) {
            System.out.println("Please, enter your name:");
            String name = scanner.nextLine();
            player = new Player(name);
            System.out.println("Welcome to the game, " + name + "!");
        } else if (chooseType.equals("Team")) {
            System.out.println("Please, enter your name:");
            String name = scanner.nextLine();
            team = new Team(name);

            System.out.println("How many players will play with you?");
            int countOfPlayers = scanner.nextInt();

            for (int i = 1; i < countOfPlayers; i++) {
                System.out.println("Enter the" + i + " player's name:");
                String teamMember = scanner.nextLine();
                team.addPlayer(teamMember);
                System.out.println("The " + teamMember + " was added successfully!");
            }

            System.out.println("Welcome to the game, " + name + "!");
        } else {
            System.out.println("Invalid data!");
        }
    }

    public void createQuestion() {
        System.out.println("How many questions will you create?");
        int countOfQuestions = scanner.nextInt();

        for (int i = 1; i < countOfQuestions; i++) {
            System.out.println("Please, enter a title of question:");
            String questionTitle = scanner.nextLine();
            Question question = new Question(questionTitle);

            System.out.println("How many answers will you create for you \"" + questionTitle + "\" question?");
            int countOfAnswers = scanner.nextInt();

            for (int j = 1; j < countOfQuestions; j++) {
                System.out.println("Write the " + i + " answer:");
                String answer = scanner.nextLine();
                System.out.println("Is it true answer?\n- true\n- false");
                String isTrue = scanner.nextLine();

                if (isTrue.equals("true")) {
                    question.createQuestion(answer, true);
                } else if (isTrue.equals("false")) {
                    question.createQuestion(answer, false);
                } else {
                    System.out.println("Invalid data!");
                    break;
                }
            }
        }
    }
}