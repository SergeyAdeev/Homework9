package com.example.sampleuiautomatorproject.application.Ozon.Elements

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class Search {

    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }
}