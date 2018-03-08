package com.dayyaan.gittest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by think360 on 21/02/18.
 */

public class CustomReceiver extends BroadcastReceiver {
    private Context ctx;
    public CustomReceiver(Context ctx) {
        super();
        this.ctx = ctx;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
         Toast.makeText(ctx.getApplicationContext(),"Braodcast",Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }
}
