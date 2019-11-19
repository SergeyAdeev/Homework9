package com.example.sampleuiautomatorproject.application.Ozon.Toolbar

import com.example.sampleuiautomatorproject.util.byClazz
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert

class Toolbar {

    private val toolbarSelector = byStringRes("ru.ozon.app.android:id/toolbarTb")
    private val favoritesTextViewSelector = byClazz("android.widget.TextView")

    fun checkToolbar(toolbarName: String) {
        Assert.assertEquals(
            "Name of toolbar is wrong",
            toolbarName,
            toolbarSelector.waitFindObject().findObject(favoritesTextViewSelector).text
        )
    }
}