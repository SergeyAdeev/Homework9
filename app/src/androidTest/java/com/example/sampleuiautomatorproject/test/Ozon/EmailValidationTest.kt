package com.example.sampleuiautomatorproject.test.Ozon

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.util.byStringRes
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EmailValidationTest : OzonTest() {

    private val menuProfileSelector = byStringRes("ru.ozon.app.android:id/menu_profile")

    @Test
    fun checkEmailValidation() = with(app) {
        open()
        bottomNavigation.goToPage(menuProfileSelector)
        profilePage.clickEmailLogin()
        profilePage.setEmail("WrongEmail")
        profilePage.clickEnterButton()
        profilePage.checkHintWrongEmail()
        profilePage.setEmail("adeev96@mail.ru")
        profilePage.clickEnterButton()
        profilePage.checkHintCorrectEmail()
    }
}