// WAP to demonstrate method overriding in Java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
