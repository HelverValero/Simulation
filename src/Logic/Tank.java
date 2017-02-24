/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author RA303
 */
public class Tank {
    private double width;
    private double height;
    private double diameter;
    private double level;
    private double heightHole;
    private double diameterHole;

    public Tank(double width, double height, double diameter, double level, double heightHole, double diameterHole) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.level = level;
        this.heightHole = heightHole;
        this.diameterHole = diameterHole;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getHeightHole() {
        return heightHole;
    }

    public void setHeightHole(double heightHole) {
        this.heightHole = heightHole;
    }

    public double getDiameterHole() {
        return diameterHole;
    }

    public void setDiameterHole(double diameterHole) {
        this.diameterHole = diameterHole;
    }
    
    public double capacity(){
      return 2*Math.PI*width * height; 
    }
    
    public double volume(){
      return 2*Math.PI*width * level; 
    }
    
    public double flow(){
      return 0; // to do...
    }

    public double jetLenght(double heightFloor){
      return 0; // to do...
    }
    
    public boolean isFull(){
       return height==level;
    }

    public boolean isEmpty(){
      return level == heightHole;
    }
    
    public void nextTime(){
       level = level - flow();
    }
}
