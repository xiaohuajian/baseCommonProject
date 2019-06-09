package com.sjh.basecommon.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DataUtil {



    public static String formatDate_YYYYMMDD(Date date) {
        String template = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(template, Locale.getDefault());
        format.setTimeZone(TimeZone.getDefault());
        return format.format(date);
    }

    public static String formatDate_DDMMYYYY(Date date) {
        String template = "dd-MM-yyyy";
        SimpleDateFormat format = new SimpleDateFormat(template, Locale.getDefault());
        format.setTimeZone(TimeZone.getDefault());
        return format.format(date);
    }

}
