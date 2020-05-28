/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

public class Polygon {
    protected int noOfSides;
    protected String name;
    public Polygon(int noOfSides,String name){
        this.noOfSides =  noOfSides;
        this.name  = name;
    }
    public void displayInfo(){
        System.out.println("A " +  name +  " has " + noOfSides + " sides");
    }
}


