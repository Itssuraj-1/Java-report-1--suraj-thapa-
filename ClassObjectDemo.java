// WAP to demonstrate concept of Class, Object, and methods in Java
class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Suraj";
        p.age = 21;
        p.display();
    }
}
