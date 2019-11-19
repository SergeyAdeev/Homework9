package com.example.sampleuiautomatorproject.util

import androidx.test.uiautomator.By

fun byStringRes(stringRes: String) = By.res(stringRes)

fun byText(text: String) = By.text(text)

fun byClazz(clazz: String) = By.clazz(clazz)