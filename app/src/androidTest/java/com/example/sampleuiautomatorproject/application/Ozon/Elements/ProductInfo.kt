package com.example.sampleuiautomatorproject.application.Ozon.Elements

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert

class ProductInfo {

    private val priceSelector = byStringRes("ru.ozon.app.android:id/priceTv")
    private val titleSelector: BySelector = byStringRes("ru.ozon.app.android:id/titleTv")

    fun checkPrice(price: String) {
        Assert.assertEquals(
            "Price hint is wrong",
            price,
            priceSelector.waitFindObject().text
        )
    }

    fun checkTitle(title: String) {
        Assert.assertEquals(
            "Title hint is wrong",
            title,
            priceSelector.waitFindObject().parent.findObject(titleSelector).text
        )
    }

    fun clickResult() {
        priceSelector.waitFindObject().parent.clickAndWaitnewWindow()
    }
}