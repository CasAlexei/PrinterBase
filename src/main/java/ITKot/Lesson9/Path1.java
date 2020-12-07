package ITKot.Lesson9;

/*  Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы.
Метод должен определять, выиграл ли робот у которого вызвали метод fight (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false  */


import java.util.Objects;

public class Path1 {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Vasea", 5, 50);
        Robot robot2 = new Robot("Jenea", 6, 80);

        System.out.println(robot1.fight(robot2));
        System.out.println(robot2.fight(robot1));
    }

}

class Robot{
    private String name;
    private int age;
    private int power;

    public boolean fight(Robot anotherRobot) {
        if (this.power > anotherRobot.power) {
            return true;
        } else {
            return false;
        }
    }

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return age == robot.age &&
                power == robot.power &&
                Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, power);
    }
}