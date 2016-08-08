package com.jonesun.library;

/**
 * Created by jone.sun on 2016/8/8.
 */

public interface TestInterface {
    /***
     * 将时间戳转换成日期
     * @param dateFormat
     * @param timeStamp
     * @return
     */
    String getDateFromTimeStamp(String dateFormat, long timeStamp);
}
