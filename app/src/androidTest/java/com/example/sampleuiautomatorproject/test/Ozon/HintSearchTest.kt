package com.example.sampleuiautomatorproject.test.Ozon

import org.junit.Test

class HintSearchTest : OzonTest() {

    @Test
    fun hintSearch() = with(app) {
        open()
        mainPage.clickSearch()
        search.typeToSearch(searchText)
        productInfo.checkPrice(price)
        productInfo.checkTitle(productTitle)
    }
}