package com.example.sampleuiautomatorproject.application.Ozon

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert

class SearchActivity {

    private val priceHintSelector = byStringRes("ru.ozon.app.android:id/priceTv")
    private val titleHintSelector: BySelector = byStringRes("ru.ozon.app.android:id/titleTv")
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")

    //TODO Make folder to temp activities
    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun checkHintPrice() {
        Assert.assertEquals(
            "Подсказка цены не совпадает",
            "1 499 \u20BD",
            priceHintSelector.waitFindObject().text
        )
    }

    fun checkHintTitle() {
        Assert.assertEquals(
            "Подсказка названия не совпадает",
            "Философия Java",
            priceHintSelector.waitFindObject().parent.findObject(titleHintSelector).text
        )
    }

    fun clickResult() {
        priceHintSelector.waitFindObject().parent.clickAndWaitnewWindow()
    }
}