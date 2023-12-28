class Sample{
    private String task;
    public void setTask(String task){
         this.task=task;
    }
public String getTask(){
return this.task;
}
}
public class Main {
    public static void main(String[]args){
    Sample taski=new Sample();
    taski.setTask("hello i want to fall");
    System.out.println(taski.getTask());
}
}

