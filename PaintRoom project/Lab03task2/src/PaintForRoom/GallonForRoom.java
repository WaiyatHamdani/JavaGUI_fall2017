/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintForRoom;

/**
 *
 * @author waiya
 */
public class GallonForRoom {
    private double width,length, height;
    private final double window=12;
    private final double door = 21;
    private double AmountDoor,AmountWindow;
    GallonForRoom(double height, double width, double length,double AmountWindow, double AmountDoor) {
    this.width = width;
    this.length = length;
    this.height= height;
    this.AmountWindow = AmountWindow;
    this.AmountDoor = AmountDoor;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getAmountWindow() {
        return AmountWindow*window;
    }

    public void setAmountWindow(double AmountWindow) {
        this.AmountWindow = AmountWindow;
    }

    public double getAmountDoor() {
        return AmountDoor*door;
    }

    public void setAmountDoor(double AmountDoor) {
        this.AmountDoor = AmountDoor;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }
  public double getWindow() {
        return window;
    }

    public double getDoor() {
        return door;
    }
    public void setHeight(double height) {
        this.height = height;
    }
 public double getRoomVolume(){
    return length*width*height;
    
    }
 
 public double getGallonPerRoom(){
     return (getRoomVolume()/120)-getAmountWindow()-getAmountDoor();
       
    }
 }


