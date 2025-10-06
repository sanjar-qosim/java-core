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
        scanner.nextLine();

        for (int i = 0; i < countOfQuestions; i++) {
            System.out.println("Please, enter a title of question:");
            String questionTitle = scanner.nextLine();
            Question question = new Question(questionTitle);

            System.out.println("How many answers will you create for your \"" + questionTitle + "\" question?");
            int countOfAnswers = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < countOfAnswers; j++) {
                System.out.println("Write the " + (j + 1) + " answer:");
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

            if (question.getCorrectAnswer() != -1) {
                allQuestions.add(question);
                System.out.println("The \"" + question.getTitle() + "\" was created successfully!");
            } else {
                System.out.println("You didn't add a true option. Please, try again!");
            }
        }
    }

    public void startGame() {
        for (Question tmp : allQuestions) {
            System.out.println(tmp.getTitle());
            System.out.println("Choose a correct answer:");
            System.out.println(tmp.getOptions());
            int answer = scanner.nextInt();
            if (answer == tmp.getCorrectAnswer()) {
                System.out.println("You win!");
            } else {
                System.out.println("Sorry, that was not a correct answer!\nThe correct answer is " + tmp.getCorrectAnswer());
            }
        }
    }
}