package com.company;

import java.util.Locale;

public class Vector2D{

    public double vX;
    public double vY;
    public double vA;
    public double vB;
    public double v;
    public double vC;
    static int count = 0;


    public Vector2D(){
        this.vX=1;
        this.vY=1;
        count++;
    }


    public Vector2D(double vX, double vY){
        this.vX=vX;
        this.vY=vY;
        count++;
    }
    public Vector2D(Vector2D v){
        this.vX=v.vX;
        this.vY=v.vY;
        count++;
    }
    public void print() {
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY));
        System.out.print(")");
        System.out.println();

    }
    public double length(){
        return Math.sqrt(this.vX*this.vX+this.vY*this.vY);
    }
    public void add(Vector2D v){
        this.vX=vX+v.vX;
        this.vY=vY+v.vY;
    }
    public void sub(Vector2D v){
        this.vX=vX-v.vX;
        this.vY=vY-v.vY;
    }
    public void scale(double scaleFactor){
        this.vX=vX*scaleFactor;
        this.vY=vY*scaleFactor;
    }
   public void normalized(){
        double a=(Math.sqrt(vX*vX+vY*vY));
        this.vX=vX/a;
        this.vY=vY/a;
   }
   public double dotProduct(Vector2D v){
        return this.vX*v.vX+this.vY*v.vY;
   }
}
