package birds;

public class Pheasant extends Bird implements FlyingBird {

    @Override
    public void eat() {
        System.out.println("I am eating corn.");
    }

    @Override
    public void fly() {
        System.out.println("I can run and fly supah fast!");
    }
}
