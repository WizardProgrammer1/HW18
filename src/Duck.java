public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, Integer weight, Integer age) {
        super(name, weight, age);
    }

    @Override
    public void move(){
        System.out.println("Утка по кличке: " + super.getName() + " летит!");
    }
}
