package com.example.sampleuiautomatorproject.application.Ozon.Pages

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class MainPage {

    private val imageMainPageSelector = byStringRes("ru.ozon.app.android:id/imageView")
    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")

    fun loadContent() {
        imageMainPageSelector.waitFindObject()
    }

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }
}