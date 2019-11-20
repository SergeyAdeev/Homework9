package com.example.sampleuiautomatorproject.application.Ozon.Pages

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert

class FavoritesPage {

    private val titleHintSelector: BySelector = byStringRes("ru.ozon.app.android:id/titleTv")

    fun checkProduct(productTitle: String) {
        Assert.assertEquals(
            "Title hint is wrong",
            productTitle,
            titleHintSelector.waitFindObject().text
        )
    }
}