public class Constructor {
    String name="edwine";
    Constructor(){
        System.out.println(name);
    }
    public static void main(String[]args){
        Constructor student=new Constructor();
        System.out.println(student);
    }
}
