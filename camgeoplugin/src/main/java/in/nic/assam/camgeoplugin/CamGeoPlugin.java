package in.nic.assam.camgeoplugin;

import android.content.Context;
import android.widget.Toast;

public class CamGeoPlugin {
    public void testplugin(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
