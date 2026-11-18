public interface AnimalInheritance1 {
    
    public static void main(String[] args) {

        Animal animal = new Animal();
        
        Cat cat = new Cat();

        Dog dog = new Dog();

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

    }
}
