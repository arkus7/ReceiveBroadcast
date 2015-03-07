package pl.e_arkus.recievebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RecieveBroadcast extends BroadcastReceiver {
    public RecieveBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Broadcast has been received!", Toast.LENGTH_LONG).show();
    }
}
