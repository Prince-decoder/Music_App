package com.bank.musicapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navcontroller: NavController, viewModel: MainViewModel, modifier: PaddingValues)
{
    NavHost(navController = navcontroller as NavHostController,
        startDestination = Screens.BottomScreen.Home.bRoute)
    {

        composable(Screens.BottomScreen.Home.bRoute)
        {
            Homepage(Modifier.padding(modifier))
        }
        composable(Screens.BottomScreen.Library.bRoute)
        {
            LibPage(Modifier.padding(modifier))
        }
        composable(Screens.BottomScreen.Browse.bRoute)
        {
            BrowsePage(modifier = Modifier.padding(modifier))
        }

        composable(Screens.DrawerScreen.Account.Route)
        {
            AccountPage(Modifier.padding(modifier))
        }

        composable(Screens.DrawerScreen.AddAccount.Route)
        {
            val di = remember { mutableStateOf(true) }
            AddAcc(di)
        }

        composable(Screens.DrawerScreen.Subscription.Route) {
            SubPage(modifier = Modifier.padding(modifier))
        }
    }
}