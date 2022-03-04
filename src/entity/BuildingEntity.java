/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;
import service.BuildingService;

/**
 *
 * @author Gabi
 */
public abstract class BuildingEntity implements BuildingService {

    protected double width;
    protected double height;
    protected double length;

    public BuildingEntity(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public BuildingEntity() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "BuildingEntity{" + "width=" + width + ", height=" + height + ", length=" + length + '}';
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculateVolume();

}
