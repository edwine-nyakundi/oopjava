public class Main extends Hello{
     String name="edwine";
     public void Msg(){
         System.out.println("welcome "+name);
     }
     public  static void main(String[]args){
          Hello greetings=new Hello();
          greetings.gender();
          Main names=new Main();
          names.Msg();

     }
}