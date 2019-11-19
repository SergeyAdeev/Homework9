package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class AddingToFavoriteTest : OzonTest() {

    @Test
    fun addToFavorite() = with(app) {
        open()
        mainPage.clickSearch()
        searchActivity.typeToSearch("философия java")
        searchActivity.clickResult()
        productPage.clickAddToFavorite()
        bottomNavigation.goToFavorites()
        toolbar.checkToolbar()
        favoritesPage.checkProduct()
    }
}