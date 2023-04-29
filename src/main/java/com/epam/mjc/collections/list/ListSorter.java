package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int parsedA = Integer.parseInt(a);
        int parsedB = Integer.parseInt(b);

        int ya = 5 * ((int) Math.pow(parsedA, 2)) + 3;
        int yb = 5 * ((int) Math.pow(parsedB, 2)) + 3;

        if (ya > yb) {
            return 1;
        } else if (ya == yb) {
            if (parsedA > parsedB) {
                return 1;
            } else if (parsedA == parsedB) {
                return 0;
            }

            return -1;
        }

        return -1;
    }
}
