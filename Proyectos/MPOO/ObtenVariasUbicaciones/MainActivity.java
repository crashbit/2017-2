package com.example.crashbit.gps;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Generamos nuestros objetos que utilizaremos
    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazamos nuestros objetos con la vista
        texto = (TextView) findViewById(R.id.textView);
        boton = (Button) findViewById(R.id.button);

        //Ponemos a nuestro boton a escuchar los clicks
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckUserPermsions();
            }
        });
    }

    void obtenUbicacion(){

        myLocationListener myLocLis = new myLocationListener(this);
        LocationManager lm = (LocationManager)getSystemService(LOCATION_SERVICE);

        //Que escuche la ubicación cada 30 segundos o bien cada 5 metros
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 30, 5, myLocLis);

        //Obtenemos nuestra ultima ubicación y lo hacemos con el GPS
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        //Pasamos nuestra ubicación a la caiita de texto
        texto.setText("Lon: " + String.valueOf(location.getLatitude()) + " , Lat: " + String.valueOf(location.getLongitude()));



    }


    //Checamos permisos
    void CheckUserPermsions(){
        if ( Build.VERSION.SDK_INT >= 23){
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                    PackageManager.PERMISSION_GRANTED  ){
                requestPermissions(new String[]{
                                android.Manifest.permission.ACCESS_FINE_LOCATION},
                        REQUEST_CODE_ASK_PERMISSIONS);
                return ;
            }
        }

        obtenUbicacion();// init the contact list

    }
    //get acces to location permsion
    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;



    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    obtenUbicacion();// init the contact list
                } else {
                    // Permission Denied
                    Toast.makeText( this,"Denial Location" , Toast.LENGTH_SHORT)
                            .show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

}
