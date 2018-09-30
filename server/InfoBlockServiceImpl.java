package com.mySampleApplication.MyOpenProject.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.MyOpenProject.client.infoblock.IbSerializable;
import com.mySampleApplication.MyOpenProject.client.interfaces.InfoBlockService;

import java.util.ArrayList;

public class InfoBlockServiceImpl extends RemoteServiceServlet implements InfoBlockService {
    @Override
    public ArrayList<IbSerializable> getSubInfoBlocks(String id, String type) {
        System.out.println("Hey");
    return null;
    }
}
