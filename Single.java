import java.util.*;

class Game {
    void name() {
        System.out.println("Valorant");
    }
}

class Play extends Game {
    void type() {
        System.out.println("Fps Shooter Game");
    }
}

class Single {
    public static void main(String[] args) {
        Play obj = new Play();
        obj.type();
        obj.name();
    }
}