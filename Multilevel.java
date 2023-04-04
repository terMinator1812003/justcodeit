// MULTILEVEL INHERITANCE
class Game1 {
    void name1() {
        System.out.println("BGMI");
    }
}

class Play1 extends Game1 {
    void type1() {
        System.out.println("Battle ground shooter Game");
    }
}

class Device extends Play1 {
    void device1() {
        System.out.println("Mobile");
    }
}

public class Multilevel {
    public static void main(String args[]) {
        Device obj = new Device();
        obj.device1();
        obj.type1();
        obj.name1();
    }
}
