interface Speaker {
    void speak();
}

class Person implements Speaker {
    public void speak() {
        System.out.println("Привет!");
    }
}

public class Main {
    public static void main(String[] args) {
        var p = new Person();
        p.speak();
    }
}
