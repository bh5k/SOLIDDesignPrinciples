package birds;

class Ostrich extends Bird implements RunningBird {

    public void run() {
        System.out.println("I don't believe I can fly...");
    }
}
