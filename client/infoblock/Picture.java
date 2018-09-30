package com.mySampleApplication.MyOpenProject.client.infoblock;

import java.util.ArrayList;

public class Picture extends InfoBlock {

    String size;
    String color;
    ArrayList<Area> areas;

    public Picture(String id, String name, String type, String description, String image, String size, String color) {
        super(id, name, type, description, image);

        this.size = size;
        this.color = color;

    }
}

