// Hierarchical INHERITANCE
class Game2 {
    void name2() {
        System.out.println("BGMI");
    }
}

class Play2 extends Game2 {
    void type2() {
        System.out.println("Battle ground shooter Game");
    }
}

class Device1 extends Game2 {
    void device2() {
        System.out.println("Mobile");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        Device1 obj = new Device1();
        obj.device2();
        // obj.type2(); ct error
        obj.name2();
    }
}
