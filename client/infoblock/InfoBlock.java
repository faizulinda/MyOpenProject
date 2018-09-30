package com.mySampleApplication.MyOpenProject.client.infoblock;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mySampleApplication.MyOpenProject.client.interfaces.InfoBlockService;
import com.mySampleApplication.MyOpenProject.client.interfaces.InfoBlockServiceAsync;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class InfoBlock implements Info {
    String id;
    String name;
    String type;
    String description;
    String image;
    ArrayList<Integer> listId;
    Map<String, InfoBlock> infoblocks;

    public InfoBlock(String id, String name, String type, String description, String image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.image = image;
    }

    @Override
    public Map<String, InfoBlock> downloadSubIB(String type, String id) {
        ArrayList<IbSerializable> infoblocksResult = new ArrayList<>();
        InfoBlockServiceAsync svc = GWT.create(InfoBlockService.class);

        AsyncCallback<List<IbSerializable>> callback = new AsyncCallback<List<IbSerializable>>() {
            @Override
            public void onFailure(Throwable caught) {

            }

            @Override
            public void onSuccess(List<IbSerializable> result) {
                for (IbSerializable data : result){
                    infoblocks.put(data.getNumber(), InfoBlockBuilder.generateIB(data));
                }
            }
        };

        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Integer> getListId() {
        return listId;
    }

    public void setListId(ArrayList<Integer> listId) {
        this.listId = listId;
    }

    public Map<String, InfoBlock> getInfoblocks() {
        return infoblocks;
    }

    public void setInfoblocks(Map<String, InfoBlock> infoblocks) {
        this.infoblocks = infoblocks;
    }
}