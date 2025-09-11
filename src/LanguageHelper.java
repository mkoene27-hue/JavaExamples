public class LanguageHelper {
    public static void greet(){
        System.out.println("HELLO!");
    }
    public static String salutation(){
        boolean morning = true;
        if (morning){
            return "good morning";
        }
        return "afternoon";
    }

    public static boolean happy(){
        return true;
    }

    public static String german(String word){
        return "der "+word;
    }
}
