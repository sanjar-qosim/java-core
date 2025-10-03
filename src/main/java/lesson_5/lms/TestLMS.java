package lesson_5.lms;

public class TestLMS {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();

        Tutor mrJohn = new Tutor(24587412547845L, "Mr John", 35, 'm', "Math");
        Student ivan = new Student(20454754321454L, "Ivan", 16, 'm', 2);
        Course math = new Course("Math", mrJohn);

        dataBase.setTutor(mrJohn);
        dataBase.setStudent(ivan);
        dataBase.setCourse(math);

        for (Tutor tmp : dataBase.getTutors()) {
            System.out.println(tmp);
        }

       for (Student tmp : dataBase.getStudents()) {
            System.out.println(tmp);
        }

        for (Course tmp : dataBase.getCourses()) {
            System.out.println(tmp);
        }
    }
}
