package com.company;

public class Fan {
    private int Slow = 1;
    private  int Medium = 2;
    private int Fast = 3;
    private  int Speed = 1;
    private  boolean on = false;
    private  String color = "blue";
    private  double radius = 5;

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed(){
        return Speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSlow(int slow) {
        this.Slow = slow;
    }

    public void setMedium(int medium) {
        this.Medium = medium;
    }

    public void setFast(int fast) {
        this.Fast = fast;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan (int speed,boolean on, String color , double radius){
        this.Speed = speed;
        this.on = on;
        this.color = color;
        this.radius =radius;

    }


    @Override

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n ");
            state += ("Speed: " + this.Speed + "\n");
            state += ("color: " + this.color + "\n");
            state += ("radius: " + this.radius + "\n");
        }else {
            state += ("Fan is off\n");
            state += ("Color" + this.color + "\n");
            state += ("radius" + this.radius + "\n");

        }return state;
    }
}
