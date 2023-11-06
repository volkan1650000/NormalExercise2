package Exercises;

//The method to return the y's power of x

public class First {
    public static void main(String[] args) {
        System.out.println(power(2,7));
    }
    public static double power(double x, int y){
        if(y<0){
            y = Math.abs(y);
            x  = (1/x);
        }
        double sum = 1;
        while(y>0){
            sum = sum*x;
            y--;
        }
        return sum;
    }
}
