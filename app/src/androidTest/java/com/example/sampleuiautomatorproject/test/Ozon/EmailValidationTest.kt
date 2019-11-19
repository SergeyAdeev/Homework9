package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class EmailValidationTest : OzonTest() {

    @Test
    fun checkEmailValidation() = with(app) {
        open()
        bottomNavigation.goToProfile()
        profilePage.clickEmailLogin()
        //TODO repair this method
        //setEmail("WrongEmail")
        //setPassword("password")
        //clickEnterButton()
        //checkHintWrongEmail()
        //setEmail("adeev96@mail.ru")
        //setPassword("password")
        //clickEnterButton()
        //checkHintCorrectEmail()
    }
}