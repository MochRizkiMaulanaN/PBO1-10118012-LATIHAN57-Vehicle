/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main57;

/**
 *
 * @author LENOVO
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle(){
        myGearCount=0;
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
