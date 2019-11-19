package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class CheckingRegistrationTest : OzonTest() {

    @Test
    fun checkRegistration() = with(app) {
        open()
        mainPage.clickSearch()
        searchActivity.typeToSearch("философия java")
        searchActivity.clickResult()
        //TODO finish this method
        productPage.scrollToWriteReviewButton()
    }
}