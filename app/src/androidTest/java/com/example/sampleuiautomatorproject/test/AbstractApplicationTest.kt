package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.AbstractApplication

abstract class AbstractApplicationTest<T : AbstractApplication>(val app : T) {

//    @Before
//    fun assertPackageInstalled() {
//        app.assertInstalled()
//    }
//
//    @Before
//    fun clearCache() {
//        device.executeShellCommand("pm clear ${app.packageName}")
//        Log.d("Selector", "Cache clear")
//    }
}
