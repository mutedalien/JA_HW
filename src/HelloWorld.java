public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

class Human {
    byte b = 0; // 1 byte(256) -128 - +128
    short s = 1234; // 2 byte(~65000) -32k - +32k
    int i = 234234234; // 4 byte
    long l = 234234234; // 8 byte
    float f = 12.345f; // 4
    double d = 1234.4567; // 8
    boolean bool = true; // true or false
    char c = '4'; // any one symbol

    Human friend = new Human();
    Human mom;
    Human dad;

    Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.car.speed);
    }
}

