package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class CheckingRegistrationTest : OzonTest() {

    @Test
    fun checkRegistration() = with(app) {
        open()
        mainPage.clickSearch()
        search.typeToSearch(searchText)
        productInfo.clickResult()
        productPage.scrollToWriteReviewButton()
        productPage.clickWriteReviewButton()
        profilePage.checkTitle("Вход или регистрация")
    }
}