package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class HintSearchTest : OzonTest() {

    @Test
    fun hintSearch() = with(app) {
        open()
        mainPage.clickSearch()
        searchActivity.typeToSearch("философия java")
        searchActivity.checkHintPrice()
        searchActivity.checkHintTitle()
    }
}