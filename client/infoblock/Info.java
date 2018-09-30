package com.mySampleApplication.MyOpenProject.client.infoblock;

import java.util.Map;

public interface Info {

    Map<String, InfoBlock> downloadSubIB(String type, String id);

}
