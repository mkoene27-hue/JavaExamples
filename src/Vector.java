public class Vector {
    public Vector(double x, double y){
        double pos_x = x;
        double pos_y = y;
    }

    public static Vector add(Vector one, Vector two){
        double x = one.pos_x + two.pos_x;
        double y = one.pos_y + two.pos_y;
        return new Vector(x,y);
    }
}
