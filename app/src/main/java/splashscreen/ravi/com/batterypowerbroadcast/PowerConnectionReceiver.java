package splashscreen.ravi.com.batterypowerbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ravi on 17-11-2017.
 */

public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)) {
            Toast.makeText(context, "The device is charging", Toast.LENGTH_SHORT).show();
        } else {
            intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED);
            Toast.makeText(context, "The device is not charging", Toast.LENGTH_SHORT).show();
        }
    }
}
