import java.util.Scanner;

public class quadratic_equation {
    private double a, b, c;

    public quadratic_equation(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
    }
    public double getRoot1(){
        return -this.getB() + Math.pow(this.getDiscriminant(),0.5)/(2*this.getA());
    }
    public double getRoot2(){
        return  (-this.getB() - Math.pow(this.getDiscriminant(),0.5))/(2*this.getA());
    }
    public String displayRoots(){
        if(this.getDiscriminant()<0) return "The equation has no roots";
        if (this.getDiscriminant()==0) return "The equation has two similar roots:" + this.getRoot1();
        else return "The equation has two different roots: \n" + "r1: "+ this.getRoot1() +"\n"+ "r2: "+ this.getRoot2();
    }
}
