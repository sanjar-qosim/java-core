package lesson_5.lms;

public class Student extends User {

    private int course;
    private int grade;

    public Student(long pinfl, String name, int age, char sex, int course) {
        super(pinfl, name, age, sex);
        this.course = course;
    }

    @Override
    protected void action() {
        System.out.println(getName() + " is studying");
    }

    public void setGrade(int grade) {
         this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return "Students{" +
            "PINFL='" + getPinfl() + '\'' +
            "Name='" + getName() + '\'' +
            "Age='" + getAge() + '\'' +
            "Sex='" + getSex() + '\'' +
            "Course='" + course + '\'' +
            "Grade='" + grade + '\'' +
            '}';
    }
}
