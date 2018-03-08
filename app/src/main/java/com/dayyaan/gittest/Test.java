package com.dayyaan.gittest;

import android.util.Log;

/**
 * Created by think360 on 21/02/18.
 */

public class Test {
    public static void main(String[] args) {
        p(0);
    }

    private static int p(int count) {
        Log.e("TAG", "p: 15>>>" + count);
           if(count<100){
               return p(count+1);
           }else{
               return p(0);
           }



        }
}
