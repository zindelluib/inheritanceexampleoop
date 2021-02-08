/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author zindel
 */
public class InheritanceDemo {
    public static void main(String[] args) {
      Triangle tr    = new Triangle(9,9,9);
      Triangle tr2  = new Triangle(7,4,7);
      if(tr instanceof Triangle){
          System.out.println("tr is an instance of Triangle");
      }
      else{
          System.out.println("tr is NOT an instance of Triangle");
      }
    }
}


