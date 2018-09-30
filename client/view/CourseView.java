package com.mySampleApplication.MyOpenProject.client.view;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.mySampleApplication.MyOpenProject.client.infoblock.InfoBlock;

import java.util.Map;

public class CourseView extends VerticalPanel {

    InfoBlock ib;
    Label nameWidget = new Label();
    TextArea descriptionWidget = new TextArea();
    MyFlexTable infoBlockTable = new MyFlexTable();

    public CourseView(InfoBlock ib){
        this.ib = ib;

        initialWidgets();

        super.add(nameWidget);
        super.add(descriptionWidget);
        super.add(infoBlockTable);
    }

    private void initialWidgets() {
        nameWidget.setText(ib.getName());
        descriptionWidget.setText(ib.getDescription());
        infoBlockTable.initial(ib.getInfoblocks());
    }
}

class MyFlexTable extends FlexTable{
    //List<Integer> subInfoBlocksId = ib.getListId();

    public void initial(Map<String, InfoBlock> infoblocks){
        for (Map.Entry<String, InfoBlock> entry : infoblocks.entrySet()){
            InfoButtonView ibView = new InfoButtonView(entry.getValue());
            this.addClickHandler(new InfoBlockHandler(entry.getValue()));
            this.add(ibView);

        }
    }
}

