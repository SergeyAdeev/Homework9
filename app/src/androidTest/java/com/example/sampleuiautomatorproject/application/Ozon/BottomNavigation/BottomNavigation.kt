package com.example.sampleuiautomatorproject.application.Ozon.BottomNavigation

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class BottomNavigation {

    private val menuProfileSelector = byStringRes("ru.ozon.app.android:id/menu_profile")
    private val menuFavoritesSelector = byStringRes("ru.ozon.app.android:id/menu_favorites")

    fun goToFavorites() {
        menuFavoritesSelector.waitFindObject().clickAndWaitnewWindow()
    }

    fun goToProfile() {
        menuProfileSelector.waitFindObject().clickAndWaitnewWindow()
    }
}