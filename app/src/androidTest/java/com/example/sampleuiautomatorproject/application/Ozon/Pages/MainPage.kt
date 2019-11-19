package com.example.sampleuiautomatorproject.application.Ozon.Pages

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class MainPage {
    //TODO Page Object

    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }
}