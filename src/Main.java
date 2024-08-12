public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Рома", 50, 20);
        duck.walk();
        duck.move();

        Dog dog = new Dog("Тузик", 23,5);
        dog.walk();
        dog.move();

    }
}
