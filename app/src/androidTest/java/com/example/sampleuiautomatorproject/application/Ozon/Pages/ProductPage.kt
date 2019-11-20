package com.example.sampleuiautomatorproject.application.Ozon.Pages

import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class ProductPage {

    private val writeReviewButtonSelector = byStringRes("ru.ozon.app.android:id/writeReviewBtn")
    private val widgetSelector = byStringRes("ru.ozon.app.android:id/galleryVp")
    private val imageAddToFavoriteSelector = byStringRes("ru.ozon.app.android:id/favoritesIv")

    fun clickAddToFavorite() {
        if (widgetSelector.waitFindObject().isEnabled) {
            imageAddToFavoriteSelector.waitFindObject().click()
        }
    }

    fun scrollToWriteReviewButton() {
        val productList = UiScrollable(UiSelector().scrollable(true))
        productList.scrollTextIntoView("Написать отзыв")
    }

    fun clickWriteReviewButton() {
        writeReviewButtonSelector.waitFindObject().clickAndWaitnewWindow()
    }
}