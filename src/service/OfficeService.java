/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.OfficeEntity;

/**
 *
 * @author Gabi
 */
public interface OfficeService {
    
    public OfficeEntity createNewOffice();
    
    public String calculateCapacityOfBuildingOffice(OfficeEntity newOffice);
    
    public String calculateAreaAndVolume(OfficeEntity newOffice);
    
}
