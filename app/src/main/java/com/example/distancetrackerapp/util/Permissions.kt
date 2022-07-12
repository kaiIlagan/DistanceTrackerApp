package com.example.distancetrackerapp.util

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.distancetrackerapp.util.Constants.PERMISSION_LOCATION_REQUEST_CODE
import com.vmadalin.easypermissions.EasyPermissions

object Permissions {

    fun hasLocationPermission(context: Context) =
        EasyPermissions.hasPermissions(
            context,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )


    fun requestLocationPermission(fragment: Fragment){
        EasyPermissions.requestPermissions(
            fragment,
            "This application cannot work without Location Permission",
            PERMISSION_LOCATION_REQUEST_CODE,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )
    }
}