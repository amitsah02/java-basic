import java.util.*;
abstract class animal {
    public abstract void sound();
}

class Dog extends animal {
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class lion extends animal {
    public void sound() {
        System.out.println("Lion is Roar");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        lion l = new lion();
        d.sound();
        l.sound();
    }
}
