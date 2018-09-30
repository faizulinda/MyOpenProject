package com.mySampleApplication.MyOpenProject.client.interfaces;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mySampleApplication.MyOpenProject.client.infoblock.IbSerializable;

import java.util.ArrayList;

public interface InfoBlockServiceAsync {
    void getSubInfoBlocks(String id, String type, AsyncCallback<ArrayList<IbSerializable>> async);
}
