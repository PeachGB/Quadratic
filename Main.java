import java.lang.Math;

public class Main {



public static void main(String[] args){

    if (args.length < 3){
        System.out.println("put the values of a, b and c in that order!! and ");

    } 
    else {
        double[] result = equation(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
        for (int i = 0; i < 2;i++){
            System.out.println(result[i]);
        }
    }

}

public static double[] equation(double a, double b,double c){

    double discriminant = Math.sqrt(b*b)-4*a*c;
    double[] x = {0,0};
    if (discriminant < 0){
        System.out.println("No real solutions");
        return x;
        }
        else{
           x[0] =(-b+discriminant)/2*a;
           x[1] =(-b-discriminant)/2*a; }
    return x;
}
}