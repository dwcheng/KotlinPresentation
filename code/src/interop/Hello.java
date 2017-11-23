package interop;

public class Hello {
    public static void main(String[] args) {
        HelloFromTheOtherSideKt.greet();
    }

    public static void greet() {
        System.out.println("Hello, this is Java!");
    }
}