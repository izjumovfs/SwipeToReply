package com.capybaralabs.swipetoreply;

import android.content.Context;

public class DimensionUtils {


    public static int getDP(float toDP, Context context){
        if (toDP == 0){
            return 0;
        } else{
            float density = context.getResources().getDisplayMetrics().density;
            return (int) Math.ceil((density * toDP));
        }
    }

}
