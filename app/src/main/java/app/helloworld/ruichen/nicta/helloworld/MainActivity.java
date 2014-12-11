package app.helloworld.ruichen.nicta.helloworld;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.*;

public class MainActivity extends FragmentActivity{
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.my_location_demo);

    }

    @Override
    protected void onResume(){
        mMap.setMyLocationEnabled(true);
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
    }

}
