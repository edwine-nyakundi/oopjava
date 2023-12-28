class Person{
    private String name;
    //get name
    public String getName(){
        return name;
    }
        //setname
        public void setName(String firstName){
            this.name=firstName;
        }
    
}
class Encapsulation extends Person{
    public static void main(String[]args){
        Encapsulation firstname=new Encapsulation();
        firstname.setName("EDWINE");
        System.out.println("My first name is  :"+firstname.getName());
    }
}