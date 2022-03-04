/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.OfficeEntity;
import java.util.Scanner;
import service.OfficeService;

/**
 *
 * @author Gabi
 */
public class OfficeServiceImplement implements OfficeService  {

    Scanner sc;

    public OfficeServiceImplement() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public OfficeEntity createNewOffice() {

        OfficeEntity newOffice = new OfficeEntity();

        System.out.println("Creating data base for Office");
        
        System.out.println("Insert Height");
        newOffice.setHeight(sc.nextDouble());
        System.out.println("Insert Width");
        newOffice.setWidth(sc.nextDouble());
        System.out.println("Insert Lenght");
        newOffice.setLength(sc.nextDouble());

        System.out.println("Insert the number of floors");
        newOffice.setNumberOfFloors(sc.nextInt());

        System.out.println("Insert the number of offices per floor");
        newOffice.setNumberOffice(sc.nextInt());

        System.out.println("Insert the number of person per office");
        newOffice.setNumberPeople(sc.nextInt());

        return newOffice;

    }

    @Override
    public String calculateCapacityOfBuildingOffice(OfficeEntity newOffice) {

        return "The capacity of the building is"+ (newOffice.getNumberOfFloors()*newOffice.getNumberOffice()*newOffice.getNumberPeople()) + " persons.\n"
                + "The capacity of people of one floor is"+ (newOffice.getNumberOffice()*newOffice.getNumberPeople()) + " persons.";
    }

    
    @Override
    public String calculateAreaAndVolume(OfficeEntity newOffice) {
        
        return "The area of the building is " + newOffice.calculateArea() + "\nThe volume of the building is " + newOffice.calculateVolume() ;
    }

}
