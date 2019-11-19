package com.example.sampleuiautomatorproject.application.Ozon.BottomNavigation

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class BottomNavigation {

    fun goToPage(menuPageSelector: BySelector) {
        menuPageSelector.waitFindObject().clickAndWaitnewWindow()
    }
}