package com.mySampleApplication.MyOpenProject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.mySampleApplication.MyOpenProject.client.infoblock.Course;
import com.mySampleApplication.MyOpenProject.client.infoblock.InfoBlock;
import com.mySampleApplication.MyOpenProject.client.view.InfoButtonView;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Button button = new Button("Click me");
        final Label label = new Label();
        InfoBlock ib = new Course("1", "Course 1", "course", "description 1", "image");
        InfoButtonView ibv = new InfoButtonView(ib);

        RootPanel.get("slot1").add(ibv);
        RootPanel.get("slot2").add(ibv);
    }

}
