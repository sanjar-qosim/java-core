package lesson_5.lms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {

    private List<Student> students = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private Map<Student, Integer> attendanceLog = new HashMap<>();;

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addTutor(Tutor tutor) {
        this.tutors.add(tutor);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addAttendanceLog(Student student, int attendanceLog) {
        this.attendanceLog.put(student, attendanceLog);
    }

    public void addBallSystem(Student student, int ballSystem) {
        student.setGrade(ballSystem);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void getAttendanceLog() {
        for (Student tmp : students) {
            System.out.println(tmp.getName() + ": " + attendanceLog.get(tmp));
        }
    }

    public void getBallSystem() {
        for (Student tmp : students) {
            System.out.println(tmp.getName() + ": " + tmp.getGrade());
        }
    }
}
