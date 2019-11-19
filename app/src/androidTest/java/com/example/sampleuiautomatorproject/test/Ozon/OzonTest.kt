package com.example.sampleuiautomatorproject.test.Ozon

import com.example.sampleuiautomatorproject.application.Ozon.BottomNavigation.BottomNavigation
import com.example.sampleuiautomatorproject.application.Ozon.Ozon
import com.example.sampleuiautomatorproject.application.Ozon.Pages.FavoritesPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.MainPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProductPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProfilePage
import com.example.sampleuiautomatorproject.application.Ozon.SearchActivity
import com.example.sampleuiautomatorproject.application.Ozon.Toolbar.Toolbar
import com.example.sampleuiautomatorproject.test.AbstractApplicationTest

abstract class OzonTest : AbstractApplicationTest<Ozon>(Ozon()) {

    val mainPage = MainPage()
    val productPage = ProductPage()
    val favoritesPage = FavoritesPage()
    val profilePage = ProfilePage()
    val bottomNavigation = BottomNavigation()
    val toolbar = Toolbar()
    val searchActivity = SearchActivity()
}