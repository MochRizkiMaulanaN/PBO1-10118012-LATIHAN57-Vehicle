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
public class Main57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle B =new Bicycle();
        B.setMyBrand("Trek Bike");
        B.setMyModel("7.4FX");
        B.setMyGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : "+B.getMyBrand());
        System.out.println("Model : "+B.getMyModel());
        System.out.println("Jumlah Gear : "+B.getMyGearCount());
        System.out.println("");
        Skateboard S =new Skateboard();
        S.setMyBrand("Ally Skate");
        S.setMyModel("Rocket");
        S.setMyBoardLength(54.5);
        System.out.println("Skateboard");
        System.out.println("Brand : "+S.getMyBrand());
        System.out.println("Model : "+S.getMyModel());
        System.out.println("Panjangnya Board : "+S.getMyBoardLength());
    }
    
}
