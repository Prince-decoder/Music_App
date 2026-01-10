package com.bank.musicapp


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SideDrawer(
    onDrawItemClickAction: ()-> Unit
)
{
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val navcontroller = rememberNavController()
    val navBackstackentry by navcontroller.currentBackStackEntryAsState()
    val currentRoute = navBackstackentry?.destination?.route

    val viewModel: MainViewModel = viewModel()

    var title by remember { mutableStateOf("My App") }

    val currentScreen = remember { viewModel.currentScreen.value }
    val bottomBar:@Composable ()->Unit ={
        if(currentScreen is Screens.DrawerScreen || currentScreen == Screens.BottomScreen.Home)
        {
            BottomAppBar(Modifier.wrapContentSize().background(
                colorResource(R.color.Mytop)
            ))
            {
                optionInBottom.forEach {
                    NavigationBarItem(selected = currentScreen.Route == it.bRoute ,
                        onClick={navcontroller.navigate(it.bRoute)},
                        icon={
                            Icon(
                                painter = painterResource(it.icon),
                                contentDescription = it.bRoute)
                             }
                    , label = {
                        Text(it.bTitle)},
                        colors = NavigationBarItemDefaults.colors(unselectedIconColor = colorResource(R.color.Mytop),
                            selectedIconColor = Color.White)
                    )
                }
            }
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                LazyColumn(modifier = Modifier.padding(8.dp).fillMaxSize()) {
                    items(options){
                        Row(modifier = Modifier.fillMaxWidth().clickable(
                            onClick = {
                                if (it.Route == "account")
                                {

                                }
                                else
                                {
                                    navcontroller.navigate(it.dRoute)
                                    title = it.dtitle
                                }
                            scope.launch {
                                drawerState.close()
                            }
                        }).padding(8.dp)){
                                Icon(painter = painterResource(it.icon), it.dtitle)

                            Text(it.dtitle)
                        }
                    }
                }
            }
        }
    ){
        Scaffold(topBar = {toppbar(title = title,
            action = {scope.launch { drawerState.open()} })},
            bottomBar = bottomBar)
        {
            Navigation(navcontroller,viewModel,it)
        }
    }
}