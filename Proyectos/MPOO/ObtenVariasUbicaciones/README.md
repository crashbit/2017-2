# Obtiene la ubicación del gps por cada cambio que existe.
Son 4 archivos:

* MainActivity.java: Contiene toda la logica para usar el GPS y se agrego un bloque para checar los permisos del GPS.
* activity_main.xml: Muestra la información del GPS.
* AndroidManifest.xml: Contiene los permisos necesarios para utilizar el GPS
* myLocationListener.java: Contiene los metodos implemetados que solicita LocationListener al usarlo, esto nos permite tener nuestro GPS actualizado cada 30 segundos o bien cada cambio de 5 mestros
