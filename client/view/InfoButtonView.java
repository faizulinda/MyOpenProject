package com.mySampleApplication.MyOpenProject.client.view;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.mySampleApplication.MyOpenProject.client.infoblock.InfoBlock;

public class InfoButtonView extends VerticalPanel
{
    Label name;
    Label image;
    InfoBlock ib;

    public InfoButtonView(InfoBlock ib){



        this.ib = ib;

        initialWidgets(ib);
        super.add(name);
        super.add(image);
    }

    private void initialWidgets(InfoBlock ib) {
        name = new Label(ib.getName());
        image = new Label(ib.getImage());
    }

}
