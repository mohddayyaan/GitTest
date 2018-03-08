package com.mohddayyaan.testlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by think360 on 08/03/18.
 */

public class TestToast {
  public   static void v(Context ctx,String msg){
        Toast.makeText(ctx,msg,Toast.LENGTH_SHORT).show();
    }
}
