package com.example.sampleuiautomatorproject.test.Ozon

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.Ozon.Ozon
import com.example.sampleuiautomatorproject.test.AbstractApplicationTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class OzonTest : AbstractApplicationTest<Ozon>(Ozon()) {

    private fun prepareForTest() = with(app) {
        //clearCache()
        open()
        mainPage.clickSearch()
        search.typeToSearch(searchText)
    }

    @Test
    fun hintSearch() = with(app) {
        prepareForTest()
        productInfo.checkPrice(price)
        productInfo.checkTitle(productTitle)
    }

    @Test
    fun addToFavorite() = with(app) {
        prepareForTest()
        productInfo.clickResult()
        productPage.clickAddToFavorite()
        bottomNavigation.goToPage(menuFavoritesSelector)
        toolbar.checkToolbar(toolbarName)
        favoritesPage.checkProduct(productTitle)
    }

    @Test
    fun checkRegistration() = with(app) {
        prepareForTest()
        productInfo.clickResult()
        productPage.scrollToWriteReviewButton()
        productPage.clickWriteReviewButton()
        profilePage.checkTitle(signInTitle)
    }

    @Test
    fun checkEmailValidation() = with(app) {
        open()
        mainPage.loadContent()
        bottomNavigation.goToPage(menuProfileSelector)
        profilePage.clickEmailLogin()
        profilePage.setEmail(wrongEmail)
        profilePage.clickEnterButton()
        profilePage.checkHintWrongEmail()
        profilePage.setEmail(correctEmail)
        profilePage.clickEnterButton()
        profilePage.checkHintCorrectEmail()
    }
}