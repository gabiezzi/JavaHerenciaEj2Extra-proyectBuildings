/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class OfficeEntity extends BuildingEntity{
    
    private int numberOffice;
    private int numberPeople;
    private int numberOfFloors;
    

    public OfficeEntity(int numberOffice, int numberPeople, int numberOfFloors, double width, double height, double length) {
        super(width, height, length);
        this.numberOffice = numberOffice;
        this.numberPeople = numberPeople;
        this.numberOfFloors = numberOfFloors;
    }

    public OfficeEntity() {
    }

    
    public int getNumberOffice() {
        return numberOffice;
    }

    public void setNumberOffice(int numberOffice) {
        this.numberOffice = numberOffice;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double calculateArea(){
        return width*length;
    }

    @Override
    public double calculateVolume() {
       return width*length*height;
               
    }
    
    
    
}
