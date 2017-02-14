package com.discry.struts2.actions.eleven_ognl_collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhoujp1 on 2017-01-13.
 */
public class OgnlAction {
    Map<String,String> maps = new HashMap<String, String>();

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public String execute(){
        maps.put("dd","doudou");
        maps.put("mm","miaomiao");
        maps.put("zhoujp","zhoujiaping");
        return "success";
    }
}
