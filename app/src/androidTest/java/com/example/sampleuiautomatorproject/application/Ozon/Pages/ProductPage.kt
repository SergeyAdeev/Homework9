package com.example.sampleuiautomatorproject.application.Ozon.Pages

import androidx.test.uiautomator.Direction
import com.example.sampleuiautomatorproject.application.Ozon.Ozon
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class ProductPage : Ozon() {

    private val writeReviewButtonSelector = byStringRes("ru.ozon.app.android:id/writeReviewBtn")
    private val widgetSelector = byStringRes("ru.ozon.app.android:id/galleryVp")
    private val imageAddToFavoriteSelector = byStringRes("ru.ozon.app.android:id/favoritesIv")
    private val recyclerViewSelector = byStringRes("ru.ozon.app.android:id/listRv")

    fun clickAddToFavorite() {
        if (widgetSelector.waitFindObject().isEnabled) {
            imageAddToFavoriteSelector.waitFindObject().click()
        }
    }

    fun scrollToWriteReviewButton() {
        writeReviewButtonSelector.waitFindObject().scroll(Direction.DOWN, 1f)
    }
}