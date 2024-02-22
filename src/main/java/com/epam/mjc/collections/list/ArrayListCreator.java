package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        int counter = 0;
        for(String s : sourceList) {
            counter++;
            if(counter % 3 == 0) {
                result.add(s);
                result.add(s);
            }
        }
        return result;
    }
}
