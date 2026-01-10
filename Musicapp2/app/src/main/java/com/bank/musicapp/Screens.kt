package com.bank.musicapp

import androidx.annotation.DrawableRes

sealed class Screens(val Title: String,val Route: String) {

    sealed class BottomScreen(val bTitle : String, val bRoute: String ,@DrawableRes val icon: Int):
        Screens(bTitle,bRoute){
            object Home:BottomScreen("Home","home",R.drawable.outline_home_24)

        object Library : BottomScreen("Library","library",R.drawable.outline_library_music_24)

        object Browse: BottomScreen("Browse","browse",R.drawable.outline_feature_search_24)
        }

    sealed class DrawerScreen(val dtitle:String, val dRoute:String, @DrawableRes val icon: Int)
        :Screens(dtitle,dRoute)
    {
            object Account: DrawerScreen("Account","account",R.drawable.outline_account_circle_24)
            object Subscription: DrawerScreen("Subscription","subsciption",R.drawable.outline_subscriptions_24)
            object AddAccount: DrawerScreen("Add Account","addaccount",R.drawable.outline_person_add_24)
        }

}

val optionInBottom = listOf(
    Screens.BottomScreen.Home,
    Screens.BottomScreen.Browse,
    Screens.BottomScreen.Library
)

val options = listOf(
    Screens.DrawerScreen.Account,
    Screens.DrawerScreen.AddAccount,
    Screens.DrawerScreen.Subscription
)