package Lection4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bondar on 4/3/2015.
 * Создать словарь (Map<String, String>) занести в него десять записей по
 принципу «фамилия» — «имя».
 Удалить людей, имеющих одинаковые имена.
 */
public class Task03 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> nameSurnameMap= new ArrayList<HashMap<String, String>>();
        HashMap<String, String> mapData = new HashMap<String, String>();
        mapData.put("Name", "Surname");
        mapData.put("Name2", "Surname2");
        mapData.put("Name", "Surname3");
        nameSurnameMap.add(mapData);

        System.out.println(mapData.toString());
        System.out.println(nameSurnameMap);


        //find some more infor here. Intersting solution
    }
}
