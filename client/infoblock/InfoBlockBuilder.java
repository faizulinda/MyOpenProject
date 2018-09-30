package com.mySampleApplication.MyOpenProject.client.infoblock;

public class InfoBlockBuilder {


    public static InfoBlock generateIB(IbSerializable ibSerializable){
        InfoBlock ib = null;
        String id = ibSerializable.getId();
        String name = ibSerializable.getName();
        String type = ibSerializable.getType();
        String description = ibSerializable.getDescription();
        String image = ibSerializable.getImage();
        switch (type){
            case "course":{
                ib = new Course(id, name, type, description, image);
                break;
            }
            case "lesson":{
                ib = new Lesson(id, name, type, description, image);
                break;
            }
            case "picture":{
                ib = new Picture(id, name, type, description, image, ibSerializable.getSize(), ibSerializable.getColor());
                break;
            }
        }

        return ib;
    }

}
