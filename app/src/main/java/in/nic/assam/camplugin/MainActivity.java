package in.nic.assam.camplugin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.nic.assam.camgeoplugin.CamGeoPlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CamGeoPlugin cp = new CamGeoPlugin();
        cp.testplugin(this, "CamPlugin is working !!");
    }
}