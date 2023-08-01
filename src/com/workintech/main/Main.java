package com.workintech.main;

import com.workintech.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Yigit's",new Wall("north"),new Wall("south"),new Wall("east"),
                new Wall("west"),new Ceiling(5, PaintColor.RED),new Bed("double",2,2,1,1),
                new Lamp(LampType.BEDSIDE_LAMP,false,100),new Wardrobe(3,2,100),
                new Carpet(5,5,PaintColor.BLUE));
        bedroom.getCarpet().lying();
        System.out.println(bedroom.getBed().getHeight());
        bedroom.getLamp().turnOn();
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        b
    }
}