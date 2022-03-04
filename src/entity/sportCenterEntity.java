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
public class sportCenterEntity extends BuildingEntity {
    
    private String centerName;
    private Boolean techado;

    public sportCenterEntity(String centerName, Boolean techado, double width, double height, double length) {
        super(width, height, length);
        this.centerName = centerName;
        this.techado = techado = false;
    }

    public sportCenterEntity() {
        
         this.techado = techado = false;
    }

    
    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "sportCenterEntity{"+ super.toString() + "centerName=" + centerName + ", techado=" + techado + '}';
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
