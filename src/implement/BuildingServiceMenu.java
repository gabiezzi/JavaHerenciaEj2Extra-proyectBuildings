/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.BuildingEntity;
import entity.OfficeEntity;
import entity.sportCenterEntity;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabi
 */
public class BuildingServiceMenu {

    Scanner sc;
    ArrayList<BuildingEntity> buildings;
    OfficeServiceImplement newOfficeService;
    sportCenterServiceImplement newCenterService;

    public BuildingServiceMenu() {
        sc = new Scanner(System.in).useDelimiter("\n");
        buildings = new ArrayList();
        newOfficeService = new OfficeServiceImplement();
        newCenterService = new sportCenterServiceImplement();

    }

    public void menu() {

        int sintechar, techado = 0;
        sintechar = techado;
        
        System.out.println("Registrating buildings");

        buildings.add(newCenterService.createNewCenter());
        buildings.add(newCenterService.createNewCenter());
        buildings.add(newOfficeService.createNewOffice());
        buildings.add(newOfficeService.createNewOffice());

        for (BuildingEntity unitaryBuilding : buildings) {

            if (unitaryBuilding instanceof OfficeEntity) {
                OfficeEntity office = (OfficeEntity) unitaryBuilding;
                System.out.println(newOfficeService.calculateAreaAndVolume(office));
                System.out.println(newOfficeService.calculateCapacityOfBuildingOffice(office));

            } else if (unitaryBuilding instanceof sportCenterEntity) {


                sportCenterEntity sportCenter = (sportCenterEntity) unitaryBuilding;
                System.out.println(newCenterService.calculateAreaAndVolume(sportCenter));
                if (sportCenter.getTechado()) {

                    techado++;

                } else {

                    sintechar++;

                }

            }

        }
        
        System.out.println("The sport center with roof are " + techado );
        System.out.println("The sport center without roof are " + sintechar );

    }

}
