public class Casting {
    public static void main(String[] args){
        int total = 154998;
        int actual = 0;
        for (int id = 0; id < total; id++){
            if (Character.toString(id)!=""){
                System.out.println(id+Character.toString(id));
                actual++;
            }
        }
        System.out.println("Actually found: "+actual+" of "+total);
    }
}
                                                                                                    