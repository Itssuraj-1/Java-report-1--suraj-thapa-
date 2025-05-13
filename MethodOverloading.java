// WAP to demonstrate method overloading in Java
public class MethodOverloading {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(100);
        obj.display("Hello");
    }
}
