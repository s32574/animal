public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("- " + animal.makeNoise());
            System.out.println("- " + animal.roam());
            System.out.println("- " + animal.sleep());
            System.out.println();
        }
    }
}