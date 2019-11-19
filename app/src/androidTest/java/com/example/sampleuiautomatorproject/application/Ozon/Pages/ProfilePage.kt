package com.example.sampleuiautomatorproject.application.Ozon.Pages

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull

open class ProfilePage {

    //private val emailLoginButtonSelector = byClazz("android.widget.TextView")
    //TODO Make byDesc
    private val emailLoginButtonSelector = byText("Войти по почте")

    private val emailLoginViewButtonSelector =
        byStringRes("ru.ozon.app.android:id/enterByEmailTv")

    private val emailTextViewSelector = byStringRes("ru.ozon.app.android:id/emailEt")
    private val emailInputHintSelector = byStringRes("ru.ozon.app.android:id/textinput_error")
    private val passwordEditTextSelector = byStringRes("ru.ozon.app.android:id/passwordEt")

    private val enterButtonSelector = byStringRes("ru.ozon.app.android:id/enterTv")

    fun clickEmailLogin() {
        emailLoginButtonSelector.waitFindObject().clickAndWaitnewWindow()
    }

    fun setEmail(email: String) {
        emailTextViewSelector.waitFindObject().parent.parent.text = email
    }

    fun checkHintWrongEmail() {
        //TODO repair this method
        assertEquals(
            "Подсказка Email не совпадает",
            "Некорректный формат почты",
            emailTextViewSelector.waitFindObject().parent.parent.findObject(emailInputHintSelector).text
        )
    }

    fun clickEnterButton() {

        enterButtonSelector.waitFindObject().click()
    }

    fun checkHintCorrectEmail() {
        assertNull(
            "Подсказка Email не должна присутствовать",
            emailTextViewSelector.waitFindObject().parent.parent.findObject(emailInputHintSelector).text
        )
    }

    fun setPassword(password: String) {
        passwordEditTextSelector.waitFindObject().text = password
    }
}