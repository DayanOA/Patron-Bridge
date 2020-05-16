/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge;

/**
 *
 * @author Tonny
 */
public class PatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Car car1 = new Maruti(new Produce(), new Assemble(), new Tunning(), new Test());
        car1.production_house();
        
        Car car2 = new BMW(new Produce(), new Assemble(), new Tunning(), new Test());
        car2.production_house();
        
        Car car3 = new Mazda(new Produce(), new Assemble(), new Tunning(), new Test());
        car3.production_house();
        
        Car car4 = new Ferrari(new Produce(), new Assemble(), new Tunning(), new Test());
        car4.production_house();
    }

}
