import java.util.Scanner;

public class My {
    public static int mySmallRandom(int min, int stop){
        double r = Math.random();
        r *= stop-min;
        r += min;
        return (int) r;
    }

    public static int myRandom(int min, int max){
        return mySmallRandom(min,max+1);
    }

    public static String myInput(String prompt){
        Scanner myScanner = new Scanner(System.in);
        System.out.print(prompt);
        String answer = myScanner.nextLine();
        return answer;
    }

    public static int myIntInput(String prompt){
        String answer = myInput(prompt);
        return Integer.parseInt(answer);
    }
}
