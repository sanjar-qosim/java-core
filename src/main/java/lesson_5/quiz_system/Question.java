package lesson_5.quiz_system;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String title;
    private int correctAnswer;
    private List<String> questions = new ArrayList<>();

    public Question(String title) {
        this.title = title;
    }

    public void createQuestion(String text, boolean isTrue) {
        questions.add(text);
        if (isTrue) {
            correctAnswer = questions.size();
        }
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean checkQuestion(int answer) {
        return answer == correctAnswer;
    }
}
