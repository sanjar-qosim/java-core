package lesson_5.quiz_system;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String title;
    private int correctAnswer = -1;
    private List<String> options = new ArrayList<>();

    public Question(String title) {
        this.title = title;
    }

    public void createQuestion(String text, boolean isTrue) {
        options.add(text);
        if (isTrue) {
            correctAnswer = options.size();
        }
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean checkQuestion(int answer) {
        return answer == correctAnswer;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getOptions() {
        return options;
    }
}
