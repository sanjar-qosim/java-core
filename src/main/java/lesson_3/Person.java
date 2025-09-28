package lesson_3;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
}
