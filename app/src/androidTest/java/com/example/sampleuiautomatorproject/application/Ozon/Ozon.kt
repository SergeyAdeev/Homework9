package com.example.sampleuiautomatorproject.application.Ozon

import androidx.test.uiautomator.BySelector
import com.example.sampleuiautomatorproject.application.AbstractApplication
import com.example.sampleuiautomatorproject.application.Ozon.BottomNavigation.BottomNavigation
import com.example.sampleuiautomatorproject.application.Ozon.Elements.ProductInfo
import com.example.sampleuiautomatorproject.application.Ozon.Elements.Search
import com.example.sampleuiautomatorproject.application.Ozon.Pages.FavoritesPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.MainPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProductPage
import com.example.sampleuiautomatorproject.application.Ozon.Pages.ProfilePage
import com.example.sampleuiautomatorproject.application.Ozon.Toolbar.Toolbar
import com.example.sampleuiautomatorproject.util.byStringRes

class Ozon : AbstractApplication("ru.ozon.app.android") {

    val searchText = "философия java"
    val toolbarName = "Избранное"
    val productTitle = "Философия Java"
    val price = "1 499 \u20BD"
    val signInTitle = "Вход или регистрация"
    val wrongEmail = "WrongEmail"
    val correctEmail = "adeev96@mail.ru"

    val mainPage = MainPage()
    val productPage = ProductPage()
    val favoritesPage = FavoritesPage()
    val profilePage = ProfilePage()
    val bottomNavigation = BottomNavigation()
    val toolbar = Toolbar()
    val search = Search()
    val productInfo = ProductInfo()

    val menuFavoritesSelector: BySelector = byStringRes("ru.ozon.app.android:id/menu_favorites")
    val menuProfileSelector: BySelector = byStringRes("ru.ozon.app.android:id/menu_profile")
}