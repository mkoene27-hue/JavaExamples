public class Vector2D {
    private double dx;
    private double dy;
    
    public Vector2D(double x, double y){
        dx = x;
        dy = y;
    }

    public static Vector2D add(Vector2D one, Vector2D two){
        double x = one.dx + two.dx;
        double y = one.dy + two.dy;
        return new Vector2D(x,y);
    }

    public double magnitude(){
        double mag = 0;
        mag += dx*dx;
        mag += dy*dy;
        mag = Math.sqrt(mag);
        return mag;
    }

    public void show(){
        System.out.println(dx+","+dy);
    }
}
