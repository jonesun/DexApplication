package com.jonesun.plugin;

import com.jonesun.library.TestInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jone.sun on 2016/8/8.
 */

public class TestUtil implements TestInterface {
    @Override
    public String getDateFromTimeStamp(String dateFormat, long timeStamp) {
        DateFormat format = new SimpleDateFormat(dateFormat);
        Date date = new Date(timeStamp);
        return format.format(date);
    }
}
