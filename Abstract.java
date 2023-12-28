abstract class Animal{
    public abstract void AnimalSound();
    public void sleep(){
        System.out.println("grrrrrrrr");
    }
}
class Cow extends Animal{
    public void AnimalSound(){
        System.err.println("mooooh");
    }
}
public class Abstract {
    public static void main(String[]args){
        Cow nyabarati=new Cow();
        nyabarati.AnimalSound();
        nyabarati.sleep();

    }
    
}
