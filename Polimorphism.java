class Animal{
    public void animalSound(){
        System.out.println("animal makes sound as follows");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("moooooo");
    }
}
class Cat extends Animal{
    public void AnimalSound(){
        System.out.println("gwo gwo gwo");
    }
}
public class Polimorphism {
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Animal cow=new Cow();
        Animal moni=new Cat();
        
        myAnimal.animalSound();
        cow.animalSound();
        moni.animalSound();

    }
    
}
