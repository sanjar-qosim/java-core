package lesson_5.quiz_system;

public class TestQuiz {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.createPlayer();
        quiz.createQuestion();
        quiz.startGame();
    }
}
