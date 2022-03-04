/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.sportCenterEntity;

/**
 *
 * @author Gabi
 */
public interface sportCenterService {
    
    public sportCenterEntity createNewCenter();
   
    public String calculateAreaAndVolume(sportCenterEntity newCenter);
    
    
}
