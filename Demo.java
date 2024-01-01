 enum Names{
    EDWINE,MOKAYA,NYAKUNDI,MOKA,ARIEL
}
class Demo{
    public static void main(String []args){
        Names[] names=Names.values();
        for(Names name:names){
            System.out.println(name);
        }
    }
}