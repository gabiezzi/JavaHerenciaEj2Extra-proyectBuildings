/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.sportCenterEntity;
import java.util.Scanner;
import service.sportCenterService;

/**
 *
 * @author Gabi
 */
public class sportCenterServiceImplement implements sportCenterService {

    Scanner sc;

    public sportCenterServiceImplement() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public sportCenterEntity createNewCenter() {
        sportCenterEntity newCenter = new sportCenterEntity();

        System.out.println("Creating data base for sportCenter");
        System.out.println("Insert the name of the center");
        newCenter.setCenterName(sc.next());
        System.out.println("Roofed center? yes/no");
        String option = sc.next();
        if (option.equalsIgnoreCase("yes")) {

            newCenter.setTechado(true);
        }

        System.out.println("Insert Height");
        newCenter.setHeight(sc.nextDouble());
        System.out.println("Insert Width");
        newCenter.setWidth(sc.nextDouble());
        System.out.println("Insert Lenght");
        newCenter.setLength(sc.nextDouble());

        
        return newCenter;
    }

    

    @Override
    public String calculateAreaAndVolume(sportCenterEntity newCenter) {
        
        return "The area of the building is " + newCenter.calculateArea() + "\nThe volume of the building is " + newCenter.calculateVolume() ;
    }


}
