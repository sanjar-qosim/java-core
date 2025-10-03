package lesson_5.lms;

public abstract class User {

    private final long pinfl;
    private final String name;
    private final int age;
    private final char sex;

    protected User(long pinfl, String name, int age, char sex) {
        this.pinfl = pinfl;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    protected abstract void action();

    public long getPinfl() {
        return pinfl;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
}
