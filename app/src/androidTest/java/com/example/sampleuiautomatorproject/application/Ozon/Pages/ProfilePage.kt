package com.example.sampleuiautomatorproject.application.Ozon.Pages

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse

open class ProfilePage {

    private val emailLoginButtonSelector = byText("Войти по почте")
    private val emailEditTextSelector = byStringRes("ru.ozon.app.android:id/emailEt")
    private val emailInputHintSelector = byStringRes("ru.ozon.app.android:id/textinput_error")
    private val enterButtonSelector = byStringRes("ru.ozon.app.android:id/submitBtn")
    private val titleSelector: BySelector = byStringRes("ru.ozon.app.android:id/titleTv")


    fun clickEmailLogin() {
        emailLoginButtonSelector.waitFindObject().click()
    }

    fun checkTitle(title: String) {
        assertEquals(
            "Title hint is wrong",
            title,
            titleSelector.waitFindObject().text
        )
    }

    fun setEmail(email: String) {
        emailEditTextSelector.waitFindObject().text = email
    }

    fun checkHintWrongEmail() {
        //TODO repair this method
        assertEquals(
            "Подсказка Email не совпадает",
            "Некорректный формат почты",
            emailInputHintSelector.waitFindObject().text
        )
    }

    fun checkHintCorrectEmail() {
        assertFalse(
            "Подсказка Email не должна присутствовать",
            emailEditTextSelector.waitFindObject().parent.parent.hasObject(emailInputHintSelector)
        )
    }

    fun clickEnterButton() {
        enterButtonSelector.waitFindObject().click()
    }
}