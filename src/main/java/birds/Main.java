package birds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Ostrich());
        birds.add(new Pheasant());

        for(Bird bird : birds) {
            bird.eat();
        }
    }
}
