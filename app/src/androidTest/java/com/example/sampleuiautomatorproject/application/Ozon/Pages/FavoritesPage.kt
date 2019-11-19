package com.example.sampleuiautomatorproject.application.Ozon.Pages

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.application.Ozon.Ozon
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert


class FavoritesPage : Ozon() {

    private val titleHintSelector: BySelector = byStringRes("ru.ozon.app.android:id/titleTv")

    fun checkProduct() {
        Assert.assertEquals(
            "Подсказка названия не совпадает",
            "Философия Java",
            titleHintSelector.waitFindObject().text
        )
    }

}