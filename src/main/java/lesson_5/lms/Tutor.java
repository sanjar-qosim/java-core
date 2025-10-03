package lesson_5.lms;

public class Tutor extends User{

    private String academicSubject;

    public Tutor(long pinfl, String name, int age, char sex, String academicSubject) {
        super(pinfl, name, age, sex);
        this.academicSubject = academicSubject;
    }

    @Override
    protected void action() {
        System.out.println(getName() + " is teaching");
    }

    @Override
    public String toString() {
        return "Tutor{" +
            "PINFL='" + getPinfl() + '\'' +
            "Name='" + getName() + '\'' +
            "Age='" + getAge() + '\'' +
            "Sex='" + getSex() + '\'' +
            "academicSubject='" + academicSubject + '\'' +
            '}';
    }
}
