package lesson_2;

public enum Exchange {

    USD("Dollar", 12500);

    private final String name;
    private final int course;

    Exchange(String name, int rate) {
        this.name = name;
        this.course = rate;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
