public class Main{
    public static void main(String[] args){
        String name = My.myInput("Name: ");
        int age = My.myIntInput("Age: ");
        System.out.println(name+" is half of "+age*2+" years old.");
    }
}