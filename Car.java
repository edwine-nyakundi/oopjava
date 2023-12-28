public class Car {
   public int tireCount;
   public void display(){
    System.out.println("am a car");
    System.out.println("my tirecount is"+tireCount);
   }
    public static void main(String[]args){
        Car toyota=new Car();
        toyota.tireCount=7;
        toyota.display();
    }
}
