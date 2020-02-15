package io.zipcoder;


import java.util.*;
import java.util.List;


public class Music {

    private String[] playList;

    List<String> playList1;

    public Music(String[] playList) {

        this.playList1 = Arrays.asList(playList);
    }

    public Integer selection(Integer startIndex, String selection) {

        int c = 0;
        int d = 0;
        int e = 0;
        int len = playList1.size();

        c = playList1.indexOf(selection) - startIndex;
        d = playList1.lastIndexOf(selection) - playList1.indexOf(selection);
        e = (len - 1) - playList1.lastIndexOf(selection);

        int sum2 = startIndex + e + d;

        if (c <= sum2)
        {
            return c;
        }

        else

            return startIndex + e + 1;

    }
}