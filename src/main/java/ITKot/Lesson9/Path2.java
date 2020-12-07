package ITKot.Lesson9;

public class Path2 {
    public static void main(String[] args) {

        Woman woman = new Woman("Natasha", 35);
        Woman woman1 = new Woman("Natasha", 35);
        Cat cat = new Cat("Olea", 2, woman.getName());
        Dog dog = new Dog("Jucika", 5, woman.getName());
        Dog dog1 = new Dog("Jucika", 5, woman.getName());

        System.out.println(woman);
        System.out.println(woman1);
    }
}

class Woman {
    private String name;
    private int age;

    // создаем конструктор Woman
    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
}

class Cat{
    private String name;
    private int age;
    private String owner;

    // создаем конструктор Cat
    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

}

class Dog{
    private String name;
    private int age;
    private String owner;

    // создаем конструктор Dog
    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

}

class Fish{
    private String name;
    private int age;
    private String owner;

    // создаем конструктор Fish
    public Fish(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

}