class Animal{
    String name;
    
}
class Cow extends Animal{
    void reproduce(){
        System.out.println("my name is  "+name+"and i can calve");
    }
}
public class Inheritance {
    public static void main(String[]args){
        Cow majani=new Cow();
      majani.name="edu";
        majani.reproduce();

    }
    
}
