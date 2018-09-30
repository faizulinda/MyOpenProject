package com.mySampleApplication.MyOpenProject.client.view;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.mySampleApplication.MyOpenProject.client.infoblock.InfoBlock;

public class InfoBlockHandler implements ClickHandler {
    InfoBlock ib;
    public InfoBlockHandler(InfoBlock ib) {
        this.ib = ib;
    }

    @Override
    public void onClick(ClickEvent event) {
        ib.downloadSubIB(ib.getType(), ib.getId());
    }
}
