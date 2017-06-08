package com.example.crashbit.gps;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by crashbit on 6/8/17.
 */

public class myLocationListener implements LocationListener {
    Context context;

    public myLocationListener(Context context){
        this.context = context;
    }


    @Override
    public void onLocationChanged(Location location) {
        String ubicacion = "Lon: " + String.valueOf(location.getLatitude()) + " , Lat: " + String.valueOf(location.getLongitude());

        Toast.makeText(context, ubicacion, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Toast.makeText(context, "El estado del GPS ha cambiado", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onProviderEnabled(String provider) {
        Toast.makeText(context, "El GPS esta habilitado", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderDisabled(String provider) {
        Toast.makeText(context, "El GPS esta deshabilitado", Toast.LENGTH_LONG).show();
    }
}
