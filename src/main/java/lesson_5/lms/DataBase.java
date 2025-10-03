package lesson_5.lms;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Student> students = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Integer> attendanceLog = new ArrayList<>();
    private List<Integer> ballSystem = new ArrayList<>();

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public void setTutor(Tutor tutor) {
        this.tutors.add(tutor);
    }

    public void setCourse(Course course) {
        this.courses.add(course);
    }

    public void setAttendanceLog(int attendanceLog) {
        this.attendanceLog.add(attendanceLog);
    }

    public void setBallSystem(int ballSystem) {
        this.ballSystem.add(ballSystem);
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

    public List<Integer> getAttendanceLog() {
        return attendanceLog;
    }

    public List<Integer> getBallSystem() {
        return ballSystem;
    }
}
