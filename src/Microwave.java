public class Microwave{
    private String brand;
    private int maxPower;
    
    
    //everybody needs a microwave
    public Microwave(String manufacturer, int power){
        brand = manufacturer;
        maxPower = power;
    }
    //start spinning the microwave
    public void spin(){
        spin(true);
    }
    //spin the microwave if spinVal ==true 
    public void spin(boolean spinVal){
        if(spinVal){
            System.out.println("Spin spin spin");
        }
    }
    //cook at max power for seconds seconds
    public void cook(int seconds){
        cook(seconds, maxPower);
    }
    //cook at power power for seconds seconds
    public void cook(int seconds, int power){ //has to have different number or order of variables
        System.out.println("Cooking for "+seconds+" seconds at "+power+"W");
    }
    //cook at max power for 30 seconds 
    public void cook30(){
        cook(30, maxPower);
    }
    //beep because its necessary
    public void beep(){
        System.out.println("beep");
    }
    //defrost the microwave for when you take it out of the freezer
    public void defrost(int time){
        System.out.println("Defrosting your "+brand);
        for(int i=0;i<time;i++){
            System.out.println("ice");
        }
    }
    //I took my microwave out of the freezer so i need to defrost it before i can cook my food, spin it, and beep 
    public static void main(String[] args){
        Microwave cookie = new Microwave("MAXrowaves", 800);
        cookie.defrost(10);
        cookie.cook30();
        cookie.spin();
        cookie.beep();
    }
}