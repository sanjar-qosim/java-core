package lesson_5.lms;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private final Tutor tutor;
    private List<Student> students = new ArrayList<>();

    public Course(String name, Tutor tutor) {
        this.tutor = tutor;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", tutor=" + tutor.getName() +
            '}';
    }
}
