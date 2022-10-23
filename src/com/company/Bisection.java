package com.company;

public class Bisection {

    private double EPSILON = 0.25;
    private int iteration = 0;
    private double c = 1.0;

    public double f(double x){
        return x*x - 2;
    }

    public double bisection(double a, double b){ //main algorithm

        iteration++;

        if(f(a) * f(b) >= 0){
            return 0.0; // Wrong [a, b]
        }

        if((b-a) >= EPSILON){

            c = (a+b)/2; // middle point

            if(f(c) == 0.0){ // that means middle point is the root
                return c;
            }
            else if (f(c)*f(a) < 0){
                b = c;
                bisection(a, b);
            }
            else {
                a = c;
                bisection(a, b);
            }
        }
        return c;
    }

    public int getIteration(){
        return iteration;
    }
}
