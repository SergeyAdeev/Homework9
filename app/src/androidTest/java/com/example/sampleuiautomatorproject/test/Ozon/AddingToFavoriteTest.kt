package com.example.sampleuiautomatorproject.test.Ozon

import com.example.sampleuiautomatorproject.util.byStringRes
import org.junit.Test

class AddingToFavoriteTest : OzonTest() {

    private val menuFavoritesSelector = byStringRes("ru.ozon.app.android:id/menu_favorites")

    @Test
    fun addToFavorite() = with(app) {
        open()
        mainPage.clickSearch()
        search.typeToSearch(searchText)
        productInfo.clickResult()
        productPage.clickAddToFavorite()
        bottomNavigation.goToPage(menuFavoritesSelector)
        toolbar.checkToolbar(toolbarName)
        favoritesPage.checkProduct(productTitle)
    }
}