package Lection4;

import java.util.*;

/**
 * Created by bondar on 4/3/2015.
 * Создать словарь (Map<String, String>) занести в него десять записей по
 принципу «фамилия» — «имя».
 Удалить людей, имеющих одинаковые имена.
 */
public class Task03 {
    public static void main(String[] args) {
        String[][] myArray = new String[10][2];
        Map<String, String> mapData = new HashMap<String, String>();
        mapData.putIfAbsent("Surname", "Name");
        mapData.putIfAbsent("Surname2", "Name2");
        mapData.putIfAbsent("Surname3", "Name3_Unique");
        mapData.putIfAbsent("Surname4", "Name4");
        mapData.putIfAbsent("Surname5", "Name");
        mapData.putIfAbsent("Surname6", "Name2");
        mapData.putIfAbsent("Surname7", "Name2");
        mapData.putIfAbsent("Surname8", "Name4");
        mapData.putIfAbsent("Surname9", "NameUnique");
        mapData.putIfAbsent("Surname10", "AnotherUniqueName");

        System.out.println(mapData.toString());
        Set<String> mapKeys = mapData.keySet();
        ArrayList<String> keysToBeRemoved = new ArrayList<String>();

        //here we create list of keys that should be removed from the map
        for (int i = 0; i < mapKeys.toArray().length; i++){
            int valuesCount = 0;
            String currentValue = mapData.get(mapKeys.toArray()[i]);
            for (String value: mapData.values()) {//check if name is present multiple times
                if (value.equals(mapData.get(mapKeys.toArray()[i]))) valuesCount++;
            }

            if (valuesCount > 1){
                keysToBeRemoved.add(mapKeys.toArray()[i].toString());//create arraylist of keys that should be removed from map
            }
        }

        //here we remove keys from the map
        for (int i = 0; i < keysToBeRemoved.size(); i++){//remove entries from map via existing key list
            mapData.remove(keysToBeRemoved.get(i));
        }
        System.out.println(mapData);
    }
}
