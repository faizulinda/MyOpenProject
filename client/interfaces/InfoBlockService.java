package com.mySampleApplication.MyOpenProject.client.interfaces;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.mySampleApplication.MyOpenProject.client.infoblock.IbSerializable;

import java.util.ArrayList;

@RemoteServiceRelativePath("infoBlock")
public interface InfoBlockService extends RemoteService {
    ArrayList<IbSerializable> getSubInfoBlocks(String id, String type);

}
