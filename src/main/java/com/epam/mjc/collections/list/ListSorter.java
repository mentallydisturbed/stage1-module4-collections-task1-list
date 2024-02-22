package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int res = 0;
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            if(5 * x * x + 3 > 5 * y * y + 3) {
                res = 1;
            }else if(5 * x * x + 3 <= 5 * y * y + 3) {
                res = -1;
            }
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return res;
    }
}
