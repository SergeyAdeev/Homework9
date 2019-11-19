package com.example.sampleuiautomatorproject.test.Ozon

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.Ozon.BottomNavigation.BottomNavigation
import com.example.sampleuiautomatorproject.application.Ozon.Elements.ProductInfo
import com.example.sampleuiautomatorproject.application.Ozon.Elements.Search
import com.example.sampleuiautomatorproject.application.Ozon.Ozon
import com.example.sampleuiautomatorproject.application.Ozon.Pages.FavoritesPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.MainPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProductPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProfilePage
import com.example.sampleuiautomatorproject.application.Ozon.Toolbar.Toolbar
import com.example.sampleuiautomatorproject.test.AbstractApplicationTest
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class OzonTest : AbstractApplicationTest<Ozon>(Ozon()) {

    val mainPage = MainPage()
    val productPage = ProductPage()
    val favoritesPage = FavoritesPage()
    val profilePage = ProfilePage()

    val bottomNavigation = BottomNavigation()
    val toolbar = Toolbar()

    val search = Search()
    val productInfo = ProductInfo()

    val searchText = "философия java"
    val toolbarName = "Избранное"
    val productTitle = "Философия Java"
    val price = "1 499 \u20BD"

    //TODO All tests in one class

    //TODO Repair Before for EmailValidationTest

    //TODO open + search in one method for 3 tests
}