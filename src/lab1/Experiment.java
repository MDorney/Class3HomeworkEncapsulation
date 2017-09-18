/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Doern
 */
public class Experiment {
    private static int population = 0;
    private boolean isLonely;
    
    public Experiment() {
        if(population < 2) {
            isLonely = true;
        } else isLonely = false;
    }
    
    public void tryToMakeFriends() {
        if(population < 2) {
            this.isLonely = true;
        } else isLonely = false;
    }
    
    public void sleep() {
        if(this.isLonely) {
            System.out.println("Your experiment cries itself to sleep");
        } else System.out.println("Your experiment peacefully nods off");
    }
    
}
