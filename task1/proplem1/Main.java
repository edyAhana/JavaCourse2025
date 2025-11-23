class Bird {
    public void makeSound() {
        System.out.println("Some bird sound");
    }
}

class Sparrow extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.makeSound();
    }
}
