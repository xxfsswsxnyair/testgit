package com.walnutin.step;

import android.text.format.Time;

public class Utils {

    
    /********** Time **********/
    
    public static long currentTimeInMillis() {
        Time time = new Time();
        time.setToNow();
        return time.toMillis(false);
    }
}
