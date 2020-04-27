/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTwitter;

import java.time.LocalTime;

/**
 *
 * @author unisy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        System.out.print("The time is : " + currentTime);
        
        if(currentTime.isAfter(LocalTime.parse("22:00:00.000000000"))) {
            // Application Logic goes here!
            System.out.print("DO SOMETHING! It's the correct time!");
        } else {
            // Don't do anything
            System.out.print("Not the correct time to do something");
        }
    }
    
}
